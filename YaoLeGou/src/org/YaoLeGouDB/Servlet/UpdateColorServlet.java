package org.YaoLeGouDB.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.YaoLeGouDB.Dao.ShopColorDao;
import org.YaoLeGouDB.Dao.ShopInfoDao;
import org.YaoLeGouDB.Impl.ShopColorDaoImpl;
import org.YaoLeGouDB.Impl.ShopInfoDaoImpl;
import org.YaoLeGouDB.entity.ShopInfo;
import org.YaoLeGouDB.utils.Tool;

import com.jspsmart.upload.File;
import com.jspsmart.upload.Files;
import com.jspsmart.upload.Request;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;

@WebServlet(urlPatterns={"/UpdateColor.do"})
public class UpdateColorServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*PrintWriter out = response.getWriter();*/
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");

		String State = request.getParameter("State");
		ShopInfoDao sid = new ShopInfoDaoImpl();
		if(State == null){
			
			String shopid = request.getParameter("shopid");
			ShopInfo si = sid.ByShopIdGetAllInfo(Integer.parseInt(shopid));
			
			request.setAttribute("si", si);
			request.getRequestDispatcher("UpdateColor.jsp").forward(request, response);
		}else if(State.equals("UpdateColorInfo")){
			
			
			SmartUpload smartUpload = new SmartUpload();
			smartUpload.setCharset("utf-8");
			smartUpload.initialize(this, request, response);
			try {
				smartUpload.upload();
			} catch (SmartUploadException e) {
				e.printStackTrace();
			}
			//Request可以通过这个获取表单里面的内容
			Request req = smartUpload.getRequest();
			
			String ColorName = req.getParameter("select");
			String shopid = req.getParameter("shopid");
			
			ShopColorDao sc = new ShopColorDaoImpl();
			
			
			Tool t = new Tool();
			Files files = smartUpload.getFiles();
    		File file= null;
    		for(int i =0;i<files.getCount();i++){
    			file = files.getFile(i);
    			try {
    				int ColorCount = sc.ByShopIdGetShopCountInfo(Integer.parseInt(shopid));
    				//往本地上传图片
    				file.saveAs("/attached/image/"+file.getFileName());

					//为文件名改名
					String ImagePath = t.UpdateShopColorInfo(file.getFileName(), Integer.parseInt(shopid),ColorCount);
					String tu = "attached/image/"+shopid+"_color_"+ColorCount+".jpg";
					ShopColorDao scd = new ShopColorDaoImpl();
					boolean is = scd.AddShopColorInfo(Integer.parseInt(shopid), ColorName, tu, tu);
					
				} catch (SmartUploadException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}
    		response.sendRedirect(request.getContextPath()+"/LeGou.do");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//default debug doGet() method
		doGet(request, response);
	}

}

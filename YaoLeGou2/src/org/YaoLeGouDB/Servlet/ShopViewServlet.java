	package org.YaoLeGouDB.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.YaoLeGouDB.Dao.ShopColorDao;
import org.YaoLeGouDB.Dao.ShopInfoDao;
import org.YaoLeGouDB.Dao.ShopMingXiDao;
import org.YaoLeGouDB.Dao.ShopTypeDao;
import org.YaoLeGouDB.Impl.ShopColorDaoImpl;
import org.YaoLeGouDB.Impl.ShopInfoDaoImpl;
import org.YaoLeGouDB.Impl.ShopMingXiDaoImpl;
import org.YaoLeGouDB.Impl.ShopTypeDaoImpl;
import org.YaoLeGouDB.entity.ShopInfo;
import org.YaoLeGouDB.entity.ShopType;
import org.YaoLeGouDB.entity.User;
import org.YaoLeGouDB.entity.UserInfo;
import org.YaoLeGouDB.utils.Tool;
import org.YaoLeGouDB.utils.pageBean;

@WebServlet(urlPatterns={"/ShopView.do","/ht/ShopView.do"})
public class ShopViewServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*PrintWriter out = response.getWriter();*/
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");

		String State = request.getParameter("State");
		if(State == null){
			User user = (User) request.getSession().getAttribute("user");
			//分页
			pageBean pb = new pageBean();
			ShopInfoDao sid = new ShopInfoDaoImpl();
			String page = request.getParameter("page");
			if(page != null && !page.equals("")){
				pb.setPageNo(Integer.parseInt(page));
			}
			
			
			String ShopName = request.getParameter("ShopName");
			String typeid = request.getParameter("ShopType");
			ShopInfo si = new ShopInfo();
			if(ShopName != null && !ShopName.equals("")){
				si.setShopname(ShopName);
			}
			if(typeid != null && !typeid.equals("0")){
				si.setShoptypeid(Integer.parseInt(typeid));
			}
			
			
			pb.setTotalCount(sid.ByShopTypeGetCount(si));
			pb.setPageSize(20);
			List<ShopInfo> siList = sid.GetUserInfoAllShop(pb.getPageNo(),pb.getPageSize(),user.getUsername(),si);
			
			ShopTypeDao tyd = new ShopTypeDaoImpl();
			List<ShopType> ShopTypeList = tyd.GetAllShopTypeInfo();
			
			if(typeid == null){
				typeid = "0";
			}
			request.setAttribute("pb", pb);
			request.setAttribute("UserName", user.getUsername());
			request.setAttribute("ShopName", ShopName);
			request.setAttribute("typeid", typeid);
			request.getSession().setAttribute("ShopTypeList", ShopTypeList);
			request.setAttribute("si", siList);
			request.getRequestDispatcher("/ShopView.jsp").forward(request, response);
		}else if(State.equals("del")){
			
			Tool t = new Tool();
			String id = request.getParameter("shopid");
			String UserName = request.getParameter("UserName");
			ShopInfoDao shid = new ShopInfoDaoImpl();
			
			ShopColorDao scd = new ShopColorDaoImpl();
			
			
			
			//循环删除颜色表里面的图片
			int Count = scd.ByShopIdGetCount(Integer.parseInt(id));
			for (int i = 1; i <= Count; i++) {
				t.DelColorImage(Integer.parseInt(id), i);
				scd.ByShopIdDelInfo(Integer.parseInt(id));
			}
			//删除明细表里面的图片
			ShopMingXiDao smxd = new ShopMingXiDaoImpl();
			int row = smxd.ByShopIdGetInfoCount(Integer.parseInt(id));
			for (int i = 0; i < row; i++) {
				t.DelMingXiImage(Integer.parseInt(id), i);
				smxd.ByShopIdDelInfo(Integer.parseInt(id));
			}
			
			boolean is = shid.ByIdAndUserNameDelShopInfo(Integer.parseInt(id), UserName);
			t.DelFegMian(id);
			if(is){
				response.sendRedirect(request.getContextPath()+"/ShopView.do?UserName="+UserName);
			}else{
				response.sendRedirect(request.getContextPath()+"/ShopView.do?UserName="+UserName);
			}
		}else if(State.equals("xiajia")){
			
			String shopid = request.getParameter("shopid");
			
			ShopInfoDao sid = new ShopInfoDaoImpl();
			boolean is = sid.ByShopidUpdateXiaJia(Integer.parseInt(shopid), 0);
			response.getWriter().print(is);
		}else if(State.equals("shangjia")){
			
			String shopid = request.getParameter("shopid");
			
			ShopInfoDao sid = new ShopInfoDaoImpl();
			boolean is = sid.ByShopidUpdateXiaJia(Integer.parseInt(shopid), 1);
			response.getWriter().print(is);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//default debug doGet() method
		doGet(request, response);
	}

}

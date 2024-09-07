package org.YaoLeGouDB.Servlet;
/**
 * ���µ�ǰ�˻���Servlet
 */

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.YaoLeGouDB.Dao.CityDao;
import org.YaoLeGouDB.Dao.DiTuDao;
import org.YaoLeGouDB.Dao.QuDao;
import org.YaoLeGouDB.Dao.ShengDao;
import org.YaoLeGouDB.Dao.UserDao;
import org.YaoLeGouDB.Dao.UserInfoDao;
import org.YaoLeGouDB.Impl.CityDaoImpl;
import org.YaoLeGouDB.Impl.DiTuDaoImpl;
import org.YaoLeGouDB.Impl.QuDaoImpl;
import org.YaoLeGouDB.Impl.ShengDaoImpl;
import org.YaoLeGouDB.Impl.UserDaoImpl;
import org.YaoLeGouDB.Impl.UserInfoDaoImpl;
import org.YaoLeGouDB.entity.City;
import org.YaoLeGouDB.entity.Qu;
import org.YaoLeGouDB.entity.Sheng;
import org.YaoLeGouDB.entity.User;
import org.YaoLeGouDB.entity.UserInfo;
import org.YaoLeGouDB.utils.Tool;

import com.alibaba.fastjson.JSON;
import com.jspsmart.upload.File;
import com.jspsmart.upload.Files;
import com.jspsmart.upload.Request;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;
@WebServlet(urlPatterns={"/UpdateInfo.do"})
public class UpdateInfoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*PrintWriter out = response.getWriter();*/
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");

		
		String State = request.getParameter("State");
		if(State == null){
			SmartUpload smartUpload = new SmartUpload();
			smartUpload.setCharset("utf-8");
			smartUpload.initialize(this, request, response);
			try {
				smartUpload.upload();
			} catch (SmartUploadException e) {
				e.printStackTrace();
			}
			//Request����ͨ�������ȡ�����������
			Request req = smartUpload.getRequest();
			
			String NameNick = req.getParameter("NameNick");
			String Name = req.getParameter("Name");
			String sex = req.getParameter("sex");
			String Phone = req.getParameter("Phone");
			String Email = req.getParameter("Email");
			String ChuShengRiQi = req.getParameter("ChuShengRiQi");
			String Address = req.getParameter("Address");
			String Address2 = req.getParameter("Address2");
			String content1 = req.getParameter("content1");
			String UserName = req.getParameter("UserName");
			
			//ҵ���� �п�

			UserInfo ui = new UserInfo();
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date d = null;
			try {
				d = sdf.parse(ChuShengRiQi);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			ui.setBirthday(d);
			ui.setAddress(Address);
			ui.setEmail(Email);
			ui.setJianjie(content1);
			ui.setName(Name);
			ui.setPhone(Phone);
			ui.setSexid(Integer.parseInt(sex));
			ui.setUsernick(NameNick);
			ui.setUsername(UserName);

			Tool t = new Tool();
			//ͷ���ļ�����
			Files files = smartUpload.getFiles();
			File file = files.getFile(0);
			if(file.isMissing()==false){
				try {
					
					t.DelImage(UserName);
					/**
					 * �����ش洢ͷ����Ƭ
					 */
					file.saveAs("/attached/TouXiang/"+file.getFileName());
					/**
					 * �����Ϊ�� ���ļ���
					 */
					String ImagePath = t.UpdatePathName(file.getFileName(), UserName);
					ui.setImage("attached/TouXiang/"+UserName+".jpg");					

				} catch (SmartUploadException e) {
					e.printStackTrace();
				}
			}
			//�������ݿ��ͷ��
			
			UserInfoDao uid = new UserInfoDaoImpl();
			uid.UpdateInfo(ui,Address2);
			
			String[] addr = Address.split(" ");
			
			DiTuDao dtd = new DiTuDaoImpl();
			boolean isok = dtd.Isexsts(addr[1]);
			if(isok){
				dtd.AddInfo(addr[1]);
			}
			
			
			response.sendRedirect("LeGou.do");
		}else if(State.equals("Select")){
			
			/**
			 * �������ʡ��id����id������Ӧ����
			 */
			String id = request.getParameter("text");
			ShengDao sd = new ShengDaoImpl();
			Sheng sheng = sd.ByNameGatInfo(id);
			int shengid = sheng.getShengid();
			
			CityDao cd = new CityDaoImpl();
			List<City> city = cd.ByShengIdGetAllInfo(shengid);
			String out = JSON.toJSONString(city);
			response.getWriter().print(out);
		}else if(State.equals("SelectQu")){
			
			String CityName = request.getParameter("text");
			CityDao cd = new CityDaoImpl();
			City city = cd.ByCityNameGetId(CityName);
			int cityid = city.getCityid();
			
			QuDao qd = new QuDaoImpl();
			List<Qu> qu = qd.ByCityIdGetAllInfo(cityid);
			for (Qu qu2 : qu) {
				System.out.println(qu2.getQuname());
			}
			String out = JSON.toJSONString(qu);
			response.getWriter().print(out);
		}else if(State.equals("UpdatePass")){
			
			User user = (User) request.getSession().getAttribute("user");
			String pass = request.getParameter("pass");
			UserDao ud = new UserDaoImpl();
			boolean is = ud.ByUserNameUpdatePass(user.getUsername(), pass);
			response.getWriter().print(is);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//default debug doGet() method
		doGet(request, response);
	}

}

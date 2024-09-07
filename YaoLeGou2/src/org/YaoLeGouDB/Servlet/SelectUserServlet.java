package org.YaoLeGouDB.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.YaoLeGouDB.Dao.UserDao;
import org.YaoLeGouDB.Dao.UserInfoDao;
import org.YaoLeGouDB.Impl.UserDaoImpl;
import org.YaoLeGouDB.Impl.UserInfoDaoImpl;
import org.YaoLeGouDB.entity.UserInfo;
import org.YaoLeGouDB.utils.Tool;
@WebServlet(urlPatterns={"/ht/SelectUser.do"})
public class SelectUserServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*PrintWriter out = response.getWriter();*/
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");

		UserInfoDao uid = new UserInfoDaoImpl();
		String State = request.getParameter("State");
		if(State == null){
			List<UserInfo> UserInfoList = uid.GetAllInfo();
			
			request.setAttribute("UserInfoList", UserInfoList);
			request.getRequestDispatcher("/ht/SelectUser.jsp").forward(request, response);
		}else if(State.equals("ty")){
			//停用
			String UserName = (String) request.getParameter("un");
			
			UserDao ud = new UserDaoImpl();
			ud.UpdateStateWei1(UserName);
		}else if(State.equals("qy")){
			//启用
			String UserName = (String) request.getParameter("un");
			
			UserDao ud = new UserDaoImpl();
			ud.UpdateStateWei0(UserName);
		}else if(State.equals("del")){
			
			String UserName = request.getParameter("UserName");
			
			UserDao ud = new UserDaoImpl();
			//删除User表
			ud.ByUserNameDelUserInfo(UserName);
			
			UserInfo ui = uid.ByUserNameGetInfo(UserName);
			//删除UserInfo表
			uid.ByUserNameDelUserInfo(UserName);
			Tool t = new Tool();
			t.DelUserInfoImage(ui.getImage());
			response.getWriter().print(true);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//default debug doGet() method
		doGet(request, response);
	}

}

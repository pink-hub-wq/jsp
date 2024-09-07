package org.YaoLeGouDB.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.YaoLeGouDB.Dao.LoginAdminDao;
import org.YaoLeGouDB.Dao.QuanXianDao;
import org.YaoLeGouDB.Impl.LoginAdminDaoImpl;
import org.YaoLeGouDB.Impl.QuanXianDaoImpl;
import org.YaoLeGouDB.entity.LoginAdmin;
@WebServlet(urlPatterns={"/ht/SelectAdmin.do"})
public class SelectAdminServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*PrintWriter out = response.getWriter();*/
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");

		String State = request.getParameter("State");
		LoginAdminDao lad = new LoginAdminDaoImpl();
		if(State == null){
			List<LoginAdmin> LoginAdminList = lad.GetAllInfo();
			
			request.setAttribute("LoginAdminList", LoginAdminList);
			request.getRequestDispatcher("/ht/SelectAdmin.jsp").forward(request, response);
		}else if(State.equals("ty")){
			
			String id = request.getParameter("id");
			lad.UpdateStateWei1(id);
		}else if(State.equals("qy")){
			String id = request.getParameter("id");
			lad.UpdateStateWei0(id);
		}else if(State.equals("del")){
			String UserName = request.getParameter("UserName");
			lad.ByUserNamedelInfo(UserName);
			QuanXianDao qx = new QuanXianDaoImpl();
			qx.ByUserNameDelInfo(UserName);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//default debug doGet() method
		doGet(request, response);
	}

}

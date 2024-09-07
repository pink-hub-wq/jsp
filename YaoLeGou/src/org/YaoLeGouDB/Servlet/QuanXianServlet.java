package org.YaoLeGouDB.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.YaoLeGouDB.Dao.QuanXianDao;
import org.YaoLeGouDB.Impl.QuanXianDaoImpl;
import org.YaoLeGouDB.entity.QuanXian;
@WebServlet(urlPatterns={"/ht/QuanXian.do"})
public class QuanXianServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*PrintWriter out = response.getWriter();*/
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");

		String State = request.getParameter("State");
		QuanXianDao qxd = new QuanXianDaoImpl();
		if(State == null){
			
			
			List<QuanXian> QuanXianlist = qxd.GetAllInfo();
			
			request.setAttribute("QuanXianlist", QuanXianlist);
			request.getRequestDispatcher("/ht/QuXian.jsp").forward(request, response);
		}else if(State.equals("update")){
			
			String UserName = request.getParameter("UserName");
			String weizhi = request.getParameter("weizhi");
			String stateid = request.getParameter("stateid");
			
			qxd.ByUserNameUpdateInfo(UserName, weizhi, stateid);
			
			
			response.sendRedirect(request.getContextPath()+"/ht/QuanXian.do");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//default debug doGet() method
		doGet(request, response);
	}

}

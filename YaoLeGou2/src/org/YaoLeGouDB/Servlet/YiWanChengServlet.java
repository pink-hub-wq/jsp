package org.YaoLeGouDB.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.YaoLeGouDB.Dao.DingDanBiaoDao;
import org.YaoLeGouDB.Impl.DingDanBiaoDaoImpl;
import org.YaoLeGouDB.entity.DingDanBiao;
@WebServlet(urlPatterns={"/YiWanCheng.do"})
public class YiWanChengServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*PrintWriter out = response.getWriter();*/
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		DingDanBiaoDao ddbd = new DingDanBiaoDaoImpl();
		String State = request.getParameter("State");
		if(State == null){
			String UserName = request.getParameter("UserName");
			
			List<DingDanBiao> list = ddbd.ByUserNameGetYiWanChengInfo(UserName);
			
			request.setAttribute("list", list);
			request.setAttribute("UserName", UserName);
			request.getRequestDispatcher("YiWanCheng.jsp").forward(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//default debug doGet() method
		doGet(request, response);
	}

}

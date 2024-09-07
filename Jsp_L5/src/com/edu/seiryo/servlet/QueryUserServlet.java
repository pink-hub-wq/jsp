package com.edu.seiryo.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.edu.seiryo.entity.User2;
import com.edu.seiryo.service.UserService2;
import com.edu.seiryo.service.imp.UserServiceImp2;

/**
 * Servlet implementation class QueryUserServlet
 */
public class QueryUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService2 userService2 = new UserServiceImp2();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		HttpSession session = request.getSession();
		String userName = (String) session.getAttribute("name");
		if(userName != null){
			List<User2> list = userService2.queryAllUserList();
			request.setAttribute("list", list);
			request.getRequestDispatcher("user.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "±§Ç¸£¬Äú»¹Î´µÇÂ½");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}

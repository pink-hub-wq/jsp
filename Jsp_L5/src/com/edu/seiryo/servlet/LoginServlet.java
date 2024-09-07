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
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService2 userService2 = new UserServiceImp2();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		String opt = request.getParameter("opt");
		if("login".equals(opt)){
			login(request, response);
		}
	}
	  /**
     * 登录
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
    	String userName = request.getParameter("userName");
    	String password = request.getParameter("password");
    	boolean bo = false;
    	User2 user2;
    	user2 = userService2.login(userName,password);
    	if(user2 == null){
    		request.setAttribute("msg", "账号或密码不正确");
    		request.getRequestDispatcher("login.jsp").forward(request, response);
    	}else {
    		HttpSession session = request.getSession();
    		session.setAttribute("name", userName);
    		request.getRequestDispatcher("QueryUserServlet").forward(request, response);
		}
    }
}

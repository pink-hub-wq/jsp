package com.edu.seiryo.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserService;
import com.edu.seiryo.service.imp.UserServiceImp;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
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
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		String account = request.getParameter("account");
        String password = request.getParameter("password");
        System.out.println("Account: " + account);
        System.out.println("Password: " + password);
        UserService userService = new UserServiceImp();
        User user = userService.login(account, password);

        if (user != null) {
                Cookie namecookie = new Cookie("name", account);
                namecookie.setMaxAge(30 * 24 * 60 * 60);
                Cookie passwordcookie = new Cookie("password", password);
                passwordcookie.setMaxAge(30 * 24 * 60 * 60);
                response.addCookie(namecookie);
                response.addCookie(passwordcookie);
                request.setAttribute("account", account);
                request.getRequestDispatcher("main.jsp").forward(request, response);
           
        } else {
            request.setAttribute("msg", "用户名或密码错误");
            request.getRequestDispatcher("RW1_login.jsp").forward(request, response);
        }
    }

}

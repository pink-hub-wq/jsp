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
 * Servlet implementation class LoginServlet2
 */
public class LoginServlet2 extends HttpServlet {
private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet2() {
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
        
        UserService userService = new UserServiceImp();
        User user = userService.login(account, password);
        
        Cookie[] cookies = request.getCookies();
        String cookieValue = "0";
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("cookie".equals(cookie.getName())) {
                    cookieValue = cookie.getValue();
                    break;
                }
            }
        }
        
        if (user != null) {
            if ("30".equals(cookieValue)) {
                Cookie accountCookie = new Cookie("name", account);
                accountCookie.setMaxAge(30 * 24 * 60 * 60);
                Cookie passwordCookie = new Cookie("password", password);
                passwordCookie.setMaxAge(30 * 24 * 60 * 60);
                response.addCookie(accountCookie);
                response.addCookie(passwordCookie);
            }
            request.setAttribute("account", account);
            request.getRequestDispatcher("LX1_main.jsp").forward(request, response);
        } else {
            request.setAttribute("msg", "用户名或密码错误");
            request.getRequestDispatcher("LX1_login.jsp").forward(request, response);
        }
    }

}

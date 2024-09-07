package com.edu.seiryo.servlet;

import java.util.*;
import java.awt.event.MouseWheelEvent;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.edu.seiryo.entity.Order;
import com.edu.seiryo.entity.UserInfo;
import com.edu.seiryo.service.OrderService;
import com.edu.seiryo.service.UserService;
import com.edu.seiryo.service.imp.OrderServiceImp;
import com.edu.seiryo.service.imp.UserServiceImp;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService userService = new UserServiceImp();
	OrderService orderService = new OrderServiceImp();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String flag = request.getParameter("opt");
		if("checkImage".equals(flag)){
			checkImage(request,response);
		}else if("login".equals(flag)){
			login(request,response);
		}
	}
	protected void checkImage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		PrintWriter pw = response.getWriter();
		String image = request.getParameter("image");
		session.setAttribute("image", image);
		String rand = (String) session.getAttribute("rand");
		if(image.equals(rand)){
			pw.print(true);
		}else {
			pw.print(false);
		}
		pw.flush();
		pw.close();
	}
	protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String userName = request.getParameter("userName");
		String usePassword = request.getParameter("password");
		String rand = (String) session.getAttribute("rand");
		String image = request.getParameter("image");
		request.setAttribute("userName", userName);
		request.setAttribute("usePassword", usePassword);
		if(image.equals(rand)){
			UserInfo userInfo = userService.login(new UserInfo(userName, usePassword));
			if(userInfo != null){
				List<Order> list = orderService.queryAllOrder();
				session.setAttribute("OrderList", list);
				request.getRequestDispatcher("orderInfo.jsp").forward(request, response);
				
			}else {
				request.setAttribute("msg2", "ÓÃ»§Ãû»òÃÜÂë´íÎó£¬µÇÂ¼Ê§°Ü");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}else {
			request.setAttribute("msg2", "ÑéÖ¤Âë´íÎó£¬µÇÂ¼Ê§°Ü");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}
}

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
 * Servlet implementation class DeleteUserServlet
 */
public class DeleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService2 userService2 = new UserServiceImp2();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteUserServlet() {
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
		String name = request.getParameter("account");
    	boolean bo = false;
    	bo = userService2.deleteUserByName(name);
    	if(bo){
    		request.setAttribute("msg", "É¾³ý³É¹¦");
    		request.getRequestDispatcher("QueryUserServlet").forward(request, response);
    	}else {
    		request.setAttribute("msg", "É¾³ýÊ§°Ü");
    		request.getRequestDispatcher("QueryUserServlet").forward(request, response);
		}
	}

}

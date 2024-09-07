package com.edu.seiryo.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserService;
import com.edu.seiryo.service.imp.UserServiceImp;

/**
 * Servlet implementation class RegistServlet
 */
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService userService = new UserServiceImp();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String account = request.getParameter("account");
		if(account != null){
			request.setAttribute("account", account);;
		}else {
			request.setAttribute("account", "");;
		}
		
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");
		if(sex != null){
			request.setAttribute("sex", sex);;
		}else {
			request.setAttribute("sex", "");;
		}
		String nickname = request.getParameter("nickname");
		if(nickname != null){
			request.setAttribute("nickname", nickname);;
		}else {
			request.setAttribute("nickname", "");;
		}
		boolean bo = false;
		bo = userService.isUserExist(account);
		if(bo){
			request.setAttribute("msg", "¸ÃÕËºÅÒÑ±»×¢²á¹ý£¬ÇëÖØÐÂ×¢²á£¡");
			request.getRequestDispatcher("regist.jsp").forward(request, response);
		}
		else {
			boolean bo2 = false;
			bo2 = userService.regist(new User(account,password,0,0,sex,nickname));
			if(bo2){
				request.setAttribute("msg", "×¢²á³É¹¦");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}else {
				request.setAttribute("msg", "×¢²áÊ§°Ü");
				request.getRequestDispatcher("regist.jsp").forward(request, response);
			}
		}
		
	}
}

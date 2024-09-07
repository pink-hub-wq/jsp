package com.edu.seiryo.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.edu.seiryo.entity.Chat;
import com.edu.seiryo.service.ChatService;
import com.edu.seiryo.service.UserService;
import com.edu.seiryo.service.imp.ChatServiceImp;
import com.edu.seiryo.service.imp.UserServiceImp;

/**
 * Servlet implementation class ChatManagerServlet
 */
public class ChatManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ChatService chatService = new ChatServiceImp();
    UserService userService = new UserServiceImp();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChatManagerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String flag = request.getParameter("flag");
		String flag2 = request.getParameter("flag2");
		if(("_show").equals(flag)){
			show(request, response);
		}
		if (("_send").equals(flag2)) {
			send(request, response);
		}
	}
	protected void show(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		List<Chat> list = chatService.selectAllChat();
		HttpSession session = request.getSession();
		if(list.size() == 0){
			request.setAttribute("msg", "无用户信息");
		}else {
			session.setAttribute("chatList", list);
		}
		request.getRequestDispatcher("chatinfo.jsp").forward(request, response);
	}
	protected void send (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String info = request.getParameter("msg");
		String color = request.getParameter("color");
    	HttpSession session = request.getSession();
		String account = (String)session.getAttribute("account");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String time = simpleDateFormat.format(date);
		boolean bo = false;
		bo = chatService.updateChat(new Chat(info,time,account,color));
		if(bo){
			request.getRequestDispatcher("chat.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("chat.jsp").forward(request, response);
		}
		
	}
}

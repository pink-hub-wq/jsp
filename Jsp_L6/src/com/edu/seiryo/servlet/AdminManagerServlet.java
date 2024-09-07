package com.edu.seiryo.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.ChatService;
import com.edu.seiryo.service.UserService;
import com.edu.seiryo.service.imp.ChatServiceImp;
import com.edu.seiryo.service.imp.UserServiceImp;

/**
 * Servlet implementation class AdminManagerServlet
 */
public class AdminManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService userService = new UserServiceImp();
	ChatService chatService = new ChatServiceImp();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminManagerServlet() {
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
		if(("_clear").equals(flag)){
			clear(request, response);
		}
	}
	protected void clear(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		HttpSession session = request.getSession();
		String account = (String)session.getAttribute("account");
		int type = userService.selectUserType(account);
		if(type == 1){
			boolean bo = false;
			bo = chatService.deleteAllChat();
			if(bo){
				request.setAttribute("msg2", "删除成功");
				session.removeAttribute("chatList");
				request.getRequestDispatcher("chat.jsp").forward(request, response);
			}else {
				request.setAttribute("msg2", "删除失败");
				request.getRequestDispatcher("chat.jsp").forward(request, response);
			}
		}else {
			request.setAttribute("msg2", "只有管理员可以删除信息，删除失败");
			request.getRequestDispatcher("chat.jsp").forward(request, response);
		}
		
	}
}

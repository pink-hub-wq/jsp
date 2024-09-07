package com.edu.seiryo.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.edu.seiryo.entity.Chat;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.ChatService;
import com.edu.seiryo.service.UserService;
import com.edu.seiryo.service.imp.ChatServiceImp;
import com.edu.seiryo.service.imp.UserServiceImp;
import com.edu.seiryo.util.GeneralUtils;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    UserService userService = new UserServiceImp();
    ChatService chatService = new ChatServiceImp();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	public static Map<String, HttpSession> sessionMap = new ConcurrentHashMap<String, HttpSession>();
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String flag = request.getParameter("flag");
		String flag2 = request.getParameter("flag2");
		String flag3 = request.getParameter("flag3");
		 if ("_login".equals(flag)){
	        	login(request, response);
		 	}else if("_online".equals(flag2)){
        		HttpSession session = request.getSession();
        		String account = (String) session.getAttribute("account");
        		String password = (String) session.getAttribute("password");
        		online(request, response, account, password);
		 		}else if("_logout".equals(flag3)){
		 			logout(request,response);
	        	}
	    }
	    private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    	String account = request.getParameter("account");
			String password = request.getParameter("password");
			boolean bo = false;
			bo = userService.login(new User(account, password));
			int type = -1;
			type = userService.selectUserType(new User(account, password));
			//登陆成功
			if(bo){
				if(type != 1 && type != -1){
					boolean bFlag = GeneralUtils.compareToTime(Integer.parseInt(GeneralUtils.BEGINTIME),false);
					boolean eFlag = GeneralUtils.compareToTime(Integer.parseInt(GeneralUtils.ENDTIME),true);
					if(bFlag){
						request.setAttribute("msg", "请在" + GeneralUtils.BEGINHOUR + "点以后登录");
						request.getRequestDispatcher("login.jsp").forward(request, response);
					}else if(eFlag){
						request.setAttribute("msg", "请在" + GeneralUtils.ENDHOUR + "点之前登录");
						request.getRequestDispatcher("login.jsp").forward(request, response);
					}else {
						userService.updateUserOnline(1, account);
						HttpSession session = request.getSession();
						session.setAttribute("account", account);
						session.setAttribute("password", password);
						String nickname = userService.selectUserNickName(account);
						session.setAttribute("nickname",nickname );
						session.setAttribute("type", type);
						int online = userService.selectUserOnline(account);
						session.setAttribute("online", online);
						String sex = userService.selectUserSex(account);
						session.setAttribute("sex", sex);
						sessionMap.put(account, session);
						List<User> list = userService.selectAllUsers(1);
						session.setAttribute("list", list);
						request.setAttribute("msg", type);
						request.setAttribute("account", account);
						session.setAttribute("admin", false);
						List<Chat> list2 = chatService.selectAllChat();
						if(list2.size() != 0){
							session.setAttribute("chatList", list2);
						}
						request.getRequestDispatcher("chat.jsp").forward(request, response);
					}
				}
				else {
					userService.updateUserOnline(1, account);
					HttpSession session = request.getSession();
					session.setAttribute("account", account);
					session.setAttribute("password", password);
					String nickname = userService.selectUserNickName(account);
					session.setAttribute("nickname",nickname );
					session.setAttribute("type", type);
					int online = userService.selectUserOnline(account);
					session.setAttribute("online", online);
					String sex = userService.selectUserSex(account);
					session.setAttribute("sex", sex);
					System.out.println(online);
					sessionMap.put(account, session);
					List<User> list = userService.selectAllUsers(1);
					session.setAttribute("list", list);
					request.setAttribute("msg", type);
					request.setAttribute("account", account);
					session.setAttribute("admin", true);
					List<Chat> list2 = chatService.selectAllChat();
					if(list2.size() == 0){
						session.setAttribute("msg","当前无信息");
					}else {
						session.setAttribute("chatList", list2);
					}
					request.getRequestDispatcher("chat.jsp").forward(request, response);
				}
			}else {
				request.setAttribute("account", account);
				request.setAttribute("msg2", "账号或密码不正确");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
	    }
	protected void online(HttpServletRequest request, HttpServletResponse response,String account,String password) throws ServletException, IOException {
		HttpSession session = request.getSession();
		List<User> list = userService.selectAllUsers(1);
		session.setAttribute("list", list);
		List<Chat> list2 = chatService.selectAllChat();
		if(list2.size() == 0){
			session.setAttribute("msg2", "没查询到用户信息");
		}else {
			session.setAttribute("chatList", list2);
		}
		request.getRequestDispatcher("online.jsp").forward(request, response);
	}
	protected void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		HttpSession session = request.getSession();
		String account1 = (String)session.getAttribute("account"); 
		userService.updateUserOnline(0, account1);
		sessionMap.remove("account");
		session.invalidate();
		request.setAttribute("logout", "logout");
		request.getRequestDispatcher("chat.jsp").forward(request, response);
	}
	public void init(ServletConfig config)throws ServletException{
		GeneralUtils.BEGINTIME = config.getInitParameter("beginTime");
		GeneralUtils.ENDTIME = config.getInitParameter("endTime");
		GeneralUtils.BEGINHOUR = GeneralUtils.BEGINTIME.substring(0,2);
		GeneralUtils.ENDHOUR = GeneralUtils.ENDTIME.substring(0,2);
	}
}

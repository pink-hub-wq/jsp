package com.edu.seiryo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;

import javax.security.auth.login.Configuration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.edu.seiryo.service.UserService;
import com.edu.seiryo.service.imp.UserServiceImp;
import com.edu.seiryo.util.GeneralUtils;

/**
 * Servlet implementation class SessionTimeout
 */
public class SessionTimeout extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String endTime;
	UserService userService = new UserServiceImp();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionTimeout() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		int time = Integer.parseInt(endTime);
		boolean flag = GeneralUtils.compareToTime(time, true);
		PrintWriter pWriter = response.getWriter();
		HttpSession session = request.getSession();
		String account = (String)session.getAttribute("account");
		if (account == null) {
		    pWriter.write("<script>alert('您已经退出聊天室！请先登录，系统将自动跳转至登录页！');" + "window.top.location.href='"+ request.getContextPath()+ "/login.jsp';</script>");
		}else{
			Object admin1 = session.getAttribute("admin");
			boolean admin2 = false;
			if (admin1 != null) {
				admin2 = (Boolean) admin1;
			}
			if (admin2) {
				request.getRequestDispatcher("logout.jsp").forward(request, response);
			} else {
				if (flag) {
			            userService.updateUserOnline2(0, 0);
			            Map<String, HttpSession> sMap = LoginServlet.sessionMap;
			            Set<String> keySet = sMap.keySet();
			            for (String key : keySet) {
			                HttpSession currentSession = sMap.get(key);
			                currentSession.setAttribute("logout2", "logout2");
			                sMap.remove(key);
			                currentSession.invalidate();
			            }
			            pWriter.write("<script>alert('聊天室已经结束！系统将自动跳转至登录页！');" + "window.top.location.href='"+ request.getContextPath()+ "/login.jsp';</script>");
			      
				}else {
					response.sendRedirect("logout.jsp");
				}
			}
				
			}
		}
	public void init(ServletConfig config) throws ServletException{
		endTime = config.getInitParameter("endTime");
	}
}

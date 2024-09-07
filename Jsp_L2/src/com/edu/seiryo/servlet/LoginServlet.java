package com.edu.seiryo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserService;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	UserService userService = new UserService();
	boolean bo = false;
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		User user = new User(account, password);
		bo = userService.login(user);
//		System.out.println(bo);
		PrintWriter out = response.getWriter();
		if(bo){
			out.println("<html><head>");
			out.println("<title>�û���¼</title>");
			out.println("</head><body>");
			out.println("<form action='LoginServlet' method='post'>");
			out.println("<div><div><table width='65%'><tr>");
			out.println("<td>�û����� </td> <td width='74%'>");
			out.println("<input name='account' type='text' id='account' size='26' value='" + account + "'></td></tr>");
			out.println("<tr><td>���룺</td>");
			out.println("<td><input name='password' type='password' id='password' size='26' value='" + password + "'></td></tr>");
			out.println("<tr><td>&nbsp;</td>");
			out.println("<td><input name='input' type='button' value = '��¼'/></td></tr>");
			out.println("</table></div></div></form>");
			out.println("<script>window.onload=function(){alert('��ϲ�㣬" + account + "����¼�ɹ���');}</script>");
			out.println("</body></html>");
		}else {
			out.println("<script>window.onload=function(){alert('������˼���˺Ż�������󣬵�¼ʧ�ܣ�');}</script>");
		}
		out.close();
	}
}

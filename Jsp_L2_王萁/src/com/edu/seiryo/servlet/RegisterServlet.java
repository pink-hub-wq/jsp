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
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	UserService userService = new UserService();
	boolean bo = false;
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");
		String email = request.getParameter("email");
		if (!(account.length() >= 5 && account.length() <= 12 && password.length() >= 5 && password.length() <= 12 && (sex.equals("��") || sex.equals("Ů")))) {
		    response.sendRedirect("RW1_regist.html");
		    return;
		}
		User user = new User(account, password, sex, email);
		bo = userService.regist(user);
		System.out.println(bo);
		if(bo){
			PrintWriter out = response.getWriter();
			out.println("<html><head>");
			out.println("<title>�û�ע��</title>");
			out.println("</head><body>");
			out.println("<form action='RegistServlet' method='post'>");
			out.println("<div><div><table width='65%'><tr>");
			out.println("<td width='26%'���û����� </td> <td width='74%'>");
			out.println("<input name='account' type='text' id='account' size='26' value='" + account + "'></td></tr>");
			out.println("<tr><td>���룺</td>");
			out.println("<td><input name='password' type='password' id='password' size='26' value='" + password + "'></td></tr>");
			out.println("<tr><td>�Ա�</td>");
			out.println("<td><input name='sex' type='text' id='sex' size='26' value='" + sex + "'></td></tr>");
			out.println("<tr><td>E-mail:</td>");
			out.println("<td><input name='email' type='text' id='email' size='26' value='" + email + "'></td></tr>");
			out.println("<tr><td>&nbsp;</td>");
			out.println("<td><input name='input' type='button' value = 'ע��'/></td></tr>");
			out.println("</table></div></div></form>");
			out.println("<script>window.onload=function(){alert((" +account+ ")��ϲ��ע��ɹ�);}</script></body></html>");
			out.close();
		}
	}

}

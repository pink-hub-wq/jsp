package com.edu.seiryo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowMsgServlet
 */
public class ShowMsgServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
     * @see HttpServlet#HttpServlet()
     */
	public ShowMsgServlet() {
		super();
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		ArrayList<String> msgList = (ArrayList<String>) this.getServletContext().getAttribute("msgList");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>адлЛ</title>");
		out.println("<meta http-equiv='content-type' content='text/html; charset=UTF-8'>");
		out.println("<meta http-equiv='refresh' content='3'/>");
		out.println("<style>#msg{width:280px;height:30px;}</style></head><body>");
		out.println("<form action='ChatServlet' method='post'>");
		out.println("<table><tr><td><input type='text' name='msg' id='msg'></td>");
		out.println("<td><button type='submit'>адлЛ</button></td>");
		out.println("</tr></table>");
		out.println("<hr color='blue'>");
		out.println("</form>");
		if (msgList != null) {
			for (String msg : msgList) {
				out.println(msg + "<br/>");
			}
		}
		out.println("</body></html>");
		out.close();
	}
}

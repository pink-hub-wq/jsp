package com.edu.seiryo.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChatServlet
 */
public class ChatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String filterMsg;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		filterMsg = config.getInitParameter("filterMsg");
		super.init(config);
	}
	/**
     * @see HttpServlet#HttpServlet()
     */
	public ChatServlet() {
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
		String msg = request.getParameter("msg");
		ArrayList<String> msgList = (ArrayList<String>) this.getServletContext().getAttribute("msgList");
		if (msgList == null) {
			msgList = new ArrayList<String>();
		}
		if (msg != null && filterMsg != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String currentTime = sdf.format(new Date());
			String[] str = filterMsg.split("£¬");
			for (String strMsg : str) {
				msg = msg.replaceAll(strMsg, "*");
			}
			msgList.add(msg + "\t\t\t" + currentTime);
		}
		this.getServletContext().setAttribute("msgList", msgList);
		request.getRequestDispatcher("ShowMsgServlet").forward(request, response);
	}
}


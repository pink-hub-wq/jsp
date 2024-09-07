package com.edu.seiryo.SL;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SL7_2
 */
public class SL7_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SL7_2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Object> list = (ArrayList<Object>) request.getAttribute("list");
		response.setHeader("content-type", "text/html;Charset = utf-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter pWriter = response.getWriter();
		pWriter.println("<html><body>");
		pWriter.println("SL7_2中接收到SL7_1请求域中的数据：<br/>");
		for (Object object : list) {
			pWriter.print(object + "<br/>");
		}
		pWriter.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

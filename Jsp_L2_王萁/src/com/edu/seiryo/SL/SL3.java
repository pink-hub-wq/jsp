package com.edu.seiryo.SL;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SL3
 */
public class SL3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SL3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String name = request.getParameter("name");
//		name = new String(name.getBytes("ISO-8859-1"),"utf-8");
		String sex = request.getParameter("sex");
//		sex = new String(sex.getBytes("ISO-8859-1"),"utf-8");
		String suggestion = request.getParameter("suggest");
//		suggestion = new String(suggestion.getBytes("ISO-8859-1"),"utf-8");
		String[] interest = request.getParameterValues("interest");
//		if(interest.length != 0){
//			for (int i = 0; i < interest.length; i++) {
//				interest[i] = new String(interest[i].getBytes("ISO-8859-1"),"utf-8");
//			}
//		}
		PrintWriter pWriter = response.getWriter();
		pWriter.println("姓名：" + name + "<br/>");
		pWriter.println("性别：" + sex + "<br/>");
		pWriter.println("兴趣：");
		for (String xq : interest) {
			pWriter.println(xq + "&nbsp;&nbsp;");
		}
		pWriter.println("<br>意见：" + suggestion + "</br>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.edu.seiryo.SL;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.Style;

/**
 * Servlet implementation class SL1
 */
public class SL1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SL1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie = new Cookie("cookieName", "SL1");
		cookie.setMaxAge(60);
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pWriter = response.getWriter();
		response.addCookie(cookie);
		Cookie[] cookies = request.getCookies();
		boolean bo = false;
		for (Cookie cookie2 : cookies) {
			if(cookie2.getName().equals("cookieName")){
				bo = true;
			}
		}
		if(!bo){
			pWriter.println("<html><title>�鿴cookie</title><div style='width:400px;height:200px;border:1px solid #33aa66;'>");
			pWriter.println("��һ�η���SL1��ʱ��û��Cookieʵ��</div></html>");
		}else {
			pWriter.println("<html><title>�鿴cookie</title><div style='width:400px;height:200px;border:1px solid #33aa66;'>");
			pWriter.println("Cookie�б�</br>");
			for (Cookie cookie2 : cookies) {
				pWriter.println("Cookie���ƣ�" + cookie2.getName() + "����Ӧ��ֵ��" + cookie2.getValue());
				pWriter.println("<br/>");
			}
			pWriter.println("</div></html>");
			pWriter.close();
		}
		
	}

}

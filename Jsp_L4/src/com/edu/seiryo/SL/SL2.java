package com.edu.seiryo.SL;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SL2
 */
public class SL2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Cookie tempCookie = null;
    private int count = 0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SL2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String sinkCss = request.getParameter("sinkcolor");
		System.out.println(sinkCss);
		Cookie[] cookies = request.getCookies();
		boolean bo = false;
		for (Cookie cookie2 : cookies) {
			if(cookie2.getName().equals("sinkCss")){
				bo = true;
			}
		}
		if(!bo){
			for (Cookie cookie : cookies) {
				if("sinkCss".equals(cookie.getName())){
					tempCookie = cookie;
					break;
				}
			}
		}
		 if (tempCookie == null) {
			 tempCookie = new Cookie("sinkCss", "css/skin_0.css");
		    } else if (sinkCss != null) {
		    	tempCookie.setValue(sinkCss);
		    }
		tempCookie.setMaxAge(3600*24*365);
		response.addCookie(tempCookie);
		String sc = "css/skin_0.css";
		if(tempCookie != null && count != 0){
			sc = tempCookie.getValue();
		}
		count++;
		sc = sc.split("/")[1].split("\\.")[0];
		request.setAttribute("sc", sc);
		request.getRequestDispatcher("Skin.jsp").forward(request, response);	
	}
}

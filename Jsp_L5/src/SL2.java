

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SL2
 */
public class SL2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pWriter = response.getWriter();
		HttpSession session = request.getSession();
		pWriter.println("<title>Session有效期</title>");
		pWriter.println("Session默认有效时间是" + session.getMaxInactiveInterval() + "秒" + "</br>");
		session.setMaxInactiveInterval(5);
		pWriter.println("SessionId=" + session.getId() + "<br/>");
		pWriter.println("修改后的Session有效时间是" + session.getMaxInactiveInterval() + "秒" + "</br>");
	}

}

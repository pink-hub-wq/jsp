

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SL1_SessionServlet2
 */
public class SL1_SessionServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SL1_SessionServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
	/**
	 * doPost方法
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		HttpSession session = request.getSession();
		String value = (String) session.getAttribute("sessionKey");
		String sessionId = session.getId();
		PrintWriter pwPrintWriter = response.getWriter();
		pwPrintWriter.println("SessionServlet2中的SessionId=" + sessionId + "<br/>");
		pwPrintWriter.println("sessionKey的值=" + value + "<br/>");
		pwPrintWriter.println("当前session是否是新的Session实例=" + session.isNew() + "<br/>");
		pwPrintWriter.println( " <a href='SL1_SessionServlet3'>点击后当前Session失效</a>" );
		pwPrintWriter.close();
	}

}

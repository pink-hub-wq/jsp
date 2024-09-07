

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SL1_SessionServlet
 */
public class SL1_SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SL1_SessionServlet() {
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
		String sessionId = session.getId();
		session.setAttribute("sessionKey", "sessionValue");
		PrintWriter pwPrintWriter = response.getWriter();
		pwPrintWriter.println("SessionId=" + sessionId + "<br/>");
		pwPrintWriter.println( " <a href='SL1_SessionServlet2'>通过超链接跳转至Session</a>" );
		pwPrintWriter.close();
	}

}

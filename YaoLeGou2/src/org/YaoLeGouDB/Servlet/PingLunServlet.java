package org.YaoLeGouDB.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.YaoLeGouDB.Dao.PingLunDao;
import org.YaoLeGouDB.Impl.PingLunDaoImpl;
import org.YaoLeGouDB.entity.PingLun;

/**
 * Servlet implementation class PingLunServlet
 */
@WebServlet(urlPatterns={"/ht/PingLun.do"})
public class PingLunServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PingLunServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PingLunDao pingLunDao = new PingLunDaoImpl();
		String State = request.getParameter("State");
		if(State == null){
			String text = request.getParameter("text");
			PingLun pingLun = new PingLun();
			if(text != null && !text.equals("")){
				pingLun.setContext(text);
			}
			List<PingLun> PingLunlist = pingLunDao.GetAllInfo(pingLun);			
			request.setAttribute("text", text);
			request.setAttribute("PingLunDao", PingLunlist);
			request.getRequestDispatcher("/ht/SelectPingLun.jsp").forward(request, response);
		}else if(State.equals("del")){			
			String id = request.getParameter("id");
			pingLunDao.ByIdDelInfo(Integer.parseInt(id));
		}else if(State.equals("delAll")){			
			String[] pinglunIds = request.getParameterValues("pinglunid");
			for (int i = 0; i < pinglunIds.length; i++) {
				if(!pinglunIds[i].equals("")){
					pingLunDao.ByIdDelInfo(Integer.parseInt(pinglunIds[i]));
				}
				
			}
			String text = request.getParameter("text");
			PingLun pingLun = new PingLun();
			if(text != null && !text.equals("")){
				pingLun.setContext(text);
			}
			List<PingLun> PingLunlist = pingLunDao.GetAllInfo(pingLun);			
			request.setAttribute("text", text);
			request.setAttribute("PingLunDao", PingLunlist);
			request.getRequestDispatcher("/ht/SelectPingLun.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

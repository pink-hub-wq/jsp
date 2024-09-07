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
		String state = request.getParameter("State");
		if(state == null){
			GetAllPingLunInfo(request,response);
		}else if (("del").equals(state)) {
			DeletePingLun(request,response);
		}else if (("delAll").equals(state)) {
			DeletePingLuns(request,response);
		}
	}
	protected void GetAllPingLunInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String text = request.getParameter("text");
		PingLun pingLun = new PingLun();
		if(text != null && !text.equals("")){				
			pingLun.setContext(text);
		}
		PingLunDao pingLunDao = new PingLunDaoImpl();
		List<PingLun> PingLunlist = pingLunDao.GetAllInfo(pingLun);	
		request.setAttribute("PingLunDao", PingLunlist);
		request.getRequestDispatcher("/ht/SelectPingLun.jsp").forward(request, response);
	}
	protected void DeletePingLun(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		PingLun pingLun = new PingLun();
		PingLunDao pingLunDao = new PingLunDaoImpl();
		pingLunDao.ByIdDelInfo(Integer.parseInt(id));
		List<PingLun> PingLunlist = pingLunDao.GetAllInfo(pingLun);	
		request.setAttribute("PingLunDao", PingLunlist);
		request.getRequestDispatcher("/ht/SelectPingLun.jsp").forward(request, response);
	}
	protected void DeletePingLuns(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] ids = request.getParameterValues("pinglunid");
		PingLun pingLun = new PingLun();
		PingLunDao pingLunDao = new PingLunDaoImpl();
		for (int i = 0; i < ids.length; i++) {
			if(!ids[i].equals("")){
				pingLunDao.ByIdDelInfo(Integer.parseInt(ids[i]));
			}
		}
		List<PingLun> PingLunlist = pingLunDao.GetAllInfo(pingLun);	
		request.setAttribute("PingLunDao", PingLunlist);
		request.getRequestDispatcher("/ht/SelectPingLun.jsp").forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

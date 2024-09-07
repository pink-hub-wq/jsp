package org.YaoLeGouDB.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.YaoLeGouDB.Dao.JiBenInfoDao;
import org.YaoLeGouDB.Impl.JiBenInfoDaoImpl;
import org.YaoLeGouDB.entity.JiBenInfo;
@WebServlet(urlPatterns={"/ht/WebSet.do"})
public class WebSetServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*PrintWriter out = response.getWriter();*/
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");

		String State = request.getParameter("State");
		JiBenInfoDao jbid = new JiBenInfoDaoImpl();
		if(State == null){
			
			//获得全部网站基本信息
			
			List<JiBenInfo> JiBenInfoList = jbid.GetAllInfo();
			
			request.setAttribute("JiBenInfoList", JiBenInfoList);
			request.getRequestDispatcher("/ht/WebSet.jsp").forward(request, response);
		}else if(State.equals("save")){
			String name = request.getParameter("name");
			String miaoshu = request.getParameter("miaoshu");
			String banquan = request.getParameter("banquan");
			String beian = request.getParameter("beian");
			
			jbid.ByKeyUpdateContext("Title", name);
			jbid.ByKeyUpdateContext("Context", miaoshu);
			jbid.ByKeyUpdateContext("Copy", banquan);
			jbid.ByKeyUpdateContext("beian", beian);
			
		}else if(State.equals("tj")){
			List<JiBenInfo> JiBenInfoList = jbid.GetAllInfo();
			String tongji = JiBenInfoList.get(2).getValue();
			request.setAttribute("tongji", tongji);
			request.getRequestDispatcher("/ht/TongJi.jsp").forward(request, response);
		}else if(State.equals("tjsave")){
			
			String tongji = request.getParameter("text");
			/*String yuan = request.getParameter("yuan");*/
			
			jbid.ByKeyUpdateContext("TongJi", tongji);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//default debug doGet() method
		doGet(request, response);
	}

}

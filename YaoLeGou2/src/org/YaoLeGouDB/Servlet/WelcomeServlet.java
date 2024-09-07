package org.YaoLeGouDB.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.YaoLeGouDB.Dao.DingDanBiaoDao;
import org.YaoLeGouDB.Dao.DingDanXiangQingDao;
import org.YaoLeGouDB.Dao.PingLunDao;
import org.YaoLeGouDB.Dao.ShopInfoDao;
import org.YaoLeGouDB.Dao.TotalPirceDao;
import org.YaoLeGouDB.Dao.UserDao;
import org.YaoLeGouDB.Impl.DingDanBiaoDaoImpl;
import org.YaoLeGouDB.Impl.DingDanXiangQingDaoImpl;
import org.YaoLeGouDB.Impl.PingLunDaoImpl;
import org.YaoLeGouDB.Impl.ShopInfoDaoImpl;
import org.YaoLeGouDB.Impl.TotalPirceDaoImpl;
import org.YaoLeGouDB.Impl.UserDaoImpl;
@WebServlet(urlPatterns={"/ht/Welcome.do"})
public class WelcomeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*PrintWriter out = response.getWriter();*/
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");

		String State = request.getParameter("State");
		if(State == null){
			
			UserDao ud = new UserDaoImpl();
			int UserCount = ud.Count();
			
			PingLunDao pld = new PingLunDaoImpl();
			int PingLunCount = pld.Count();
			
			DingDanBiaoDao ddb = new DingDanBiaoDaoImpl();
			int DingDanBiaoCount = ddb.Count();
			
			TotalPirceDao tp = new TotalPirceDaoImpl();
			int Money = tp.GetMoneyCount();
			
			
			ShopInfoDao sid = new ShopInfoDaoImpl();
			int ShopInfoCount = sid.Count();
			
			DingDanBiaoDao ddbd = new DingDanBiaoDaoImpl();
			int dingdanbiaocount = ddbd.GetAllCount();
			
			DingDanXiangQingDao ddxqd = new DingDanXiangQingDaoImpl();
			int daifahuo = ddxqd.DaiFaHuoCount();
			int daifukuancount = ddxqd.DaiFuKuanCount();
			
			request.setAttribute("daifahuo", daifahuo);
			request.setAttribute("daifukuancount", daifukuancount);
			request.setAttribute("dingdanbiaocount", dingdanbiaocount);
			request.setAttribute("ShopInfoCount", ShopInfoCount);
			request.setAttribute("UserCount", UserCount);
			request.setAttribute("DingDanBiaoCount", DingDanBiaoCount);
			request.setAttribute("PingLunCount", PingLunCount);
			request.setAttribute("Money", Money);
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//default debug doGet() method
		doGet(request, response);
	}

}

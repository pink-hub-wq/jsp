package org.YaoLeGouDB.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.YaoLeGouDB.Dao.SexDao;
import org.YaoLeGouDB.Dao.ShopTypeDao;
import org.YaoLeGouDB.Impl.SexDaoImpl;
import org.YaoLeGouDB.Impl.ShopTypeDaoImpl;
import org.YaoLeGouDB.entity.Sex;
import org.YaoLeGouDB.entity.ShopType;

import com.alibaba.fastjson.JSON;
@WebServlet(urlPatterns={"/ht/TongJi.do"})
public class TongJiServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*PrintWriter out = response.getWriter();*/
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");

		String State = request.getParameter("State");
		if(State == null){
			ShopTypeDao std = new ShopTypeDaoImpl();
			List<ShopType> list = std.TJTypeInfo();
			String List = JSON.toJSONString(list);
			
			response.getWriter().print(List);
		}else if(State.equals("TJSex")){
			SexDao sd = new SexDaoImpl();
			List<Sex> list = sd.TJSexCount();
			String List = JSON.toJSONString(list);
			
			response.getWriter().print(List);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//default debug doGet() method
		doGet(request, response);
	}

}

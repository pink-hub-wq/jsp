package org.YaoLeGouDB.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.YaoLeGouDB.Dao.GouWuCheDao;
import org.YaoLeGouDB.Dao.ShopColorDao;
import org.YaoLeGouDB.Impl.GouWuCheDaoImpl;
import org.YaoLeGouDB.Impl.ShopColorDaoImpl;
import org.YaoLeGouDB.entity.GouWuChe;
import org.YaoLeGouDB.entity.ShopColor;

import com.alibaba.fastjson.JSON;

@WebServlet(urlPatterns={"/WuPinXiangQing.do"})
public class WuPinXiangQingServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*PrintWriter out = response.getWriter();*/
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");

		String State = request.getParameter("State");
		if(State == null){
			//加载物品详情的时候 默认调用的方法
		}else if(State.equals("Color")){
			String shopid = request.getParameter("shopid");
			String Color = request.getParameter("color");
			
			ShopColorDao scd = new ShopColorDaoImpl();
			List<ShopColor> ColorList = scd.ByShopIdAndColorGetAllInfo(Integer.parseInt(shopid), Color);
			
			String Colors = JSON.toJSONString(ColorList);
			response.getWriter().print(Colors);
			
		}else if(State.equals("JiaRuGouWuChe")){
			
			GouWuCheDao gwcd = new GouWuCheDaoImpl();
			
			String img = request.getParameter("img");
			String shopid = request.getParameter("id");
			String shopname = request.getParameter("shopname");
			String yanse = request.getParameter("yanse");
			String chicun = request.getParameter("chicun");
			String jiage = request.getParameter("jiage");
			String count = request.getParameter("count");
			String UserName = request.getParameter("UserName");
			
			GouWuChe gwcs = gwcd.ByShopIdAndUserNameIsExist(UserName, Integer.parseInt(shopid),chicun,yanse);
			if(gwcs == null){
				
				//判断购物车里面没有该商品 则会增加一条购物车记录
				GouWuChe gwc = new GouWuChe();
				gwc.setImage(img);
				gwc.setShopid(Integer.parseInt(shopid));
				gwc.setShopname(shopname);
				gwc.setColor(yanse);
				gwc.setChicun(chicun);
				gwc.setPrice(Double.parseDouble(jiage));
				gwc.setCount(Integer.parseInt(count));
				gwc.setUsername(UserName);
				
				
				boolean is = gwcd.AddGouWuCheInfo(gwc);
				response.getWriter().print(is);
			}else{
				boolean is = gwcd.UpdateInfo(chicun, yanse, Integer.parseInt(count), UserName, Integer.parseInt(shopid),gwcs.getId());
				response.getWriter().print(is);
			}
			
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//default debug doGet() method
		doGet(request, response);
	}

}

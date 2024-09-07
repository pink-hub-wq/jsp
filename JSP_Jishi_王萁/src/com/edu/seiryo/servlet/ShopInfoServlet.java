package com.edu.seiryo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.edu.seiryo.entity.Cart;
import com.edu.seiryo.entity.OrderDetail;
import com.edu.seiryo.entity.ShopInfo;
import com.edu.seiryo.service.ShopInfoService;
import com.edu.seiryo.service.imp.ShopInfoServiceImp;
import com.edu.seiryo.util.Pager;

/**
 * Servlet implementation class ShopInfoServlet
 */
public class ShopInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ShopInfoService shopInfoService = new ShopInfoServiceImp();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		HttpSession session = request.getSession();
		String flag = request.getParameter("opt");
		if("queryAllShopInfo".equals(flag)){
			 if (session.getAttribute("first") == null) {
		            session.setAttribute("first", "true");
		        }
		           queryAllShopInfo(request, response);
		}else if("queryAllShopInfo2".equals(flag)){
	            queryAllShopInfo(request,response);
		}else if("addCart".equals(flag)){
			addCart(request,response);
		}else if("updateShopInfoNumber".equals(flag)){
			updateShopInfoNumber(request,response);
		}else if("deleteShopInfo".equals(flag)){
			deleteShopInfo(request,response);
		}else if("clearCart".equals(flag)){
			clearCart(request,response);
		}
	}
	protected void clearCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.removeAttribute("list");
		queryAllShopInfo(request,response);
	}
	protected void deleteShopInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String shopId = request.getParameter("shopId");
		HttpSession session = request.getSession();
		List<Cart> list = (List<Cart>) session.getAttribute("list");
		if (list == null) {
	        list = new ArrayList<Cart>();
	    }		
		for (Cart cart : list) {
			 if(Integer.parseInt(shopId) == cart.getId()){
				 list.remove(cart);
				 break;
			 }
		}
		session.setAttribute("list", list);
	    request.getRequestDispatcher("cart.jsp").forward(request, response);
	}
	protected void updateShopInfoNumber(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String shopId = request.getParameter("shopId");
		String number = request.getParameter("number");
		HttpSession session = request.getSession();
		List<Cart> list = (List<Cart>) session.getAttribute("list");
		if (list == null) {
	        list = new ArrayList<Cart>();
	    }
	    for (Cart cart : list) {
	        if(Integer.parseInt(shopId) == cart.getId()){
	            cart.setNumber(Integer.parseInt(number));
	            cart.setTotalPrice(cart.getNumber() * cart.getPrice());
	            break;
	        }
	    }
	    request.getRequestDispatcher("cart.jsp").forward(request, response);
	}
	protected void addCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String shopId = request.getParameter("shopId");
		String shopName = request.getParameter("shopName");
		String price1 = request.getParameter("price");
		float price = Float.parseFloat(price1); 
		HttpSession session = request.getSession();
		List<Cart> list = (List<Cart>) session.getAttribute("list");
		if(list == null){
			list = new ArrayList<Cart>();
		}
		boolean bo = true;
		for (Cart cart : list) {
			if(Integer.parseInt(shopId) ==cart.getId()){
				bo = false;
				cart.setNumber(cart.getNumber()+1);
				cart.setTotalPrice(cart.getNumber() * cart.getPrice());
				break;
			}
		}
		if(bo){
			Cart cart = new Cart(Integer.parseInt(shopId), shopName, price, 1, price *1);
			list.add(cart);
		}
		session.setAttribute("list", list);
		request.getRequestDispatcher("cart.jsp").forward(request, response);
	}
	protected void queryAllShopInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Pager pager = new Pager();
		String currentPage = request.getParameter("currentPage");
		if (currentPage == null || "".equals(currentPage)) {
			currentPage = "1";
		    pager.setCurrentPage(Integer.parseInt(currentPage));
		} else {
		    pager.setCurrentPage(Integer.parseInt(currentPage));
		}
		String shopname = request.getParameter("shopname");
		if(shopname != null && !shopname.equals("")){
			List<ShopInfo> list = shopInfoService.queryShopInfoByName(shopname);
			if(list.size() != 0 ){
				  pager.setTopicSelect(list);
				  pager.setCurrentPage(Integer.parseInt(currentPage));
			}else {
				request.setAttribute("msg2", "您输入的商品名称有误");
			}
		}else {
			List<ShopInfo> list = shopInfoService.queryAllShopInfo();
			pager.setTopicSelect(list);
		    pager.setCurrentPage(Integer.parseInt(currentPage));
		}
		
		request.setAttribute("page", pager);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}

package com.edu.seiryo.servlet;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.edu.seiryo.entity.Shopping;

/**
 * Servlet implementation class ShoppingCarServlet
 */
public class ShoppingCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingCarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html;charset=UTF-8");
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String flag = request.getParameter("flag");
        if ("_addCar".equals(flag)) {
            this.addCar(request, response);
        } else if ("_seeCar".equals(flag)) {
            this.queryCar(request, response);
        }
	}
	// 添加购物车
    public void addCar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        List<Shopping> carShoppingList = (List<Shopping>) session.getAttribute("scl");
        if (carShoppingList == null) {
            carShoppingList = new ArrayList<Shopping>();
        }
        String[] goods = request.getParameterValues("goods");
        if (goods != null) {
            for (String good : goods) {
//                System.out.println(good);
                Shopping shopping = new Shopping();
                String[] goodz = good.split(":");
                shopping.setGoodsId(goodz[0]);
                shopping.setGoodsName(goodz[1]);
                shopping.setPrice(Integer.parseInt(goodz[2]));
                carShoppingList.add(shopping);
            }
        }
        for (Shopping goods2 : carShoppingList) {
        	System.out.println("Goods ID: " + goods2.getGoodsId() + ", Goods Name: " + goods2.getGoodsName() + ", Price: " + goods2.getPrice());

		}
        session.setAttribute("scl", carShoppingList);
        request.setAttribute("msg", "商品添加成功");
        request.getRequestDispatcher("ShoppingServlet").forward(request, response);
    }
    // 查看购物车
    public void queryCar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        List<Shopping> shoppingCar = (List<Shopping>) session.getAttribute("scl");
        System.out.println(shoppingCar);
        
        if (shoppingCar == null) {
            request.setAttribute("msg", "对不起，购物车中没有商品");
            request.getRequestDispatcher("ShoppingServlet").forward(request, response);
        } else {
            HashSet<Shopping> shoppingSet = new HashSet<Shopping>(shoppingCar);
            List<Integer> timesList = new ArrayList<Integer>();
            for (Shopping shopping : shoppingSet) {
                int times = Collections.frequency(shoppingCar, shopping);
                timesList.add(times);
            }
            session.setAttribute("carSet", shoppingSet);
            session.setAttribute("timesList", timesList);
            request.getRequestDispatcher("carList.jsp").forward(request, response);
        }
    }
}

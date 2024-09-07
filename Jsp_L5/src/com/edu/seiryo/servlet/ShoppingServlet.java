package com.edu.seiryo.servlet;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edu.seiryo.entity.Shopping;

/**
 * Servlet implementation class ShoppingServlet
 */
public class ShoppingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Shopping> list = new ArrayList<Shopping>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init() throws ServletException {
        Shopping sp1 = new Shopping();
        sp1.setGoodsId("GDS_001");
        sp1.setGoodsName("HTC_ONE");
        sp1.setPrice(4300);
        sp1.setDate("2012-01-09");
        sp1.setType("手机");

        Shopping sp2 = new Shopping();
        sp2.setGoodsId("GDS_002");
        sp2.setGoodsName("Thinkpad-SL");
        sp2.setPrice(5888);
        sp2.setDate("2013-01-09");
        sp2.setType("电脑");

        Shopping sp3 = new Shopping();
        sp3.setGoodsId("GDS_003");
        sp3.setGoodsName("Nikon-D600");
        sp3.setPrice(12000);
        sp3.setDate("2013-01-09");
        sp3.setType("数码相机");

        list.add(sp1);
        list.add(sp2);
        list.add(sp3);
    }

    // 显示所有商品
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("sl", list);
        String msg = request.getParameter("msg");
        if (msg != null) {
        	request.setAttribute("msg", msg);
        }
        request.getRequestDispatcher("shoppingList.jsp").forward(request, response);
    }

}

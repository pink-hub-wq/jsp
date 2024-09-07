package com.edu.seiryo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.edu.seiryo.entity.Order;
import com.edu.seiryo.entity.OrderDetail;
import com.edu.seiryo.service.OrderDetailService;
import com.edu.seiryo.service.OrderService;
import com.edu.seiryo.service.ShopInfoService;
import com.edu.seiryo.service.imp.OrderDetailServiceImp;
import com.edu.seiryo.service.imp.OrderServiceImp;
import com.edu.seiryo.service.imp.ShopInfoServiceImp;

/**
 * Servlet implementation class OrderDetailServlet
 */
public class OrderDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	OrderDetailService orderDetailService = new OrderDetailServiceImp();
    OrderService orderService = new OrderServiceImp();
    ShopInfoService shopInfoService = new ShopInfoServiceImp();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String flag = request.getParameter("opt");
		if("queryOrderDetailById".equals(flag)){
			queryOrderDetailById(request,response);
		}
	}
	protected void queryOrderDetailById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
		String orderIdString = request.getParameter("orderId");
		int orderId = orderService.queryIdByOrderId(orderIdString);
		response.setContentType("application/json");
	    PrintWriter out = response.getWriter();
	    JSONObject jsonResponse = new JSONObject();
	    List<OrderDetail> list = orderDetailService.queryOrderDetailByOrderId(orderId);
        session.setAttribute("OrderDetailList", list);
        JSONArray jsonArray = new JSONArray();
        for (OrderDetail orderDetail : list) {
        	 JSONObject json = new JSONObject();
             try {
            	 json.put("shopId", orderDetail.getShopId());
                 json.put("shopName", shopInfoService.queryShopInfo(orderId).getShopName()); 
                 json.put("quantity", orderDetail.getQuantity());
                 json.put("price", shopInfoService.queryShopInfo(orderId).getPrice());
				json.put("amount", orderDetail.getQuantity() * orderDetail.getOrderId());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
             jsonArray.put(json);
        }
        try {
			jsonResponse.put("details", jsonArray);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        out.print(jsonResponse.toString());
	    out.flush();
	    out.close();
	}
}

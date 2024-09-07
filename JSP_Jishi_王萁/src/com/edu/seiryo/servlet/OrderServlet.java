package com.edu.seiryo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.edu.seiryo.dao.OrderDao;
import com.edu.seiryo.entity.Cart;
import com.edu.seiryo.entity.Order;
import com.edu.seiryo.entity.OrderDetail;
import com.edu.seiryo.service.OrderDetailService;
import com.edu.seiryo.service.OrderService;
import com.edu.seiryo.service.ShopInfoService;
import com.edu.seiryo.service.imp.OrderDetailServiceImp;
import com.edu.seiryo.service.imp.OrderServiceImp;
import com.edu.seiryo.service.imp.ShopInfoServiceImp;
import com.edu.seiryo.util.JSONUtil;

/**
 * Servlet implementation class OrderServlet
 */
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	OrderService orderService = new OrderServiceImp();
	OrderDetailService orderDetailService = new OrderDetailServiceImp();
	ShopInfoService shopInfoService = new ShopInfoServiceImp();
	private static int orderId = 000001;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderServlet() {
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
		if("update".equals(flag)){
			update(request,response);
		}else if("queryStatus".equals(flag)){
			queryStatus(request,response);
		}else if("creatOrder".equals(flag)){
			creatOrder(request,response);
		}
	}
	protected void creatOrder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String totalAmount = request.getParameter("totalAmount");
		Order order= new Order();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String today = sdf.format(new Date());
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		String today2 = sdf2.format(new Date());
		order.setOrderId(today + orderId);
		orderId++;
		order.setState(0);
		order.setCreateDtm(today2);
		orderService.addOrder(order);
		HttpSession session = request.getSession();
		List<Cart> list = (List<Cart>) session.getAttribute("list");
		OrderDetail orderDetail = new OrderDetail();
		for (Cart cart : list) {
			order.setId(orderService.queryIdByOrderId(order.getOrderId()));
			orderDetail.setOrderId(order.getId());
			orderDetail.setShopId(shopInfoService.queryShopInfoIdByName(cart.getShomName()));
			orderDetail.setQuantity(cart.getNumber());
		}
		orderDetailService.addOrderDetail(orderDetail);
		request.setAttribute("order", order);
		request.setAttribute("totalAmount", totalAmount);
		session.removeAttribute("list");
	    request.getRequestDispatcher("order.jsp").forward(request, response);
	}
	protected void queryStatus(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
	    String orderId = request.getParameter("orderId");
	    int status = orderService.queryStatusByOrderId(orderId);
	    PrintWriter out = response.getWriter();
	    String statusString = "";
	    if(status != -1){
	    	switch (status) {
	    	case 0:
	            statusString = "订单待审核";
	            break;
	        case 1:
	            statusString = "订单已审核";
	            break;
	        case 2:
	        	statusString = "订单已付款";
	            break;
	        case 3:
	        	statusString = "订单已发货";
	            break;
	    }
	}else {
    	statusString = "您输入的订单号有误";
	}
	    out.print(statusString);
	    out.flush();
	    out.close();
}
	protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    HttpSession session = request.getSession();
	    String orderId = request.getParameter("orderId");
	    int newState = Integer.parseInt(request.getParameter("newState"));
	    boolean bo = orderService.updateStatus(orderId, newState);

	    response.setContentType("application/json");
	    PrintWriter out = response.getWriter();
	    JSONObject jsonResponse = new JSONObject();

	    if (bo) {
	        List<Order> list = orderService.queryAllOrder();
	        session.setAttribute("OrderList", list);
	        JSONArray jsonArray = new JSONArray();
	        for (Order order : list) {
	            JSONObject jsonObject = new JSONObject(); 
	            try {
	            	jsonObject.put("orderId", order.getOrderId());
	            	jsonObject.put("createDtm", order.getCreateDtm());
	            	jsonObject.put("state", order.getState());
		            jsonResponse.put("success", true);
			        jsonResponse.put("orders", jsonArray);
				} catch (JSONException e) {
					e.printStackTrace();
				} 
	            jsonArray.put(jsonObject);
	        }
	    } 
	    out.print(jsonResponse.toString());
	    out.flush();
	    out.close();
	}

}

package org.YaoLeGouDB.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.YaoLeGouDB.Dao.ShopInfoDao;
import org.YaoLeGouDB.Dao.ShopTypeDao;
import org.YaoLeGouDB.Impl.ShopInfoDaoImpl;
import org.YaoLeGouDB.Impl.ShopTypeDaoImpl;
import org.YaoLeGouDB.entity.ShopInfo;
import org.YaoLeGouDB.entity.ShopType;

/**
 * Servlet implementation class ShopSelectServlet
 */
@WebServlet(urlPatterns={"/ht/ShopSelect.do"})
public class ShopSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopSelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String shopName = request.getParameter("ShopName");
		String shopType = request.getParameter("ShopType");
		String state = request.getParameter("State");
		ShopTypeDao shopTypeDao = new ShopTypeDaoImpl();
		ShopInfoDao shopInfoDao = new ShopInfoDaoImpl();
		if(state == null){
			ShopInfo shopInfo = new ShopInfo();
			if(shopName != null && !("").equals(shopName)){
				shopInfo.setShopname(shopName);
			}
			if(shopType != null && !("0").equals(shopType)){
				shopInfo.setShoptypeid(Integer.parseInt(shopType));
			}else {
				shopType = "0";
			}
			List<ShopType> ShopTypeList = shopTypeDao.GetAllShopTypeInfo();			
			List<ShopInfo> ShopInfoList = shopInfoDao.GetAllInfo(shopInfo);
			request.setAttribute("typeid", shopType);
			request.setAttribute("ShopName", shopName);
			request.setAttribute("ShopInfoList", ShopInfoList);
			request.getSession().setAttribute("stList", ShopTypeList);
			request.getRequestDispatcher("/ht/ShopSelect.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

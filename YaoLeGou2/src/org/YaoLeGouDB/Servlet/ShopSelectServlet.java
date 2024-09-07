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
import org.YaoLeGouDB.entity.User;
import org.YaoLeGouDB.utils.pageBean;

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
		String State = request.getParameter("State");
		if(State == null){
			String ShopName = request.getParameter("ShopName");
			String typeid = request.getParameter("ShopType");
			ShopInfo shopInfo = new ShopInfo();
			if(ShopName != null && !ShopName.equals("")){
				shopInfo.setShopname(ShopName);
			}
			if(typeid != null && !typeid.equals("0")){
				shopInfo.setShoptypeid(Integer.parseInt(typeid));
			}
			ShopTypeDao shopTypeDao = new ShopTypeDaoImpl();
			List<ShopType> ShopTypeList = shopTypeDao.GetAllShopTypeInfo();			
			if(typeid == null){
				typeid = "0";
			}
			ShopInfoDao shopInfoDao = new ShopInfoDaoImpl();
			List<ShopInfo> ShopInfoList = shopInfoDao.GetAllInfo(shopInfo);
			request.setAttribute("typeid", typeid);
			request.setAttribute("ShopName", ShopName);
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

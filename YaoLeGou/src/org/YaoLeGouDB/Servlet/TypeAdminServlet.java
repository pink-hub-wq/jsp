package org.YaoLeGouDB.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.YaoLeGouDB.Dao.ShopTypeDao;
import org.YaoLeGouDB.Impl.ShopTypeDaoImpl;
import org.YaoLeGouDB.entity.ShopType;

/**
 * Servlet implementation class TypeAdminServlet
 */
@WebServlet("/ht/TypeAdmin.do")
public class TypeAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TypeAdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String state = request.getParameter("State");
		if(state == null){
			getAllShopTypeInfo(request,response);
		}else if(("add").equals(state)){
			addShopTypeInfo(request,response);
		}else if(("del").equals(state)){		
			deleteShopTypeInfo(request,response);
		}else if(("SelectUpdate").equals(state)){
			selectUpdateShopTypeInfo(request,response);
		}else if(("Update").equals(state)){	
			updateShopTypeInfo(request,response);
		}
	}
	protected void getAllShopTypeInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ShopTypeDao shopTypeDao = new ShopTypeDaoImpl();
		String typenameOrId = request.getParameter("typenameOrId");
		if(typenameOrId != null && !("".equals(typenameOrId))){			
			ShopType shopType = new ShopType();
			shopType.setShoptypename(typenameOrId);
			int shoptypeid = 0;
			try {
				shoptypeid = Integer.parseInt(typenameOrId);
			    shopType.setShoptypeid(shoptypeid);
			} catch (NumberFormatException e) {
			    e.printStackTrace();
			}
			List<ShopType> list2 = shopTypeDao.GetAllShopTypeInfo(shopType);
			request.setAttribute("ShopTypeList", list2);
			request.getRequestDispatcher("TypeAdmin.jsp").forward(request, response);
		}else {
			List<ShopType> list = shopTypeDao.GetAllShopTypeInfo();	
			request.setAttribute("ShopTypeList", list);
			request.getRequestDispatcher("TypeAdmin.jsp").forward(request, response);
		}
	}
	protected void addShopTypeInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ShopTypeDao shopTypeDao = new ShopTypeDaoImpl();
		String TypeName = request.getParameter("newpassword");
		boolean bo = shopTypeDao.AddShopTypeInfo(TypeName);	
		List<ShopType> list = shopTypeDao.GetAllShopTypeInfo();	
		request.setAttribute("ShopTypeList", list);
		request.getRequestDispatcher("TypeAdmin.jsp").forward(request, response);
	}
	protected void deleteShopTypeInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ShopTypeDao shopTypeDao = new ShopTypeDaoImpl();
		String id = request.getParameter("id");
		shopTypeDao.ByTypeIdDelInfo(id);
		List<ShopType> list = shopTypeDao.GetAllShopTypeInfo();	
		request.setAttribute("ShopTypeList", list);
		request.getRequestDispatcher("TypeAdmin.jsp").forward(request, response);
	}
	protected void selectUpdateShopTypeInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ShopTypeDao shopTypeDao = new ShopTypeDaoImpl();
		String id = request.getParameter("id");
		ShopType shopType = shopTypeDao.ByTypeIDGetAllInfo(id);
		request.setAttribute("st", shopType);
		request.getRequestDispatcher("/ht/UpdateType.jsp").forward(request, response);	
	}
	protected void updateShopTypeInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ShopTypeDao shopTypeDao = new ShopTypeDaoImpl();
		String name = request.getParameter("newpassword");
		String id = request.getParameter("id");
		shopTypeDao.ByIdUpdateInfo(id, name);
		request.getRequestDispatcher("/ht/UpdateType.jsp").forward(request, response);	
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

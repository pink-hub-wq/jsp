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
@WebServlet(urlPatterns={"/TypeAdmin.do"})
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
		String State = request.getParameter("State");
		ShopTypeDao shopTypeDao = new ShopTypeDaoImpl();
		if(State == null){			
			List<ShopType> ShopTypeList = shopTypeDao.GetAllShopTypeInfo();			
			request.setAttribute("ShopTypeList", ShopTypeList);
			request.getRequestDispatcher("TypeAdmin.jsp").forward(request, response);
		}else if(State.equals("add")){
			String TypeName = request.getParameter("newpassword");
			boolean bo = shopTypeDao.AddShopTypeInfo(TypeName);		
			response.sendRedirect(request.getContextPath()+"/ht/TypeAdmin.do");		
		}else if(State.equals("del")){		
			String id = request.getParameter("id");
			shopTypeDao.ByTypeIdDelInfo(id);
		}else if(State.equals("SelectUpdate")){		
			String id = request.getParameter("id");
			ShopType shopType = shopTypeDao.ByTypeIDGetAllInfo(id);
			request.setAttribute("st", shopType);
			request.getRequestDispatcher("/ht/UpdateType.jsp").forward(request, response);
		}else if(State.equals("Update")){			
			String name = request.getParameter("newpassword");
			String id = request.getParameter("id");
			shopTypeDao.ByIdUpdateInfo(id, name);
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

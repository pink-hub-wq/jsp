package com.edu.seiryo.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.entity.User2;
import com.edu.seiryo.service.UserService2;
import com.edu.seiryo.service.imp.UserServiceImp2;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    UserService2 userService2 = new UserServiceImp2();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String opt = request.getParameter("opt");
		if("delete".equals(opt)){
			delete(request, response);
		}else if("update".equals(opt)){
			update(request, response);
		}else if("queryAllUserList".equals(opt)){
			queryAllUserList(request, response);
		}else if("queryUser".equals(opt)){
			queryUser(request, response);
		}else if("deleteAll".equals(opt)){
			deleteAll(request, response);
		}
	}
    /**
     * 查询所有用户
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void queryAllUserList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	List<User2> list = userService2.queryAllUserList();
		request.setAttribute("allUserList", list);
    	request.getRequestDispatcher("user.jsp").forward(request, response);
    	
    }
    /**
     * 删除用户
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	int id = Integer.parseInt(request.getParameter("id"));
    	boolean bo = false;
    	bo = userService2.deleteUserById(id);
    	if(bo){
    		request.setAttribute("msg", "删除成功");
    		queryAllUserList(request, response);
    		request.getRequestDispatcher("user.jsp").forward(request, response);
    	}else {
    		request.setAttribute("msg", "删除失败");
    		queryAllUserList(request, response);
    		request.getRequestDispatcher("user.jsp").forward(request, response);
		}
    }
    /**
     * 查询用户
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    private void queryUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	User2 user = new User2(); 
    	String id = request.getParameter("id");
    	if(id != null){
    		int id2 = Integer.parseInt(id);
    		boolean bo = false;
        	user = userService2.queryUserListById(id2);
        	if(user.getId() != 0){
        		request.setAttribute("user", user);
            	request.getRequestDispatcher("update.jsp").forward(request, response);
        	}else {
        		request.getRequestDispatcher("user.jsp").forward(request, response);
    		}
    	}
    }
    /**
     * 修改用户信息
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	int id = Integer.parseInt(request.getParameter("id"));
    	String userName = request.getParameter("userName");
    	String sex = request.getParameter("sex");
    	String birthday = request.getParameter("birthday");
    	String company = request.getParameter("company");
    	boolean bo = false;
    	bo = userService2.updateUserListById(new User2(id, userName, sex,company,birthday));
    	if(bo){
    		request.setAttribute("msg", "修改成功");
    		queryAllUserList(request, response);
    		request.getRequestDispatcher("index.jsp").forward(request, response);
    	}else {
    		request.setAttribute("msg", "修改失败");
    		queryAllUserList(request, response);
    		request.getRequestDispatcher("index.jsp").forward(request, response);
		}
    }
    /**
     * 删除所有用户
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    private void deleteAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	boolean bo = false;
		bo = userService2.deleteAll();
    	if(bo){
    		request.setAttribute("msg", "删除成功");
    		queryAllUserList(request, response);
    		request.getRequestDispatcher("main.jsp").forward(request, response);
    	}else {
    		request.setAttribute("msg", "删除失败");
    		queryAllUserList(request, response);
    		request.getRequestDispatcher("main.jsp").forward(request, response);
		}
    }
}

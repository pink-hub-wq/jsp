package com.edu.seiryo.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserService;
import com.edu.seiryo.service.imp.UserServiceImp;

/**
 * Servlet implementation class UserServlet
 */
public class UsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService userService = new UserServiceImp();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String opt = request.getParameter("opt");
		if("regist".equals(opt)){
			regist(request, response);
		}else if("login".equals(opt)){
			login(request, response);
		}else if("delete".equals(opt)){
			delete(request, response);
		}else if("update".equals(opt)){
			update(request, response);
		}else if("queryUser".equals(opt)){
			queryUser(request, response);
		}else if("deleteAll".equals(opt)){
			deleteAll(request, response);
		}
	}
    /**
     * 注册
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    private void regist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String userName = request.getParameter("userName");
    	String password = request.getParameter("password");
    	boolean bo = false;
    	bo = userService.regist(new User(userName,password));
    	if(bo){
    		request.setAttribute("msg", "注册成功");
    		request.getRequestDispatcher("index.jsp").forward(request, response);
    	}else {
    		request.setAttribute("msg", "注册失败");
    		request.getRequestDispatcher("regist.jsp").forward(request, response);
		}
    }
    /**
     * 登录
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String userName = request.getParameter("userName");
    	String password = request.getParameter("password");
    	boolean bo = false;
    	bo = userService.login(new User(userName,password));
    	if(bo){
    		request.setAttribute("msg", "登录成功");
    		queryAllUserList(request, response);
    		request.getRequestDispatcher("main.jsp").forward(request, response);
    	}else {
    		request.setAttribute("msg", "登录失败");
    		request.getRequestDispatcher("login.jsp").forward(request, response);
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
    	List<User> list = userService.queryAllUserList();
    	if(list.size() != 0){
    		request.setAttribute("allUserList", list);
        	request.getRequestDispatcher("main.jsp").forward(request, response);
    	}else {
    		request.getRequestDispatcher("login.jsp").forward(request, response);
		}
    	
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
    	bo = userService.deleteUserById(id);
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
    /**
     * 查询用户
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    private void queryUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	User user = new User(); 
    	int id = Integer.parseInt(request.getParameter("id"));
    	boolean bo = false;
    	user = userService.queryUserListById(id);
    	if(user.getId() != 0){
    		request.setAttribute("user", user);
        	request.getRequestDispatcher("update.jsp").forward(request, response);
    	}else {
    		request.getRequestDispatcher("login.jsp").forward(request, response);
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
    	String password = request.getParameter("password");
    	boolean bo = false;
    	bo = userService.updateUserListById(new User(id, userName, password));
    	if(bo){
    		request.setAttribute("msg", "修改成功");
    		queryAllUserList(request, response);
    		request.getRequestDispatcher("main.jsp").forward(request, response);
    	}else {
    		request.setAttribute("msg", "修改失败");
    		queryAllUserList(request, response);
    		request.getRequestDispatcher("main.jsp").forward(request, response);
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
    	String[] list = request.getParameterValues("id");
    	boolean bo = false;
    	for (String ids : list) {
			int id = Integer.parseInt(ids);
			bo = userService.deleteUserById(id);
		}
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

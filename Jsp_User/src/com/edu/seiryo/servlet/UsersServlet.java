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
     * ע��
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
    		request.setAttribute("msg", "ע��ɹ�");
    		request.getRequestDispatcher("index.jsp").forward(request, response);
    	}else {
    		request.setAttribute("msg", "ע��ʧ��");
    		request.getRequestDispatcher("regist.jsp").forward(request, response);
		}
    }
    /**
     * ��¼
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
    		request.setAttribute("msg", "��¼�ɹ�");
    		queryAllUserList(request, response);
    		request.getRequestDispatcher("main.jsp").forward(request, response);
    	}else {
    		request.setAttribute("msg", "��¼ʧ��");
    		request.getRequestDispatcher("login.jsp").forward(request, response);
		}
    }
    /**
     * ��ѯ�����û�
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
     * ɾ���û�
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
    		request.setAttribute("msg", "ɾ���ɹ�");
    		queryAllUserList(request, response);
    		request.getRequestDispatcher("main.jsp").forward(request, response);
    	}else {
    		request.setAttribute("msg", "ɾ��ʧ��");
    		queryAllUserList(request, response);
    		request.getRequestDispatcher("main.jsp").forward(request, response);
		}
    }
    /**
     * ��ѯ�û�
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
     * �޸��û���Ϣ
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
    		request.setAttribute("msg", "�޸ĳɹ�");
    		queryAllUserList(request, response);
    		request.getRequestDispatcher("main.jsp").forward(request, response);
    	}else {
    		request.setAttribute("msg", "�޸�ʧ��");
    		queryAllUserList(request, response);
    		request.getRequestDispatcher("main.jsp").forward(request, response);
		}
    }
    /**
     * ɾ�������û�
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
    		request.setAttribute("msg", "ɾ���ɹ�");
    		queryAllUserList(request, response);
    		request.getRequestDispatcher("main.jsp").forward(request, response);
    	}else {
    		request.setAttribute("msg", "ɾ��ʧ��");
    		queryAllUserList(request, response);
    		request.getRequestDispatcher("main.jsp").forward(request, response);
		}
    }
}

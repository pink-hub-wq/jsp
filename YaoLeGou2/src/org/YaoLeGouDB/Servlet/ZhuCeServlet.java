package org.YaoLeGouDB.Servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.YaoLeGouDB.Dao.UserDao;
import org.YaoLeGouDB.Dao.UserInfoDao;
import org.YaoLeGouDB.Impl.UserDaoImpl;
import org.YaoLeGouDB.Impl.UserInfoDaoImpl;
import org.YaoLeGouDB.entity.User;
import org.YaoLeGouDB.entity.UserInfo;

@WebServlet(urlPatterns={"/ZhuCe.do"})
public class ZhuCeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*PrintWriter out = response.getWriter();*/
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");

		String State = request.getParameter("State");
		if(State == null){
			
			String phone = request.getParameter("phone");
			
			request.setAttribute("phone", phone);
			request.getRequestDispatcher("/ZhuCe2.jsp").forward(request, response);
			
			
		}else if(State.equals("add")){
			//获取手机号和密码
			String phone = request.getParameter("phone");
			String pwd = request.getParameter("pwd");
			
			//生成八位随机数
			Random random = new Random();
			int suiji = random.nextInt(99999999);
			String UserName = suiji+"";
			
			//赋值
			User u = new User();
			u.setUsername(UserName);
			u.setPassword(pwd);
			
			UserInfo ui = new UserInfo();
			ui.setUsername(UserName);
			ui.setPhone(phone);

			//随机生成网名
			String[] name1 = new String[]{"最帅的","好看的","美丽的","会撩妹的","爱玩快手的","可爱的","爱听音乐的","爱斗图的","细心的","爱玩抖音的"};
			String[] name2 = new String[]{"小红","小仙女","小清新","郭德纲","小白","翠花","熊大","熊二","光头强","老崔"};
			int n1 = random.nextInt(10);
			int n2 = random.nextInt(10);
			String UserNick = name1[n1]+name2[n2];
			
			ui.setUsernick(UserNick);
			u.setUserinfo(ui);
			
			UserDao ud = new UserDaoImpl();
			//执行增加用户
			boolean is = ud.AddUserNameInfo(u);
			
			response.getWriter().print(UserName);
		}else if(State.equals("yanzhengs")){
			
			String Phone = request.getParameter("Phone");
			UserInfoDao uid = new UserInfoDaoImpl();
			boolean is = uid.ByPhoneGetAllInfo(Phone);
			response.getWriter().print(is);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//default debug doGet() method
		doGet(request, response);
	}

}

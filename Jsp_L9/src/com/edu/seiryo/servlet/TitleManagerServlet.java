package com.edu.seiryo.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.edu.seiryo.entity.Reply;
import com.edu.seiryo.entity.Title;
import com.edu.seiryo.service.ReplyService;
import com.edu.seiryo.service.TitleService;
import com.edu.seiryo.service.imp.ReplyServiceImp;
import com.edu.seiryo.service.imp.TitleServiceImp;

/**
 * Servlet implementation class TitleManagerServlet
 */
@WebServlet("/TitleManagerServlet")
public class TitleManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TitleService titleService = new TitleServiceImp();
    ReplyService replyService = new ReplyServiceImp();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TitleManagerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String flag = request.getParameter("flag");
		if("_send".equals(flag)){
			send(request,response);
		}else if ("_queryAll".equals(flag)) {
			queryAll(request,response);
		}else if ("_queryReply".equals(flag)) {
			queryReply(request,response);
		}else if ("_queryTitle".equals(flag)) {
			_queryTitle(request,response);
		}else if ("_reply".equals(flag)) {
			reply(request,response);
		}
	}
	protected void _queryTitle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Title title = titleService.queryTitle(id);
		List<Reply> replyList = replyService.queryReply(id);
	    request.setAttribute("title", title);
	    request.setAttribute("replyList", replyList);
	    request.getRequestDispatcher("showReply.jsp").forward(request, response);
	}
	protected void reply(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String msg = request.getParameter("msg");
		HttpSession session = request.getSession();
		String account = (String)session.getAttribute("account");
		Reply reply = new Reply();
		reply.setAccount(account);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = simpleDateFormat.format(new Date());
		reply.setTime(date);
		reply.setMsg(msg);
		reply.setTitleId(id);
		replyService.addReply(reply);
		response.sendRedirect("TitleManagerServlet?flag=_queryTitle&id=" + id);
	}
	protected void send(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		boolean bo = titleService.addTitle(title);
		if(bo){
			request.setAttribute("msg", "·¢Ìû³É¹¦");
			request.getRequestDispatcher("showReply.jsp").forward(request, response);
		}
	}
	protected void queryAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Title> list = titleService.queryTitle();
		request.setAttribute("titleList", list);
		request.getRequestDispatcher("queryTitle.jsp").forward(request, response);
	}
	protected void queryReply(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int titleId = Integer.parseInt(request.getParameter("id"));
		List<Reply> replyList = replyService.queryReply(titleId);
		Title title = titleService.queryTitle(titleId);
		request.setAttribute("replyList", replyList);
		request.setAttribute("title", title);
		request.getRequestDispatcher("showReply.jsp").forward(request, response);
	}
}

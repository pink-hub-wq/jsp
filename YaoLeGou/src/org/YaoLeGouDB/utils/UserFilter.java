package org.YaoLeGouDB.utils;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns={"/LeGou.do","/DaiFuKuan.do","/DaiShouHuo.do","/DingDan.jsp","/DingHuoTongZhi.do","/FaBuShop.do","/ShopView.do","/Update.do","/UpdateColor.do","/YiWanCheng.do"})
public class UserFilter implements Filter {

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chains) throws IOException, ServletException {
		
		HttpServletRequest request =  (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)resp;
		Object user = request.getSession().getAttribute("user");
		if(user == null){
			response.sendRedirect(request.getContextPath()+"/index.do");
			return;
		}
		//放行，验证通过了
		chains.doFilter(request, response);

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}

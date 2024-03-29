package kr.co.inter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthInter extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, throws Exception ) {
		HttpSession session = request.getSession(false);
		Object login = session.getAttribute("login");
		
		if(login == null) {
			
			String uri = request.getRequestURI();
			String querString = request.getQueryString();
			
			if(querString == null || querString=="") {
					
			} else {
				querString = "?"+querString;
			}
			
			if(request.getMethod().equals("GET")) {
				
				String path = uri + querString;
				session.setAttribute("path", path);
			}
			
			session.setAttribute("path", value);
			
			response.sendRedirect("/member/login");
			
			return false;
		}
	
		return true;
	}
	
	

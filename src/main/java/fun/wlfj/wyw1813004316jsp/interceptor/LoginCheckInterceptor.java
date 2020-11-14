package fun.wlfj.wyw1813004316jsp.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoginCheckInterceptor implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		Object isLogined = session.getAttribute("isLogined");
		if(isLogined != null && (Boolean)isLogined) {
			return true;
		}else {
			response.sendRedirect("/book/userLogin");
			return false;
		}
	}	
	
}

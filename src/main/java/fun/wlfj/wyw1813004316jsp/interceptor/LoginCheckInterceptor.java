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
			// 这里要将来源的站点传入其中
			String originURL = request.getRequestURL().toString();
			String jumpNeeded = originURL.substring(originURL.indexOf("/", 8));
			// 现在我们要得到第三个斜杠后面的所有东西
			response.sendRedirect("login?from=" + jumpNeeded);
			return false;
		}
	}	
	
}

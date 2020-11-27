package fun.wlfj.wyw1813004316jsp;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import fun.wlfj.wyw1813004316jsp.interceptor.LoginCheckInterceptor;

@Configuration
public class MvcConfigurer implements WebMvcConfigurer {

	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginCheckInterceptor())
		.addPathPatterns("/add")
		.addPathPatterns("/insert")
		.addPathPatterns("/modify")
		.addPathPatterns("/delete");
	}
}

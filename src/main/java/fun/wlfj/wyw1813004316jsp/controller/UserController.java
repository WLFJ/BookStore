package fun.wlfj.wyw1813004316jsp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * 用户登陆的相关控制类
 * @author yves
 *
 */
@Controller
public class UserController {

	@Value("${yves.username}")
	private String username;
	
	@Value("${yves.password}")
	private String password;

	@GetMapping("/login")
	public ModelAndView userLogin(@RequestParam(defaultValue="/") String from) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("from", from);
		mv.setViewName("login");
		return mv;
	}
	
	@PostMapping("/login")
	public RedirectView login(String username, String password, @RequestParam(defaultValue="/") String from, HttpServletRequest request) {
		if(username.equals(this.username) && password.equals(this.password)) {
			HttpSession session = request.getSession();
			session.setAttribute("isLogined", true);
			// 我们要支持跳转，这就需要参数支持了
			return new RedirectView(from);
		}else {
			return new RedirectView("login");
		}
	}
	
	@RequestMapping("/logout")
	public RedirectView logout(HttpServletRequest request) {
		request.getSession().setAttribute("isLogined", null);
		return new RedirectView("details");
	}
}

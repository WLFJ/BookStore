package fun.wlfj.wyw1813004316jsp.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@Autowired
	private ExceptionChinesesHelper helper;

	@ExceptionHandler(Exception.class)
	public ModelAndView globalExceptionHandler(Exception e){
		System.err.print(e);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("error_page");
		Throwable t = e.getCause();
		while(t.getCause() != null) t = t.getCause();
		mv.addObject("error_cause", helper.getMsg(t.getClass().toString()));
		return mv;
	}

}

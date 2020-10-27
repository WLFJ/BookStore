package fun.wlfj.wyw1813004316jsp.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import fun.wlfj.wyw1813004316jsp.entity.Book;
import fun.wlfj.wyw1813004316jsp.service.IBookService;

@Controller
@RestController
@RequestMapping("/book")
public class MyController {
	
	@Autowired
	private IBookService wyw1813004316bookService;
	
	private static final String IMG_PATH = "/Users/yves/spring_file_upload/";
	
	@RequestMapping("/detail")
	@ResponseBody
	public Map<String, Object> getBookById_JSON(int wyw1813004316id){
		Map<String, Object> map = new HashMap<String, Object>();
		Book b = wyw1813004316bookService.getBookById(wyw1813004316id);
		map.put("wyw1813004316id", b.getId());
		map.put("wyw1813004316name", b.getName());
		map.put("wyw1813004316img", b.getImg());
		map.put("wyw1813004316price", b.getPrice());
		return map;
	}
	
	@RequestMapping("/add")
	public ModelAndView showAddBook() {
		ModelAndView wyw1813004316mv = new ModelAndView();
		wyw1813004316mv.setViewName("book/addBook");
		return wyw1813004316mv;
	}
	
	@PostMapping("/insert")
    public RedirectView insertBook_POST(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("price") double price, @RequestParam("img") MultipartFile imgFile){
		String imgName = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
		try {
			FileCopyUtils.copy(imgFile.getInputStream(), new FileOutputStream(IMG_PATH + imgName));
		} catch (Exception e) {

		}
		Book book = new Book(id, name, imgName, price);
		wyw1813004316bookService.addBook(book);
		return new RedirectView("/book/details");
    }
	
	@RequestMapping("/details")
	public ModelAndView getBooksDetail_JSP() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("wyw1813004316books", wyw1813004316bookService.getBooks());
		mv.setViewName("book/booksDetail");
		return mv;
	}
	
	@RequestMapping("/showImg/{fileName}")
	public void showImg(@PathVariable("fileName") String fileName, HttpServletResponse response) {
		response.setHeader("Content-Disposition", "attachment;fileName=" + "awsome");
		File imgFile = new File(IMG_PATH + fileName);
        responseFile(response, imgFile);	
	}
	
	/**
     * 响应输出图片文件
     * @param response
     * @param imgFile
     */
    private void responseFile(HttpServletResponse response, File imgFile) {
        try(InputStream is = new FileInputStream(imgFile);
            OutputStream os = response.getOutputStream();){
            byte [] buffer = new byte[1024]; // 图片文件流缓存池
            while(is.read(buffer) != -1){
                os.write(buffer);
            }
            os.flush();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}

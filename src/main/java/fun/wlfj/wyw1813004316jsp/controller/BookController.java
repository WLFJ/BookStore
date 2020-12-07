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
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
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
public class BookController {
	
	@Autowired
	private IBookService wyw1813004316bookService;
	
	@Value("${yves.upload.path}")
	private String IMG_PATH;

	@RequestMapping("/")
	public ModelAndView index(ModelAndView mv) {
		mv.setViewName("redirect:details");
		return mv;
	}
	
	@RequestMapping("/detail")
	@ResponseBody
	public ModelAndView showBookDetail(Long wyw1813004316id, ModelAndView mv) throws Exception{
		Book book = wyw1813004316bookService.getBookById(wyw1813004316id);
		mv.addObject("book", book);
		mv.setViewName("detail");
		return mv;
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteBook(@RequestParam("wyw1813004316id") Long id, ModelAndView mv) {
		wyw1813004316bookService.deleteBook(id);
		mv.setViewName("redirect:/");
		return mv;
	}
	
	@RequestMapping("/add")
	public ModelAndView showAddBook() {
		ModelAndView wyw1813004316mv = new ModelAndView();
		wyw1813004316mv.setViewName("addBook");
		return wyw1813004316mv;
	}
	
	@PostMapping("/insert")
    public RedirectView insertBook_POST(@RequestParam("id") Long id, @RequestParam("name") String name, @RequestParam("price") double price, @RequestParam("img") MultipartFile imgFile, String detail){
		String imgName = null;
		if(!imgFile.isEmpty()) {
			imgName = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
			try {
				FileCopyUtils.copy(imgFile.getInputStream(), new FileOutputStream(IMG_PATH + imgName));
			} catch (Exception e) {

			}
		}
		Book book = new Book(id, name, imgName, price, detail);
		wyw1813004316bookService.addBook(book);
		return new RedirectView("details");
    }
	
	@RequestMapping("/details")
	public ModelAndView getBooksDetail_JSP() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.addObject("wyw1813004316books", wyw1813004316bookService.getBooks());
		mv.setViewName("booksDetail");
		return mv;
	}
	
	@RequestMapping("/detail/json")
	public Object getDetailsByJson(Long id) throws Exception {
		Map<String, String> map = new HashMap<>();
		Book book = wyw1813004316bookService.getBookById(id);
		map.put("detail", book.getDetail());
		return map;
	}
	
	@RequestMapping("/showImg/{fileName}")
	public void showImg(@PathVariable("fileName") String fileName, HttpServletResponse response) {
		response.setHeader("Content-Disposition", "attachment;fileName=" + "awsome");
		File imgFile = new File(IMG_PATH + fileName);
        responseFile(response, imgFile);	
	}
	
	@GetMapping("/modify")
	public ModelAndView showUpdate(@RequestParam("wyw1813004316id") Long id, ModelAndView mv) throws Exception {
		Book book = wyw1813004316bookService.getBookById(id);
		mv.addObject("book", book);
		mv.setViewName("updateBook");
		return mv;
	}
	
	@RequestMapping("/search")
	public ModelAndView search(String keyword, ModelAndView mv) throws Exception {
		mv.setViewName("booksDetail");
		mv.addObject("wyw1813004316books", wyw1813004316bookService.getBookByKeyword(keyword));
		return mv;
	}

	@PostMapping("/modify")
	public ModelAndView updateBook(Long id, String name, Double price, @RequestParam("img") MultipartFile imgFile, String detail, ModelAndView mv) throws Exception{
		Book book = wyw1813004316bookService.getBookById(id);
		book.setName(name);
		book.setPrice(price);
		book.setDetail(detail);
		if(!imgFile.isEmpty()) {
			String imgName = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
			try {
				FileCopyUtils.copy(imgFile.getInputStream(), new FileOutputStream(IMG_PATH + imgName));
			} catch (Exception e) {

			}
			book.setImg(imgName);
		}
		wyw1813004316bookService.updateBook(book);
		mv.setViewName("redirect:/");
		return mv;
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

package fun.wlfj.wyw1813004316jsp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fun.wlfj.wyw1813004316jsp.dao.IBookDao;
import fun.wlfj.wyw1813004316jsp.entity.Book;
import fun.wlfj.wyw1813004316jsp.service.IBookService;

@Service
public class BookServiceImpl implements IBookService {
	
	@Autowired
	private IBookDao wyw1813004316bookDao;
	
	@Override
	public Book getBookById(int wyw1813004316id) {
		return wyw1813004316bookDao.getBookById(wyw1813004316id);
	}

	@Override
	public Book[] getBooks() {
		return wyw1813004316bookDao.getBooks();
	}

	@Override
	public void addBook(Book wyw1813004316book) {
		wyw1813004316bookDao.addBook(wyw1813004316book);
	}

}

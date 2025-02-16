package fun.wlfj.wyw1813004316jsp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fun.wlfj.wyw1813004316jsp.dao.IBookDao;
import fun.wlfj.wyw1813004316jsp.entity.Book;
import fun.wlfj.wyw1813004316jsp.exception.BookNotFoundError;
import fun.wlfj.wyw1813004316jsp.service.IBookService;

@Service
public class BookServiceImpl implements IBookService {
	
	@Autowired
	private IBookDao wyw1813004316bookDao;
	
	@Override
	public Book getBookById(long wyw1813004316id) throws Exception {
		Book book = wyw1813004316bookDao.getBookById(wyw1813004316id);
		if(book == null)
			throw new BookNotFoundError();
		else
			return book;
	}

	@Override
	public Book[] getBooks() throws Exception {
		Book[] books = wyw1813004316bookDao.getBooks();
		return books;
	}

	@Override
	public void addBook(Book wyw1813004316book) {
		wyw1813004316bookDao.addBook(wyw1813004316book);
	}

	@Override
	public void deleteBook(long id) {
		wyw1813004316bookDao.deleteBook(id);
		
	}

	@Override
	public void updateBook(Book book) {
		wyw1813004316bookDao.updateBook(book);
	}

	@Override
	public Book[] getBookByKeyword(String keyword){
		Book[] books = wyw1813004316bookDao.getBookByKeyword(keyword);
		return books;
	}

}

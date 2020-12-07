package fun.wlfj.wyw1813004316jsp.service;

import fun.wlfj.wyw1813004316jsp.entity.Book;

public interface IBookService {
	public Book getBookById(long wyw1813004316id) throws Exception;
	public Book[] getBooks() throws Exception;
	public void addBook(Book wyw1813004316book);
	public void deleteBook(long id);
	public void updateBook(Book book);
	public Book[] getBookByKeyword(String keyword);
}

package fun.wlfj.wyw1813004316jsp.service;

import fun.wlfj.wyw1813004316jsp.entity.Book;

public interface IBookService {
	public Book getBookById(int wyw1813004316id);
	public Book[] getBooks();
	public void addBook(Book wyw1813004316book);
	public void deleteBook(int id);
	public void updateBook(Book book);
	public Book[] getBookByKeyword(String keyword);
}

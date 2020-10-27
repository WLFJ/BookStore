package fun.wlfj.wyw1813004316jsp.dao;

import fun.wlfj.wyw1813004316jsp.entity.Book;

public interface IBookDao {
	public Book getBookById(int wyw1813004316id);
	public Book[] getBooks();
	public void addBook(Book wyw1813004316book);
}

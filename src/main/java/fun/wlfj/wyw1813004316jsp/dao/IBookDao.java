package fun.wlfj.wyw1813004316jsp.dao;

import org.apache.ibatis.annotations.Mapper;

import fun.wlfj.wyw1813004316jsp.entity.Book;

@Mapper
public interface IBookDao {
	public Book getBookById(long id);
	public Book[] getBooks();
	public void addBook(Book book);
	public void deleteBook(long id);
	public void updateBook(Book book);
	public Book[] getBookByKeyword(String keyword);
}

package fun.wlfj.wyw1813004316jsp.dao;

import org.apache.ibatis.annotations.Mapper;

import fun.wlfj.wyw1813004316jsp.entity.Book;

@Mapper
public interface IBookDao {
	public Book getBookById(int wyw1813004316id);
	public Book[] getBooks();
	public void addBook(Book wyw1813004316book);
}

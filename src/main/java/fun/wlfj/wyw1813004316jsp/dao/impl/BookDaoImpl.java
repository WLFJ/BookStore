package fun.wlfj.wyw1813004316jsp.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fun.wlfj.wyw1813004316jsp.dao.IBookDao;
import fun.wlfj.wyw1813004316jsp.entity.Book;

@Repository
public class BookDaoImpl implements IBookDao {
	
	private List<Book> wyw1813004316bkList = new ArrayList<Book>();

	public BookDaoImpl() {
		wyw1813004316bkList.add(new Book(1, "Linux大学教程", "1.jpg", 128.0));
		wyw1813004316bkList.add(new Book(2, "线性代数(第五版)", "2.png", 108.0));
		wyw1813004316bkList.add(new Book(3, "Python 机器学习基础教程", "3.jpg", 62.4));
		wyw1813004316bkList.add(new Book(4, "统计学习方法", "4.jpg", 66.7));
		wyw1813004316bkList.add(new Book(5, "Python 数据科学手册", "5.jpg", 86.10));
		wyw1813004316bkList.add(new Book(6, "Bash Cookbook 中文版", "6.jpg", 29.5));
	}
	
	@Override
	public Book getBookById(int wyw1813004316id) {
		for(Book b : wyw1813004316bkList) {
			if(b.getId() == wyw1813004316id) {
				return b;
			}
		}
		return null;
	}

	@Override
	public Book[] getBooks() {
		return wyw1813004316bkList.toArray(new Book[0]);
	}

	@Override
	public void addBook(Book wyw1813004316book) {
		wyw1813004316bkList.add(wyw1813004316book);
	}

}

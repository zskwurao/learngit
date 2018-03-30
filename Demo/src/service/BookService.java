package service;

import java.sql.SQLException;

import dao.BookDao;
import domain.Book;



public class BookService {

	public void add(Book book) throws SQLException {
		BookDao dao = new BookDao();
		dao.add(book);
	}

	public Book find(String bookname) throws Exception {

		BookDao dao = new BookDao();
		return dao.find(bookname);
	}

	public void delete(String id) throws SQLException {
		BookDao dao = new BookDao();
		dao.delete(id);
	}

	public void update(Book book) throws  Exception {
		BookDao dao = new BookDao();
		dao.update(book);
	}


	
}

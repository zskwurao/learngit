package dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import domain.Book;
import utils.DataSourceUtils;

public class BookDao {
	
	public void add(Book book) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		Connection conn = DataSourceUtils.getConnection();
		String sql="insert into book values(?,?,?,?)";
		
		runner.update(conn, sql, null,book.getBookname(),book.getAuther(),book.getPrice());
	}

	public Book find(String bookname) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from book where bookname=?";
		Book book = runner.query(sql, new BeanHandler<Book>(Book.class),bookname);
		return book;
	}

	public void delete(String id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql="delete from book where id=?";
		runner.update(sql, id);
	}

	public void update(Book book) throws Exception {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql="update book set bookname=?,auther=?,price=? where id=?";
		runner.update(sql, book.getBookname(),book.getAuther(),book.getPrice(),book.getId());
	}

}

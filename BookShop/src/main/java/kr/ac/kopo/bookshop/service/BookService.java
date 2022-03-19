package kr.ac.kopo.bookshop.service;

import java.util.List;

import kr.ac.kopo.bookshop.model.Book;

public interface BookService {

	List<Book> list();

	void delete(int bookid);

	void add(Book item);

	Book getItem(int bookid);

	void update(Book item);

}

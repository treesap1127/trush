package kr.ac.kopo.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.dao.MongoRepository;
import kr.ac.kopo.model.Book;
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	MongoRepository<Book> dao;
	@Override
	public List<Book> list() {
		return dao.list();
	}
	@Override
	public void add(Book item) {
		dao.add(item);
	}
	@Override
	public void update(Book item) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("bookid", item.getBookid());
		map.put("bookname", item.getBookname());
		map.put("publisher", item.getPublisher());
		map.put("price", item.getPrice());
		
		dao.update(item.getBookid(),map);
	}
	@Override
	public Book item(String bookid) {
		return dao.item(bookid);
	}
	@Override
	public void delete(String bookid) {
		dao.delete(bookid);
	}

}

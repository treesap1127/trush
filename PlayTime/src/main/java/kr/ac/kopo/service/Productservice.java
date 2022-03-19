package kr.ac.kopo.service;

import java.util.List;

import kr.ac.kopo.model.Product;
import kr.ac.kopo.util.Pager;

public interface Productservice {
	List<Product> list(Pager pager);

	Product item(int code);

	void update(Product item);

	void add(Product item);

	void delete(int code);

	void dummy();

	void init();

	List<Product> list();

}

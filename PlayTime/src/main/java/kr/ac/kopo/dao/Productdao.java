package kr.ac.kopo.dao;

import java.util.List;

import kr.ac.kopo.model.Product;
import kr.ac.kopo.util.Pager;

public interface Productdao {

	List<Product> list(Pager pager);

	Product item(int code);

	void update(Product item);

	void add(Product item);

	void delete(int code);

	int total(Pager pager);

}

package kr.ac.kopo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.dao.Productdao;
import kr.ac.kopo.model.Product;
import kr.ac.kopo.util.Pager;

@Service
public class ProductServiceImpl implements Productservice {
	@Autowired
	Productdao dao;

	@Override
	public List<Product> list(Pager pager) {
		int total = dao.total(pager);
		pager.setTotal(total);
		return dao.list(pager);
	}

	@Override
	public Product item(int code) {

		return dao.item(code);
	}

	@Override
	public void update(Product item) {
		dao.update(item);

	}

	@Override
	public void add(Product item) {
		dao.add(item);
	}

	@Override
	public void delete(int code) {
		dao.delete(code);

	}

	@Override
	public void dummy() {
		for (int index = 1; index < 100; index++) {
			Product item = new Product(); // 제품 생성과 등록!
			item.setName("제품명" + index);
			item.setSpec("규격" + index);
			item.setCategory("범주" + index);
			item.setManufacture("제조사" + index);
			item.setPrice(index * 1000);
			dao.add(item);
		}
	}

	@Override
	public void init() {
		Pager pager = new Pager();
		List<Product> list = dao.list(pager);
		do{
		for (Product item : list)
			dao.delete(item.getCode());
		}
		while(list.size()<1);
	}

	@Override
	public List<Product> list() {// 여기선 새 객체! 제품관리와 거래처!를 받아줘야해서 새객체
		Pager pager = new Pager();
		int total = dao.total(pager);//제품갯수에따라 합계계산
		pager.setTotal(total); 	//페이저에서 받아주고
		pager.setPerpage(total); //제품갯수를 perpage수로 받아버림! perpager=목록갯수
		return dao.list(pager);
	}
}

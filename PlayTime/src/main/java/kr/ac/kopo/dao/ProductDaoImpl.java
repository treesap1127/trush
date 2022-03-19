package kr.ac.kopo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.model.Product;
import kr.ac.kopo.util.Pager;
@Repository
public class ProductDaoImpl implements Productdao {
@Autowired
SqlSession sql;

@Override
public List<Product> list(Pager pager) {
	return sql.selectList("product.list",pager);
}


@Override
public Product item(int code) {
	return sql.selectOne("product.item", code);
}

@Override
public void update(Product item) {
	sql.update("product.update",item);
	
}

@Override
public void add(Product item) {
	sql.insert("product.add", item);
}

@Override
public void delete(int code) {
	sql.delete("product.delete",code);
	
}

@Override
public int total(Pager pager) {
	return sql.selectOne("product.total", pager);//selectone=한줄
}
}

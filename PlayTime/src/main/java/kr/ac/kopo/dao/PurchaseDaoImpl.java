package kr.ac.kopo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.model.Purchase;
import kr.ac.kopo.util.Pager;
@Repository
public class PurchaseDaoImpl implements PurchaseDao {
@Autowired
SqlSession sql;
	@Override
	public List<Purchase> list(Pager pager) {
		return sql.selectList("purchase.list", pager);
	}
	@Override
	public void add(Purchase item) {
		sql.insert("purchase.add",item);
	}
	@Override
	public Purchase item(int code) {
		return sql.selectOne("purchase.item", code);
	}
	@Override
	public void update(Purchase item) {
		sql.update("purchase.update", item);
	}
	@Override
	public void delete(int code) {
		sql.delete("purchase.delete", code);
	}

}

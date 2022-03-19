package kr.ac.kopo.dao;

import java.util.List;

import kr.ac.kopo.model.Purchase;
import kr.ac.kopo.util.Pager;

public interface PurchaseDao {

	List<Purchase> list(Pager pager);

	void add(Purchase item);

	Purchase item(int code);

	void update(Purchase item);

	void delete(int code);

}

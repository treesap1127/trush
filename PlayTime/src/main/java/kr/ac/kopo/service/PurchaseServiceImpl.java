package kr.ac.kopo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.dao.PurchaseDao;
import kr.ac.kopo.model.Purchase;
import kr.ac.kopo.util.Pager;
@Service
public class PurchaseServiceImpl implements PurchaseService {
@Autowired
PurchaseDao dao;
	@Override
	public List<Purchase> list(Pager pager) {
		return dao.list(pager);
	}
	@Override
	public void add(Purchase item) {
		dao.add(item);
	}
	@Override
	public Purchase item(int code) {
		return dao.item(code);
	}
	@Override
	public void update(Purchase item) {
		dao.update(item);
	}
	@Override
	public void delete(int code) {
		dao.delete(code);
	}

}

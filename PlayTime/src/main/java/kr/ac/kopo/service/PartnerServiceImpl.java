package kr.ac.kopo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.dao.PartnerDao;
import kr.ac.kopo.model.Partner;
import kr.ac.kopo.util.Pager;
@Service
public class PartnerServiceImpl implements PartnerService {
	@Autowired
	PartnerDao dao;
	@Override
	public List<Partner> list(Pager pager) {
		
		return dao.list(pager);
	}
	@Override
	public Partner item(int code) {
		// TODO Auto-generated method stub
		return dao.item(code);
	}
	@Override
	public void add(Partner item) {
		dao.add(item);
	}
	@Override
	public void update(Partner item) {
		dao.update(item);
		
	}
	@Override
	public void delete(int code) {
		dao.delete(code);
	}
	@Override
	public List<Partner> list() {
		Pager pager=new Pager();
		int total=dao.total(pager);
		pager.setTotal(total);
		pager.setPerpage(total);
		return dao.list(pager);
	}

}

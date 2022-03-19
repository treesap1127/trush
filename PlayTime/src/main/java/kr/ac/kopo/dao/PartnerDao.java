package kr.ac.kopo.dao;

import java.util.List;

import kr.ac.kopo.model.Partner;
import kr.ac.kopo.util.Pager;

public interface PartnerDao {

	List<Partner> list(Pager pager);

	Partner item(int code);

	void add(Partner item);

	void delete(int code);

	void update(Partner item);

	int total(Pager pager);


	
}

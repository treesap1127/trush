package kr.ac.kopo.service;

import java.util.List;

import kr.ac.kopo.model.Partner;
import kr.ac.kopo.util.Pager;

public interface PartnerService {

	List<Partner> list(Pager pager);

	Partner item(int code);

	void add(Partner item);

	void update(Partner item);

	void delete(int code);

	List<Partner> list();
	
}

package kr.ac.kopo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.model.Partner;
import kr.ac.kopo.util.Pager;
@Repository
public class PartnerDaoImpl implements PartnerDao {
@Autowired
SqlSession sql;
	
@Override
public List<Partner> list(Pager pager) {
	return sql.selectList("partner.list",pager);
}

@Override
public Partner item(int code) {
	return sql.selectOne("partner.item", code);
}

@Override
public void add(Partner item) {
	sql.insert("partner.add", item);
	
}

@Override
public void delete(int code) {
	sql.delete("partner.delete",code);
	
}

@Override
public void update(Partner item) {
	sql.update("partner.update", item);
	
}

@Override
public int total(Pager pager) {
	
	return sql.selectOne("partner.total", pager);
}


}

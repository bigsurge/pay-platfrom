package com.isoftstone.pay.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.isoftstone.pay.model.SendLog;
import com.isoftstone.pay.utils.SimpleIbatisDao;

@Repository
@SuppressWarnings("deprecation")
public class SendLogDao extends  SimpleIbatisDao {

	
	public List<SendLog> getResultList() {
		return getSqlMapClientTemplate().queryForList("getAllSendLog",null);  
	}

	
	public void save(SendLog entity) {
		getSqlMapClientTemplate().insert("insertSendLog", entity);
	}

	
	public void update(SendLog entity) {
		
		
	}

	
	public void delete(String id) {
		
		
	}

	
	public SendLog findById(String id) {
		
		return null;
	}

	
	public List<SendLog> findByHQL(String hql, Object... params) {
		
		return null;
	}

}

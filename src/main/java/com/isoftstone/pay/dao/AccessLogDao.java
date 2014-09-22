package com.isoftstone.pay.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.isoftstone.pay.model.AccessLog;
import com.isoftstone.pay.utils.SimpleIbatisDao;
/**
 * 
 * @author lllianga
 * 2014年9月18日下午1:22:25
 */
@Repository
@SuppressWarnings("deprecation")
public class AccessLogDao extends  SimpleIbatisDao {

    public List<AccessLog> getResultList() {
        
        return getSqlMapClientTemplate().queryForList("getAllAccessLog", null);
    }

    public void save(AccessLog entity) {
		
		getSqlMapClientTemplate().insert("insertAccessLog", entity);
	}


	public void update(AccessLog entity) {
		
	}


	public void delete(String id) {
		
		getSqlMapClientTemplate().insert("deleteAccessLog", id);
	}
	
	public List<AccessLog> findByOrderNo(String orderNo) {
		
		return getSqlMapClientTemplate().queryForList("getAccessLogByOrderNo",orderNo);  
	}


	public AccessLog findById(String id) {
		
		return null;
	}

	
	public List<AccessLog> findByHQL(String hql, Object... params) {
		
		return null;
	}

}

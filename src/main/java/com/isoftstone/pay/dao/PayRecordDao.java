package com.isoftstone.pay.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.isoftstone.pay.model.PayRecord;
import com.isoftstone.pay.utils.SimpleIbatisDao;

@Repository
@SuppressWarnings("deprecation")
public class PayRecordDao extends  SimpleIbatisDao {

	
	public List<PayRecord> getResultList() {
		return getSqlMapClientTemplate().queryForList("getAllPayRecord",null);  
	}

	
	public void save(PayRecord entity) {
		getSqlMapClientTemplate().insert("insertPayRecord", entity);
	}
	
	public List<PayRecord> getPayRecordByOrderNo(String orderNo) {
		return getSqlMapClientTemplate().queryForList("getPayRecordByOrderNo",orderNo);  
	}

	
	public void update(PayRecord entity) {
		
		
	}

	
	public void delete(String id) {
		
		
	}

	
	public PayRecord findById(String id) {
		
		return null;
	}

	
	public List<PayRecord> findByHQL(String hql, Object... params) {
		
		return null;
	}

}

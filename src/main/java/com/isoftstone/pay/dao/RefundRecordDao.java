package com.isoftstone.pay.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.isoftstone.pay.model.RefundRecord;
import com.isoftstone.pay.utils.SimpleIbatisDao;

@Repository
@SuppressWarnings("deprecation")
public class RefundRecordDao extends SimpleIbatisDao {

	
	public List<RefundRecord> getResultList() {
		return getSqlMapClientTemplate().queryForList("getAllRefundRecord",null);  
	}

	
	public void save(RefundRecord entity) {
		getSqlMapClientTemplate().insert("insertRefundRecord", entity);
	}
	
	public List<RefundRecord> getRefundRecordByChannelId(String channelId) {
		return getSqlMapClientTemplate().queryForList("getRefundRecordByChannelId",channelId);  
	}

	
	public void update(RefundRecord entity) {
		
		
	}

	
	public void delete(String id) {
		
		
	}

	
	public RefundRecord findById(String id) {
		
		return null;
	}

	
	public List<RefundRecord> findByHQL(String hql, Object... params) {
		
		return null;
	}

}

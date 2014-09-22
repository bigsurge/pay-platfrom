package com.isoftstone.pay.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.isoftstone.pay.model.GatewayInfo;
import com.isoftstone.pay.utils.SimpleIbatisDao;

@Repository
@SuppressWarnings("deprecation")
public class GatewayInfoDao extends  SimpleIbatisDao {

	
	public List<GatewayInfo> getResultList() {
		
		return getSqlMapClientTemplate().queryForList("getAllGatewayInfo",null);  
	}

	
	public void save(GatewayInfo entity) {
		
		getSqlMapClientTemplate().insert("insertGatewayInfo", entity);
	}
	
	public List<GatewayInfo> getGatewayInfoByGatewayId(String gatewayId) {
		return getSqlMapClientTemplate().queryForList("getGatewayInfoByGatewayId",gatewayId);  
	}
	
	public List<GatewayInfo> getGatewayInfoByChannelId(String channelId) {
		return getSqlMapClientTemplate().queryForList("getGatewayInfoByChannelId",channelId);  
	}

	
	public void update(GatewayInfo entity) {
		
		
	}

	
	public void delete(String id) {
		
		
	}

	
	public GatewayInfo findById(String id) {
		
		return null;
	}

	
	public List<GatewayInfo> findByHQL(String hql, Object... params) {
		
		return null;
	}

}

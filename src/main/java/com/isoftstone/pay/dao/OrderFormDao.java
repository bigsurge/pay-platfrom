package com.isoftstone.pay.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.isoftstone.pay.model.OrderForm;
import com.isoftstone.pay.utils.SimpleIbatisDao;

@Repository
@SuppressWarnings("deprecation")
public class OrderFormDao extends  SimpleIbatisDao {

	
	public List<OrderForm> getResultList() {
		return getSqlMapClientTemplate().queryForList("getAllOrderForm",null);  
	}

	
	public void save(OrderForm entity) {
		getSqlMapClientTemplate().insert("insertOrderForm", entity);
	}
	
	public List<OrderForm> getOrderFormByOrderNo(String orderNo) {
		return getSqlMapClientTemplate().queryForList("getOrderFormByOrderNo",orderNo);  
	}

	
	public void update(OrderForm entity) {
		
		
	}

	
	public void delete(String id) {
		
		
	}

	
	public OrderForm findById(String id) {
		
		return null;
	}

	
	public List<OrderForm> findByHQL(String hql, Object... params) {
		
		return null;
	}

}

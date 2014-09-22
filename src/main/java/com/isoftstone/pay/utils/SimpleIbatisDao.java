package com.isoftstone.pay.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.ibatis.sqlmap.client.SqlMapClient;

/**
 * 封装Ibatis数据访问类，继承spring的SqlMapClientDaoSupport类
 * @author qujx
 * @version 2009-11-24
 */
public class SimpleIbatisDao extends SqlMapClientDaoSupport {

	protected Logger logger = LoggerFactory.getLogger(getClass());

	public SimpleIbatisDao() {
	}
	
	/**
	 * Autowired自动从spring容器中注入依赖的属性
	 * @param sqlMapClient
	 */
	@Autowired
	public void init(SqlMapClient sqlMapClient) {
		this.setSqlMapClient(sqlMapClient);
	}

}

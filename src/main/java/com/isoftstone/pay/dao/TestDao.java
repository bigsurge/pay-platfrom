/**
 * 
 */
package com.isoftstone.pay.dao;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.isoftstone.pay.model.Test;
import com.isoftstone.pay.utils.SimpleIbatisDao;

/**
 * @author lllianga 2014年9月17日上午11:42:33
 */
@Repository
@SuppressWarnings("deprecation")
public class TestDao extends SimpleIbatisDao {


    @Cacheable(value = { "testCache" })
    @SuppressWarnings("unchecked")
    public List<Test> list() {
        List<Test> result = getSqlMapClientTemplate().queryForList("Test.list");
        return result;
    }

    public int insert(Test test) {
        Object obj = getSqlMapClientTemplate().insert("Test.insert", test);
        return obj == null ? 0 : (Integer) obj;
    }

    public int update(Test test) {
        Object obj = getSqlMapClientTemplate().insert("Test.update", test);
        return obj == null ? 0 : (Integer) obj;
    }

    public int delete(String id) {
        Object obj = getSqlMapClientTemplate().insert("Test.delete", id);
        return obj == null ? 0 : (Integer) obj;
    }
}

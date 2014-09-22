/**
 * 
 */
package com.isoftstone.pay.service;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isoftstone.pay.dao.TestDao;
import com.isoftstone.pay.model.Test;
import com.isoftstone.pay.utils.UUIDGenerator;

/**
 * @author lllianga 2014年9月17日上午11:42:59
 */
@Service
@Transactional
public class TestService {
    
    private static Logger logger = LoggerFactory.getLogger(TestService.class);

    @Autowired
    private TestDao testDao;

    public List<Test> list() {
        logger.debug("uuid:"+ UUID.randomUUID().toString().replaceAll("-", ""));
        return testDao.list();
    }

    public int insert(Test test) {
        return testDao.insert(test);
    }

    public int update(Test test) {
        return testDao.update(test);
    }

    public int delete(String id) {
        return testDao.delete(id);
    }
    
    public void test(){
        Test t=new Test();
        t.setId(UUIDGenerator.getUUID());
        t.setUsername("admin");
        t.setPassword("password");
        insert(t);
        update(t);
    }
}

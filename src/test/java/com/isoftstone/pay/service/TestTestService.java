/**
 * 
 */
package com.isoftstone.pay.service;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.isoftstone.pay.utils.UUIDGenerator;

/**
 * @author lllianga
 * 2014年9月18日上午9:20:34
 */
@RunWith(SpringJUnit4ClassRunner.class) //指定测试用例的运行器 这里是指定了Junit4  
@ContextConfiguration(locations = "classpath:spring-config-dao.xml")  
public class TestTestService {
    
    @Autowired
    private TestService testService;
    
    @Test  
    public void testInsert(){  
        com.isoftstone.pay.model.Test test=new com.isoftstone.pay.model.Test();
        test.setId(UUIDGenerator.getUUID());
        test.setUsername("admin");
        test.setPassword("123456");
        int result=testService.insert(test);
        Assert.assertNotNull(result);
    }  
    
    @Test  
    public void testUpdate(){  
        com.isoftstone.pay.model.Test test=new com.isoftstone.pay.model.Test();
        test.setId("0c721b091d4b4ab090be9f85b121bbe2");
        test.setPassword("654321");
        int result= testService.update(test);
        Assert.assertNotNull(result);
    }  
    
    @Test  
    public void testDelete(){  
        int result=testService.delete("0c721b091d4b4ab090be9f85b121bbe2");
        Assert.assertNotNull(result);
    }  

}

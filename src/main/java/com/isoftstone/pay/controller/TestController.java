/**
 * 
 */
package com.isoftstone.pay.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jetty.util.MultiMap;
import org.eclipse.jetty.util.UrlEncoded;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.isoftstone.pay.model.Test;
import com.isoftstone.pay.service.TestService;

/**
 * @author lllianga 2014年9月17日上午11:36:54
 */
@Controller
public class TestController {

    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    public String list(Model model, HttpServletRequest request) {
        List<Test> list = testService.list();
        logger.debug(request.getQueryString());

        //获取url参数
        if (StringUtils.isNotEmpty(request.getQueryString())) {
            MultiMap values = new MultiMap();
            UrlEncoded.decodeTo(request.getQueryString(), values, "UTF-8", 1000);
        }
        testService.test();
        model.addAttribute(list);
        return "index";
    }
}

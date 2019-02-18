package com.itheima.service.impl;

import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {

    @Test
    public void testService() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(
                "classpath:spring/applicationContext-service.xml");
        ItemsService bean = ac.getBean(ItemsService.class);
        System.out.println(bean.findById(2));
    }
}

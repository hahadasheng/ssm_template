package com.itheima.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {

    @Test
    public void testDao() {
        // 获取 spring 容器
        ApplicationContext ac = new ClassPathXmlApplicationContext(
                "classpath:spring/applicationContext-dao.xml");

        // 获取dao
        ItemsDao bean = ac.getBean(ItemsDao.class);

        // 调用方法测试
        System.out.println(bean.findById(1));
    }
}

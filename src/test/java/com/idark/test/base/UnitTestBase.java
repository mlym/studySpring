package com.idark.test.base;

import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * @description:
 * @author: iDark
 * @create: 2018/8/6 18:03
 * @email: 43352901@qq.com
 */
public class UnitTestBase {

    private ClassPathXmlApplicationContext context;

    private String springXmlPath;

    public UnitTestBase() {
    }

    public UnitTestBase(String springXmlPath) {
        this.springXmlPath = springXmlPath;
    }

    @Before
    public void testBefore() {
        if (springXmlPath.isEmpty()) {
            springXmlPath = "classpath:spring-*.xml";
       }
        try {
            context = new ClassPathXmlApplicationContext(springXmlPath);
            context.start();
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }

    public <T extends Object> T getBean(String beanId) {
        try {
            return (T) context.getBean(beanId);
        } catch (BeansException e) {
            e.printStackTrace();
            return null;
        }
    }

    public <T extends Object> T getBean(Class<T> classType) {
        try {
            return context.getBean(classType);
        } catch (BeansException e) {
            e.printStackTrace();
            return null;
        }
    }


}

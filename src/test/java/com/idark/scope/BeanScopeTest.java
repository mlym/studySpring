package com.idark.scope;

import com.idark.test.base.UnitTestBase;
import org.junit.Test;

/**
 * 测试bean scope
 */
public class BeanScopeTest extends UnitTestBase {

    public BeanScopeTest() {
        super("spring-scope.xml");
    }

    @Test
    public void say() {
        BeanScope beanScope = super.getBean("BeanScope");
        beanScope.setName("Hello 1");
        beanScope.say("Study bean scope");
        System.out.println("Name(beanScope)[1]:" + beanScope.getName());


        BeanScope beanScope1 = super.getBean("BeanScope");
        System.out.println("Name(beanScopre1)[1]" + beanScope1.getName());
        beanScope1.setName("Hello 2");
        System.out.println("Name(beanScopre1)[2]" + beanScope1.getName());
        beanScope1.say("Study bean scope");
        System.out.println("Name(beanScope)[2]:" + beanScope.getName());

    }
}
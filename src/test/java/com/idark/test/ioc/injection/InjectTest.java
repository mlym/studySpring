package com.idark.test.ioc.injection;

import com.idark.ioc.injection.service.UserService;
import com.idark.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * @description:
 * @author: iDark
 * @create: 2018/8/6 10:50
 * @email: 43352901@qq.com
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class InjectTest extends UnitTestBase {

    public InjectTest() {
        super("classpath:spring-ioc.xml");
    }

    @Test
    public void testInjectTest(){
        UserService userService = super.getBean("UserServiceImpl");
        userService.save("hello World");
        UserService userService1 = super.getBean("UserServiceImpl");

        System.out.println(userService.getClass());
        System.out.println(userService1.getClass());
        System.out.println(userService == userService1);

    }
}

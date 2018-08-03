package com.idark.service.impl;

import com.idark.service.DemoService;

/**
 * @description:
 * @author: Administrator
 * @create: 2018/8/3 16:30
 * @email: 43352901@qq.com
 */
public class DemoServiceImpl implements DemoService {

    public void say(String name) {
        System.out.println("Hello , " + name);
    }
}

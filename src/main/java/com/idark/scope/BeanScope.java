package com.idark.scope;

import org.springframework.stereotype.Component;

/**
 * @description: 学习Bean scope
 * @author: iDark
 * @create: 2018/8/7 13:48
 * @email: 43352901@qq.com
 */
public class BeanScope {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say(String str) {
        System.out.println("Bean Scope say : " + str + ", HashCode:" + this.hashCode());
    }
}

package com.idark.ioc.injection.dao;

/**
 * @description:
 * @author: iDark
 * @create: 2018/8/6 10:47
 * @email: 43352901@qq.com
 */
public class UserDao {
    public void save(String args) {
        System.out.println("Dao receive :" + args);
    }
}

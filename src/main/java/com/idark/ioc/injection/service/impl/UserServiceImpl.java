package com.idark.ioc.injection.service.impl;

import com.idark.ioc.injection.dao.UserDao;
import com.idark.ioc.injection.service.UserService;
/**
 * @description:
 * @author: iDark
 * @create: 2018/8/6 10:49
 * @email: 43352901@qq.com
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    @Override
    public void save(String args) {
        System.out.println("UserServiceImpl receive :" + args);
        userDao.save(args);
    }

//    /**
//     * 构造注入
//     * @param userDao
//     */
//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

    /**
     * 设值注入
     * @param userDao
     */
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}

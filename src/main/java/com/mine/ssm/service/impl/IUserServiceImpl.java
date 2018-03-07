package com.mine.ssm.service.impl;

import com.mine.ssm.dao.UserDao;
import com.mine.ssm.pojo.User;
import com.mine.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceImpl implements IUserService{

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer id) {
        User u = userDao.selectByPrimaryKey(1);
        if(null == u){
            return new User();
        }
        return u;
    }
}

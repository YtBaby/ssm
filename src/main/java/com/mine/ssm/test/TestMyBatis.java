package com.mine.ssm.test;

import com.alibaba.fastjson.JSON;
import com.mine.ssm.pojo.User;
import com.mine.ssm.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by LiJiaXin on 2018/2/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {

    private static Logger logger = Logger.getLogger(TestMyBatis.class);

    @Autowired
    private IUserService userService;

    @Test
    public void testGetUserById(){
        User user = userService.getUserById(1);
        logger.info(JSON.toJSONString(user));
    }
}

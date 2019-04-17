package com.spring.data.dao;

import com.spring.data.entity.UserDO;
import com.spring.data.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Date: 2019/04/11
 * Time: 下午10:46
 *
 * @author manqs
 */
@Repository
public class UserDAO {

    @Autowired
    private UserMapper userMapper;

    public UserDO queryById(){
        return userMapper.selectByPrimaryKey(104226L);
    }
}
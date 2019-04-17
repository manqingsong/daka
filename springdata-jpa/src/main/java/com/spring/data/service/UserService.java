package com.spring.data.service;

import com.spring.data.dao.UserDAO;
import com.spring.data.entity.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Date: 2019/04/11
 * Time: 下午10:58
 *
 * @author manqs
 */
@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public UserDO queryUserById(){
        return userDAO.queryById();
    }
}
package com.demo.test.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.demo.test.domain.model.UserModel;
import com.demo.test.domain.repository.UserModelDao;

@Service
public class TestUserService {
    
    @Autowired
    UserModelDao testUserDao;

    public List<UserModel> selectById() {
        List<UserModel> userList = null;
		try {
            userList = testUserDao.selectById();
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
		return userList;
    }
}
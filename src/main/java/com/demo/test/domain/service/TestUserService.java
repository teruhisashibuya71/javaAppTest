package com.demo.test.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.demo.test.domain.model.TestUser;
import com.demo.test.domain.repository.TestUserDao;

@Service
public class TestUserService {
    
    @Autowired
    TestUserDao testUserDao;

    public List<TestUser> selectById() {
        List<TestUser> userList = null;
		try {
            userList = testUserDao.selectById();
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
		return userList;
    }
}
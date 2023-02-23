package com.demo.test.domain.repository;

import java.util.List;

//jdbcドライバの依存関係をpomに記載しないとimportできない
import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import com.demo.test.domain.model.TestUser;

@Repository
public interface TestUserDao {
    //全件数取得メソッド
    public List<TestUser> selectById() throws DataAccessException;
}

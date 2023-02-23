package com.demo.test.domain.repository.testUserImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.test.domain.model.TestUser;
import com.demo.test.domain.repository.TestUserDao;

@Repository("TestUserDaoImpl")
public class TestUserDaoImpl implements TestUserDao {

    @Autowired
	JdbcTemplate jdbc;

    @Override
    public List<TestUser> selectById() throws DataAccessException {
        //JdbcTemplate jdbc = new JdbcTemplate();
        List<Map<String, Object>> getList = null;

        getList = jdbc.queryForList("SELECT * FROM user WHERE id = 1");
        
        List<TestUser> testUserList = new ArrayList<>();
        // 取得したデータを結果返却用のListに格納していく
        for (Map<String, Object> map : getList) {
            // Userインスタンスの生成
            TestUser testUser = new TestUser();
            // Userインスタンスに取得したデータをセットする
            testUser.setId((Integer)map.get("id"));
            testUser.setName((String)map.get("name"));
            testUser.setAge((Integer)map.get("age"));
            // 結果返却用のListに追加
            testUserList.add(testUser);
        }

        return testUserList;
    }
    
}

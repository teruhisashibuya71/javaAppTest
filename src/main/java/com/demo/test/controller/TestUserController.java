package com.demo.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.test.domain.model.UserModel;
import com.demo.test.domain.service.TestUserService;

@Controller
public class TestUserController {

    @Autowired
    TestUserService testUserService;

    @RequestMapping("/user")
    public String getUser(Model model) {
        List<UserModel> testUser = testUserService.selectById();
        //modelに詰めて画面に移動
        model.addAttribute("testUser", testUser);
        return "user";
    }
    
}

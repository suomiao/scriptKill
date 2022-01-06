package com.example.scriptkill.userInfo.web;

import com.example.scriptkill.userInfo.entity.UserInfo;
import com.example.scriptkill.userInfo.service.UserInfoService;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@RestController
@RequestMapping("/userInfo")
public class UserInfoControll {

    private static final Logger log = LoggerFactory.getLogger(UserInfoControll.class);
    @Autowired
    UserInfoService userInfoService;

    @RequestMapping("hello")
    public String say() {
        return "hello world!";
    }


    @RequestMapping("getById")
    public UserInfo getById(HttpServletRequest request, HttpServletResponse response) {
        String userId = request.getParameter("userId");
        log.info("getById" + "参数获取：" + userId);
        UserInfo userInfo = userInfoService.get(1);
        return userInfo;
    }
}

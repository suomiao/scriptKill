package com.example.scriptkill.userinfo.web;

import com.example.scriptkill.userinfo.entity.UserInfo;
import com.example.scriptkill.userinfo.service.UserInfoService;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yjj
 * @date 2022/01/10
 */
@RestController
@RequestMapping("/userInfo")
public class UserInfoControll {

    private static final Logger log = LoggerFactory.getLogger(UserInfoControll.class);

    @RequestMapping("hello")
    public String say() {
        return "hello world!";
    }


    @RequestMapping("getById")
    public UserInfo getById(HttpServletRequest request, HttpServletResponse response) {
        String userId = request.getParameter("userId");
        log.info("getById" + "参数获取：" + userId);
        UserInfo userInfo = UserInfoService.get(1);
        return userInfo;
    }

    @RequestMapping("insertByUserInfo")
    public String insert(HttpServletRequest request, HttpServletResponse response,UserInfo userInfo) {
        UserInfoService.insert(userInfo);

        return "succ";
    }
}

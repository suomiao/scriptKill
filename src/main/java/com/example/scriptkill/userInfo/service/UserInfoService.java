package com.example.scriptkill.userInfo.service;

import com.example.scriptkill.userInfo.dao.UserInfoDao;
import com.example.scriptkill.userInfo.entity.UserInfo;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class UserInfoService {



    @Autowired
    UserInfoDao userInfoDao;

    public UserInfo get(Integer id) {
//        log.info("getUserInfoById");
        return userInfoDao.get(id);
    }

}

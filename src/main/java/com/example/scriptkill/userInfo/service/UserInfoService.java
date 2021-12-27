package com.example.scriptkill.userInfo.service;

import com.example.scriptkill.userInfo.dao.UserInfoDao;
import com.example.scriptkill.userInfo.entity.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    private static final Logger log = LoggerFactory.getLogger(UserInfoService.class);



    private static UserInfoService instance = null;

    public static synchronized UserInfoService getInstance() {
        if (instance == null) {
            instance = new UserInfoService();
        }
        return instance;
    }

    private UserInfoService() {
        instance = this;
        log.debug("constructor", "用户服务已构建");
    }


    @Autowired
    UserInfoDao userInfoDao;

    /**
     * 设置
     * @param id
     * @return
     */
    public static UserInfo get(Integer id) {
//        log.info("getUserInfoById");
        return instance.userInfoDao.get(id);
    }

    public static Integer insert(UserInfo userInfo) {
        return instance.userInfoDao.insert(userInfo);
    }

    public static boolean update(UserInfo userInfo) {
        if(instance.userInfoDao.update(userInfo) == 1) {
            log.debug("update" + "修改用户数据,id: " + userInfo.getId());
            return true;
        }
        return false;
    }


}

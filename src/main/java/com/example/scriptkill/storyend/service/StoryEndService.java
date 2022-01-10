package com.example.scriptkill.storyend.service;

import com.example.scriptkill.storyend.dao.StoryEndDao;
import com.example.scriptkill.storyend.entity.StoryEnd;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author yjj
 * @date 2022/01/10
 */
@Service
public class StoryEndService {
    private static final Logger log = LoggerFactory.getLogger(StoryEndService.class);

    private static StoryEndService instance = null;

    public static synchronized StoryEndService getInstance() {
        if (instance == null) {
            instance = new StoryEndService();
        }
        return instance;
    }

    private StoryEndService() {
        instance = this;
        log.debug("constructor", "用户服务已构建");
    }


    @Autowired
    StoryEndDao storyEndDao;

    /**
     * 设置
     * @param id
     * @return
     */
    public static StoryEnd get(Integer id) {
//        log.info("getUserInfoById");
        return instance.storyEndDao.get(id);
    }

    public static Integer insert(StoryEnd storyEnd) {

        storyEnd.setCreateDate(new Date());
        storyEnd.setUpdateDate(new Date());

        return instance.storyEndDao.insert(storyEnd);
    }

    public static boolean update(StoryEnd storyEnd) {
        if(instance.storyEndDao.update(storyEnd) == 1) {
            log.debug("update" + "修改用户数据,id: " + storyEnd.getId());
            return true;
        }
        return false;
    }

    public static boolean delete(Integer id) {
        if(instance.storyEndDao.delete(id) == 1) {
            return true;
        }
        return false;
    }
}

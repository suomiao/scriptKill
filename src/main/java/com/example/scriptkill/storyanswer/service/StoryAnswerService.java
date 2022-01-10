package com.example.scriptkill.storyanswer.service;

import com.example.scriptkill.storyanswer.dao.StoryAnswerDao;
import com.example.scriptkill.storyanswer.entity.StoryAnswer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @author yjj
 * @date 2022/01/10
 */
public class StoryAnswerService {
    private static final Logger log = LoggerFactory.getLogger(StoryAnswerService.class);

    private static StoryAnswerService instance = null;

    public static synchronized StoryAnswerService getInstance() {
        if (instance == null) {
            instance = new StoryAnswerService();
        }
        return instance;
    }

    private StoryAnswerService() {
        instance = this;
        log.debug("constructor", "用户服务已构建");
    }


    @Autowired
    StoryAnswerDao storyAnswerDao;

    /**
     * 设置
     * @param id
     * @return
     */
    public static StoryAnswer get(Integer id) {
//        log.info("getUserInfoById");
        return instance.storyAnswerDao.get(id);
    }

    public static Integer insert(StoryAnswer storyAnswer) {

        storyAnswer.setCreateDate(new Date());
        storyAnswer.setUpdateDate(new Date());

        return instance.storyAnswerDao.insert(storyAnswer);
    }

    public static boolean update(StoryAnswer storyAnswer) {
        if(instance.storyAnswerDao.update(storyAnswer) == 1) {
            log.debug("update" + "修改用户数据,id: " + storyAnswer.getId());
            return true;
        }
        return false;
    }

    public static boolean delete(Integer id) {
        if(instance.storyAnswerDao.delete(id) == 1) {
            return true;
        }
        return false;
    }
}

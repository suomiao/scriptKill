package com.example.scriptkill.storyquestion.service;

import com.example.scriptkill.storyquestion.dao.StoryQuestionDao;
import com.example.scriptkill.storyquestion.entity.StoryQuestion;
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
public class StoryQuestionService {

    private static final Logger log = LoggerFactory.getLogger(StoryQuestionService.class);

    private static StoryQuestionService instance = null;

    public static synchronized StoryQuestionService getInstance() {
        if (instance == null) {
            instance = new StoryQuestionService();
        }
        return instance;
    }

    private StoryQuestionService() {
        instance = this;
        log.debug("constructor", "用户服务已构建");
    }


    @Autowired
    StoryQuestionDao storyQuestionDao;

    /**
     * 设置
     * @param id
     * @return
     */
    public static StoryQuestion get(Integer id) {
        return instance.storyQuestionDao.get(id);
    }

    public static Integer insert(StoryQuestion storyQuestion) {

        storyQuestion.setCreateDate(new Date());
        storyQuestion.setUpdateDate(new Date());

        return instance.storyQuestionDao.insert(storyQuestion);
    }

    public static boolean update(StoryQuestion storyQuestion) {
        if(instance.storyQuestionDao.update(storyQuestion) == 1) {
            log.debug("update" + "修改用户数据,id: " + storyQuestion.getId());
            return true;
        }
        return false;
    }

    public static boolean delete(Integer id) {
        if(instance.storyQuestionDao.delete(id) == 1) {
            return true;
        }
        return false;
    }
}

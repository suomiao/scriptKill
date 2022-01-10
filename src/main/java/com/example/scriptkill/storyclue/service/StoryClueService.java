package com.example.scriptkill.storyclue.service;

import com.example.scriptkill.storyclue.dao.StoryClueDao;
import com.example.scriptkill.storyclue.entity.StoryClue;
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
public class StoryClueService {
    private static final Logger log = LoggerFactory.getLogger(StoryClueService.class);

    private static StoryClueService instance = null;

    public static synchronized StoryClueService getInstance() {
        if (instance == null) {
            instance = new StoryClueService();
        }
        return instance;
    }

    private StoryClueService() {
        instance = this;
        log.debug("constructor", "StoryCharacterService已构建");
    }


    @Autowired
    StoryClueDao storyClueDao;

    /**
     * 设置
     * @param id
     * @return
     */
    public static StoryClue get(Integer id) {
        return instance.storyClueDao.get(id);
    }

    public static Integer insert(StoryClue storyClue) {

        storyClue.setCreateDate(new Date());
        storyClue.setUpdateDate(new Date());

        return instance.storyClueDao.insert(storyClue);
    }

    public static boolean update(StoryClue storyClue) {
        if(instance.storyClueDao.update(storyClue) == 1) {
            log.debug("update" + "修改用户数据,id: " + storyClue.getId());
            return true;
        }
        return false;
    }

    public static boolean delete(Integer id) {
        if(instance.storyClueDao.delete(id) == 1) {
            return true;
        }
        return false;
    }
}

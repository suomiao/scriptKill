package com.example.scriptkill.storycharacter.service;

import com.example.scriptkill.storycharacter.dao.StoryCharacterDao;
import com.example.scriptkill.storycharacter.entity.StoryCharacter;
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
public class StoryCharacterService {
    private static final Logger log = LoggerFactory.getLogger(StoryCharacterService.class);

    private static StoryCharacterService instance = null;

    public static synchronized StoryCharacterService getInstance() {
        if (instance == null) {
            instance = new StoryCharacterService();
        }
        return instance;
    }

    private StoryCharacterService() {
        instance = this;
        log.debug("constructor", "StoryCharacterService已构建");
    }


    @Autowired
    StoryCharacterDao storyCharacterDao;

    /**
     * 设置
     * @param id
     * @return
     */
    public static StoryCharacter get(Integer id) {
//        log.info("getUserInfoById");
        return instance.storyCharacterDao.get(id);
    }

    public static Integer insert(StoryCharacter storyCharacter) {

        storyCharacter.setCreateDate(new Date());
        storyCharacter.setUpdateDate(new Date());

        return instance.storyCharacterDao.insert(storyCharacter);
    }

    public static boolean update(StoryCharacter storyCharacter) {
        if(instance.storyCharacterDao.update(storyCharacter) == 1) {
            log.debug("update" + "修改用户数据,id: " + storyCharacter.getId());
            return true;
        }
        return false;
    }

    public static boolean delete(Integer id) {
        if(instance.storyCharacterDao.delete(id) == 1) {
            return true;
        }
        return false;
    }
}

package com.example.scriptkill.characterstory.service;

import com.example.scriptkill.characterstory.dao.CharacterStoryDao;
import com.example.scriptkill.characterstory.entity.CharacterStory;
import com.github.pagehelper.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
/**
 * @author yjj
 * @date 2022/01/10
 */
@Service
public class CharacterStoryService {

    private static final Logger log = LoggerFactory.getLogger(CharacterStoryService.class);

    private static CharacterStoryService instance = null;

    public static synchronized CharacterStoryService getInstance() {
        if (instance == null) {
            instance = new CharacterStoryService();
        }
        return instance;
    }

    private CharacterStoryService() {
        instance = this;
        log.debug("constructor", "用户服务已构建");
    }


    @Autowired
    CharacterStoryDao characterStoryDao;

    /**
     * 设置
     * @param id
     * @return
     */
    public static CharacterStory get(Integer id) {
//        log.info("getUserInfoById");
        return instance.characterStoryDao.get(id);
    }

    public static Integer insert(CharacterStory characterStory) {

        characterStory.setCreateDate(new Date());
        characterStory.setUpdateDate(new Date());

        return instance.characterStoryDao.insert(characterStory);
    }

    public static boolean update(CharacterStory characterStory) {
        if(instance.characterStoryDao.update(characterStory) == 1) {
            log.debug("update" + "修改用户数据,id: " + characterStory.getId());
            return true;
        }
        return false;
    }

    public static boolean delete(Integer id) {
        if(instance.characterStoryDao.delete(id) == 1) {
            return true;
        }
        return false;
    }

    public static Page<CharacterStory> getAll(CharacterStory characterStory) {
        Page<CharacterStory> characterStories = instance.characterStoryDao.getList(characterStory);
        return characterStories;
    }

}

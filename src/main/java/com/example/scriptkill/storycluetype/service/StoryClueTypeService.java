package com.example.scriptkill.storycluetype.service;


import com.example.scriptkill.storycluetype.dao.StoryClueTypeDao;
import com.example.scriptkill.storycluetype.entity.StoryClueType;
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
public class StoryClueTypeService {
    private static final Logger log = LoggerFactory.getLogger(StoryClueTypeService.class);

    private static StoryClueTypeService instance = null;

    public static synchronized StoryClueTypeService getInstance() {
        if (instance == null) {
            instance = new StoryClueTypeService();
        }
        return instance;
    }

    private StoryClueTypeService() {
        instance = this;
        log.debug("constructor", "StoryClueTypeService已构建");
    }


    @Autowired
    StoryClueTypeDao storyClueTypeDao;

    /**
     * 设置
     * @param id
     * @return
     */
    public static StoryClueType get(Integer id) {
        return instance.storyClueTypeDao.get(id);
    }

    public static Integer insert(StoryClueType storyClueType) {

        storyClueType.setCreateDate(new Date());
        storyClueType.setUpdateDate(new Date());

        return instance.storyClueTypeDao.insert(storyClueType);
    }

    public static boolean update(StoryClueType storyClueType) {
        if(instance.storyClueTypeDao.update(storyClueType) == 1) {
            log.debug("update" + "修改用户数据,id: " + storyClueType.getId());
            return true;
        }
        return false;
    }

    public static boolean delete(Integer id) {
        if(instance.storyClueTypeDao.delete(id) == 1) {
            return true;
        }
        return false;
    }
}

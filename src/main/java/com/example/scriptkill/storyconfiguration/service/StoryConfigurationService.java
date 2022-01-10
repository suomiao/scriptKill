package com.example.scriptkill.storyconfiguration.service;

import com.example.scriptkill.storyconfiguration.dao.StoryConfigurationDao;
import com.example.scriptkill.storyconfiguration.entity.StoryConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class StoryConfigurationService {

    private static final Logger log = LoggerFactory.getLogger(StoryConfigurationService.class);

    private static StoryConfigurationService instance = null;

    public static synchronized StoryConfigurationService getInstance() {
        if (instance == null) {
            instance = new StoryConfigurationService();
        }
        return instance;
    }

    private StoryConfigurationService() {
        instance = this;
        log.debug("constructor", "用户服务已构建");
    }

    @Autowired
    StoryConfigurationDao storyConfigurationDao;

    /**
     * 根据id获取故事信息
     * @param id
     * @return
     */
    public static StoryConfiguration getById(Integer id) {
        return  instance.storyConfigurationDao.get(id);
    }

    public static boolean insert (StoryConfiguration storyConfiguration) {
        storyConfiguration.setCreateDate(new Date());
        storyConfiguration.setUpdateDate(new Date());
        if(instance.storyConfigurationDao.insert(storyConfiguration) == 1) {
            return true;
        }
        return false;
    }

    public static boolean update (StoryConfiguration storyConfiguration) {
        storyConfiguration.setUpdateDate(new Date());

        if(instance.storyConfigurationDao.update(storyConfiguration) >1 ) {
            return true;
        }
        return false;
    }



}

package com.example.scriptkill.storyConfiguration.service;

import com.example.scriptkill.storyConfiguration.dao.StoryConfigurationDao;
import com.example.scriptkill.userInfo.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

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



}

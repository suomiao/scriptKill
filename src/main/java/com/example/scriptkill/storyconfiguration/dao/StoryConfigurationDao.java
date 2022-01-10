package com.example.scriptkill.storyconfiguration.dao;


import com.example.scriptkill.storyconfiguration.entity.StoryConfiguration;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StoryConfigurationDao {
    StoryConfiguration get(int id);

    Integer insert(StoryConfiguration storyConfiguration);
    Integer update(StoryConfiguration storyConfiguration);
    Integer delete(Integer id);
}

package com.example.scriptkill.storycluetype.dao;

import com.example.scriptkill.storycluetype.entity.StoryClueType;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yjj
 * @date 2022/01/10
 */
@Mapper
public interface StoryClueTypeDao {
    StoryClueType get(int id);

    Integer insert(StoryClueType storyClueType);
    Integer update(StoryClueType storyClueType);
    Integer delete(Integer id);
}

package com.example.scriptkill.storyend.dao;

import com.example.scriptkill.storyend.entity.StoryEnd;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yjj
 * @date 2022/01/10
 */
@Mapper
public interface StoryEndDao {
    StoryEnd get(int id);

    Integer insert(StoryEnd storyEnd);
    Integer update(StoryEnd storyEnd);
    Integer delete(Integer id);
}

package com.example.scriptkill.storyclue.dao;

import com.example.scriptkill.storyclue.entity.StoryClue;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yjj
 * @date 2022/01/10
 */
@Mapper
public interface StoryClueDao {
    StoryClue get(int id);

    Integer insert(StoryClue storyClue);
    Integer update(StoryClue storyClue);
    Integer delete(Integer id);
}

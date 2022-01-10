package com.example.scriptkill.storyanswer.dao;

import com.example.scriptkill.storyanswer.entity.StoryAnswer;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yjj
 * @date 2022/01/10
 */
@Mapper
public interface StoryAnswerDao {
    StoryAnswer get(int id);

    Integer insert(StoryAnswer storyAnswer);
    Integer update(StoryAnswer storyAnswer);
    Integer delete(Integer id);
}

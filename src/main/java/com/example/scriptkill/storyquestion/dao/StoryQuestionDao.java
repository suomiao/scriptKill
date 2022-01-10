package com.example.scriptkill.storyquestion.dao;

import com.example.scriptkill.storyquestion.entity.StoryQuestion;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yjj
 * @date 2022/01/10
 */
@Mapper
public interface StoryQuestionDao {
    StoryQuestion get(int id);

    Integer insert(StoryQuestion storyQuestion);
    Integer update(StoryQuestion storyQuestion);
    Integer delete(Integer id);
}

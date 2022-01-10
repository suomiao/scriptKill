package com.example.scriptkill.storycharacter.dao;

import com.example.scriptkill.storycharacter.entity.StoryCharacter;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yjj
 * @date 2022/01/10
 */
@Mapper
public interface StoryCharacterDao {
    StoryCharacter get(int id);

    Integer insert(StoryCharacter storyCharacter);
    Integer update(StoryCharacter storyCharacter);
    Integer delete(Integer id);
}

package com.example.scriptkill.characterstory.dao;

import com.example.scriptkill.characterstory.entity.CharacterStory;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yjj
 * @date 2022/01/10
 */
@Mapper
public interface CharacterStoryDao {
    CharacterStory get(int id);

    Integer insert(CharacterStory characterStory);
    Integer update(CharacterStory characterStory);
    Integer delete(Integer id);

    Page<CharacterStory> getList(CharacterStory characterStory);
}

package com.example.scriptkill.characterstory.web;

import com.example.scriptkill.characterstory.entity.CharacterStory;
import com.example.scriptkill.characterstory.service.CharacterStoryService;
import com.github.pagehelper.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yjj
 * @date 2022/01/10
 */
@RestController
@RequestMapping("/characterStory")
public class CharacterStoryControll {

    @ResponseBody
    @RequestMapping("/pageByCharacterSotry")
    public Page<CharacterStory> pageCharacterStory(HttpServletResponse response, HttpServletRequest request) {
        CharacterStory characterStory = new CharacterStory();
        Page<CharacterStory> characterStories = CharacterStoryService.getAll(characterStory);
        return characterStories;
    }
}

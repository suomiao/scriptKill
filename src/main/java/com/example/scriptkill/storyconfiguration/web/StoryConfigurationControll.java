package com.example.scriptkill.storyconfiguration.web;

import com.example.scriptkill.storyconfiguration.entity.StoryConfiguration;
import com.example.scriptkill.storyconfiguration.service.StoryConfigurationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * StoryConfigurationControll
 *
 * @author yjj
 * @date 2022/01/05
 */
@RestController
@RequestMapping("/storyConfiguration")
public class StoryConfigurationControll {

    @RequestMapping("getById")
    public StoryConfiguration getById(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("storyConfigurationId");
        return StoryConfigurationService.getById(Integer.parseInt(id));
    }

}

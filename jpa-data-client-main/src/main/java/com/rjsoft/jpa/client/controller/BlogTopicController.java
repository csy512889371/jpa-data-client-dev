package com.rjsoft.jpa.client.controller;


import com.rjsoft.jpa.client.entity.blogTopic.BlogTopic;
import com.rjsoft.jpa.client.service.BlogTopicService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/blogTopic")
public class BlogTopicController {


    @Resource
    private BlogTopicService blogTopicService;

    /**
     * 获取所有用户
     *
     * @return
     */
    @GetMapping(value = "/getAllList")
    public List<BlogTopic> getUserList() {
        return blogTopicService.getBlogTopicList();
    }


}

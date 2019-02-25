package com.rjsoft.jpa.client.service.impl;

import com.rjsoft.jpa.client.entity.blogTopic.BlogTopic;
import com.rjsoft.jpa.client.repository.BlogTopicRepository;
import com.rjsoft.jpa.client.service.BlogTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogTopicServiceImpl implements BlogTopicService {

    @Autowired
    private BlogTopicRepository blogTopicRepository;

    @Override
    public List<BlogTopic> getBlogTopicList() {
        return blogTopicRepository.findAllBlogTopic();
    }
}

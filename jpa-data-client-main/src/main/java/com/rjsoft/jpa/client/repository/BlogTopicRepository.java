package com.rjsoft.jpa.client.repository;

import com.rjsoft.jpa.client.entity.blogTopic.BlogTopic;
import com.rjsoft.magina.component.query.jpa.GenericJpaRepository;
import com.rjsoft.magina.component.query.jpa.TemplateQuery;

import java.util.List;

public interface BlogTopicRepository extends GenericJpaRepository<BlogTopic, String> {

    @TemplateQuery
    List<BlogTopic> findAllBlogTopic();
}
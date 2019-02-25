package com.rjsoft.jpa.client.entity.blogTopic;


import com.rjsoft.magina.component.query.jpa.auditing.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 文章主题
 */
@Entity
@Table(name = "EVA_BLOG_TOPIC")
@Data
public class BlogTopic extends BaseEntity<String> {
    /**
     * 主题名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 图片url
     */
    @Column(name = "IMG_URL")
    private String imgUrl;

    /**
     * 购买地址
     */
    @Column(name = "BUY_URL")
    private String buyUrl;

    /**
     * 主题描述
     */
    @Column(name = "INFO")
    private String info;

    /**
     * 视频数量
     */
    @Column(name = "VIDEO_COUNT")
    private int videoCount;

    /**
     * 关注数量
     */
    @Column(name = "FOLLOW")
    private int follow;


    /**
     * 所属类别Id
     */
    @Column(name = "CATEGORY_ID")
    private String categoryId;

    /**
     * 所属类别名称
     */
    @Column(name = "CATEGORY_NAME")
    private String categoryName;

    /**
     * 价格
     */
    @Column(name = "PRICE")
    private int price;

    /**
     * 排序
     */
    @Column(name = "ININO")
    private int inino;

   
}

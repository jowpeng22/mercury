package com.joemaster.blogservice.dto;

import com.joemaster.blogservice.entity.Blog;
import com.joemaster.blogservice.entity.User;
import lombok.Getter;
import lombok.Setter;

/**
 * Create by pengzq on 2020-7-14
 */
@Getter
@Setter
public class BlogDetailDTO {

    private Blog blog;
    private User user;
}

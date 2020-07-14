package com.joemaster.blogservice.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Create by pengzq on 2020-7-14
 */
@Getter
@Setter
@ToString
public class User {

    private Long id;
    private String username;
    private String password;
}

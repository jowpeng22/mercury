package com.joemaster.blogservice.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

/**
 * Create by pengzq on 2020-7-14
 */
@Getter
@Setter
@ToString
public class SysLog {

    private Long id;
    //用户名
    private String username;
    //用户操作
    private String operation;
    //请求方法
    private String method;
    //请求参数
    private String params;
    //IP地址
    private String ip;
    //创建时间
    private LocalDate createDate;
}

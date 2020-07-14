package com.joemaster.blogservice.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Create by pengzq on 2020-7-14
 */
@Entity
@Getter
@Setter
@ToString
public class Blog implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column
    private String title;

    @Column
    private String subject;
}

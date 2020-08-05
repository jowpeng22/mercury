package com.joemaster.userservice.entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Create by pengzq on 2020/7/12
 */
@Entity
@Getter
@Setter
@ToString
@DynamicInsert
@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name",nullable = false,  unique = true)
    private String userName;

    private String nickName;

    @Column
    private String password;

    private String telephone;

    private String email;

    private String avatar;

    @Column
    private Date createDate;

    @Column
    private Date updateAt;

}

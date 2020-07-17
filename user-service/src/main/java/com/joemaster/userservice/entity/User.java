package com.joemaster.userservice.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Create by pengzq on 2020/7/12
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,  unique = true)
    private String username;

    @Column
    private String password;

}

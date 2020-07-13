package com.joemaster.userservice.dto;

import com.joemaster.userservice.entity.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Create by pengzq on 2020-7-13
 */
@Getter
@Setter
@ToString
public class LoginDTO {

    private User user;
    private String token;
}

package com.joemaster.userservice.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Create by pengzq on 2020-7-13
 */
@Getter
@Setter
@ToString
public class JWT {

    private String access_token;
    private String token_type;
    private String refresh_token;
    private int expires_in;
    private String scope;
    private String jti;
}

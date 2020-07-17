package com.joemaster.common.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * http 通用码表
 * Created by pengzq on 2020/06/17.
 */
@Getter
@AllArgsConstructor
public enum HttpConstant {

    OK(200, "SUCCESS"),
    UNAUTHORIZED(401, "用户没有授权"),
    FORBIDDEN(403,"拒绝访问"),
    NOT_FOUND(404,"未找到");

    private int code;
    private String msg;

    public static HttpConstant codeOf(int code) {
        for (HttpConstant state : values()) {
            if (state.getCode() == code) {
                return state;
            }
        }
        return null;
    }
}

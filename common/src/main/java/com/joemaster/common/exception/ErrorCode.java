package com.joemaster.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 通用错误码
 * Created by pengzq on 2020/06/17.
 */
@Getter
@AllArgsConstructor
public enum ErrorCode {

    OK(0, ""),
    FAIL(-1, "操作失败"),
    BAD_PARAMETER(-3, "参数异常"),
    RPC_ERROR(-2,"远程调度失败"),
    USER_NOT_FOUND(1000,"用户不存在"),
    USER_PASSWORD_ERROR(1001,"密码错误"),
    GET_TOKEN_FAIL(1002,"获取token失败"),
    TOKEN_IS_NOT_MATCH_USER(1003,"请使用自己的token进行接口请求"),
    USER_REGISTERED(1004,"用户已被注册"),

    BLOG_IS_NOT_EXIST(2001,"该博客不存在");
    private int code;
    private String msg;

    public static ErrorCode codeOf(int code) {
        for (ErrorCode state : values()) {
            if (state.getCode() == code) {
                return state;
            }
        }
        return null;
    }
}

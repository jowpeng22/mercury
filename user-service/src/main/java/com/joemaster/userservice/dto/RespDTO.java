package com.joemaster.userservice.dto;

import lombok.ToString;

import java.io.Serializable;

/**
 * Create by pengzq on 2020-7-13
 */
@ToString
public class RespDTO<T> implements Serializable{

    public int code = 0;
    public String error = "";
    public T data;

    public static RespDTO onSuc(Object data) {
        RespDTO resp = new RespDTO();
        resp.data = data;
        return resp;
    }
}

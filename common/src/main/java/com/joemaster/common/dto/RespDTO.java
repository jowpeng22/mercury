package com.joemaster.common.dto;

import com.joemaster.common.util.HttpConstant;
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

    public static RespDTO result(HttpConstant object) {
        RespDTO resp = new RespDTO();
        resp.code = object.getCode();
        resp.data = object.getMsg();
        return resp;
    }
}

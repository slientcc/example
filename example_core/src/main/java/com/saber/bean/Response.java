package com.saber.bean;

import org.springframework.stereotype.Component;

/**
 * @author saber
 * @
 */
@Component
public class Response<T> {

    private static final int SUCCESS = 200;
    private static final String SUCCESS_MSG = "success";

    private int code = SUCCESS;

    private String msg = SUCCESS_MSG;

    private T data;

    public static <T> Response<T> ok(){
        Response<T> response = new Response<>();
        response.data = null;
        return response;
    }

    public static <T> Response<T> ok(T data) {
        Response<T> response = new Response<>();
        response.data = data;
        return response;
    }

    public static <T> Response<T> error(int code, String msg) {
        Response<T> response = new Response<>();
        response.code = code;
        response.msg = msg;
        response.data = null;
        return response;

    }

    public static <T> Response<T> error(int code) {
        Response<T> response = new Response<>();
        response.code = code;
        response.msg = "BAD_REQUEST";
        response.data = null;
        return response;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

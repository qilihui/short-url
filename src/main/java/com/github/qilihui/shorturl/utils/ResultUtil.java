package com.github.qilihui.shorturl.utils;

import lombok.Data;

/**
 * @author qilihui
 * @date 2021/4/1 15:50
 */
@Data
public class ResultUtil {
    //响应业务状态
    private int status;
    //响应消息
    private String msg;
    //响应中的数据
    private Object data;

    public ResultUtil() {
    }

    public ResultUtil(Object data){
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public ResultUtil(int status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 用于有返回结果的成功响应
     * @param data
     * @return
     */
    public static ResultUtil ok(Object data){
        return new ResultUtil(200,"",data);
    }
}

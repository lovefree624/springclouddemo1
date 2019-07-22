package com.example.eurekasumer.entity;

import java.io.Serializable;

/**
 * 调用 接口后 返回
 */
public class ResMsg implements Serializable {
    /**
     *    0 成功 1 失败
     */
    private Integer code = 1;
    /**描述**/
    private String msg = "error";

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

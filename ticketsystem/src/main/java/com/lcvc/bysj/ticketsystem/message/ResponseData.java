package com.lcvc.bysj.ticketsystem.message;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 请求返回类
 *
 * @param <T>   实体类型
 */
@Setter
@Getter
public class ResponseData<T> implements Serializable {

    private String code;

    private String msg;

    private T data;


    public ResponseData(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseData(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseData(ResultEnums resultEnums) {
        this.code = resultEnums.getCode();
        this.msg = resultEnums.getMsg();
    }

    public ResponseData(ResultEnums resultEnums, T data) {
        this.code = resultEnums.getCode();
        this.msg = resultEnums.getMsg();
        this.data = data;
    }

    public ResponseData() {

    }

}

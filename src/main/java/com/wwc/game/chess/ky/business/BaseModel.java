package com.wwc.game.chess.ky.business;

import java.io.Serializable;

/**
 * Description: 接收第三方数据结果都继承此类
 * <p>
 * Created by saiya on 2019/3/27 0027 下午 6:53
 */
public class BaseModel implements Serializable {
    private Integer code;

    private String message;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

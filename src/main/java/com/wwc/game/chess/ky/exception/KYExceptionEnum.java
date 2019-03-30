package com.wwc.game.chess.ky.exception;

import com.wwc.game.chess.ky.common.ExceptionType;

import java.beans.ConstructorProperties;

/**
 * Description: wwc-game-service
 * <p>
 * Created by saiya on 2019/3/27 0027 下午 2:13
 */
public enum KYExceptionEnum implements ExceptionType {

    UpdateMoneyError(31, "更新的分数小于或者等于0","平台转换金额必须大于0",true),
    UpdateMoneyNotMoreThan1000w(40, "单次上下分数量不能超过一千万","平台转换金额不能超过1千万",true),
    ;
    private int code;
    private String description;



    private String message;

    public Boolean getShow() {
        return show;
    }

    private Boolean show;

    /**
     * 开元异常描述
     * @param code 开元异常编号
     * @param description 开元异常描述
     * @param message 展示给用户的异常信息
     * @param show 是否展示给用户
     */
    @ConstructorProperties({"code", "description","message","show"})
    private KYExceptionEnum(int code, String description,String message,Boolean show) {
        this.code = code;
        this.description = description;
        this.message=message;
        this.show=show;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public static String getDescriptionByCode(int code,Boolean show) {
        if(show==false){
            return "";
        }
        for (KYExceptionEnum e : KYExceptionEnum.values()) {
            if(e.code==code){
                return e.message;
            }
        }
        return "未定位的异常，请联系客服。";
    }


}
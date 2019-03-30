package com.wwc.game.chess.ky.common;

import org.apache.commons.lang.StringUtils;

/**
 * Description: wwc-game-service
 * <p>
 * Created by saiya on 2019/3/27 0027 下午 2:18
 */
public interface ExceptionType {

    /**
     * 异常类型的数字编号
     */
    int getCode();

    /**
     * 异常类型的描述
     */
    String getDescription();

    String getMessage();



}


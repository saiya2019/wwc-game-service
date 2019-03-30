package com.wwc.game.chess.ky.business.model;

import com.wwc.game.chess.ky.business.BaseModel;

/**
 * Description: 上分接口返回数据接收Model
 * <p>
 * Created by saiya on 2019/3/27 0027 下午 6:53
 */
public class RechargeModel extends BaseModel {
    private Float money;

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }
}

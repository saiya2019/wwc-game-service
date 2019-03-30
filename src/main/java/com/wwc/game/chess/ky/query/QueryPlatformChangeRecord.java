package com.wwc.game.chess.ky.query;

import com.wwc.game.chess.ky.business.BaseRequestPage;

/**
 * Description: wwc-game
 * <p>
 * Created by saiya on 2019/3/28 0028 下午 3:06
 */
public class QueryPlatformChangeRecord extends BaseRequestPage {
    private  String account;

    private String appId;

    public QueryPlatformChangeRecord() {
    }


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}

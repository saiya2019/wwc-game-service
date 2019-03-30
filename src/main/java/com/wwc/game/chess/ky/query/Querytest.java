package com.wwc.game.chess.ky.query;

/**
 * Description: wwc-game
 * <p>
 * Created by saiya on 2019/3/30 0030 上午 4:53
 */
public class Querytest  {
    private String tableName;

    private  String account;

    private String appId;


    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
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

    @Override
    public String toString() {
        return "Querytest{" +
                "tableName='" + tableName + '\'' +
                ", account='" + account + '\'' +
                ", appId='" + appId + '\'' +
                '}';
    }
}

package com.wwc.game.chess.ky.po;

public class UserBettingRecord {
    /**
     * 
     */
    private Long id;

    /**
     * 用户所属平台ID,如xini,ycw
     */
    private String appId;

    /**
     * 用户账户
     */
    private String account;

    /**
     * 登录游戏种类所属三方平台ID,如开元棋牌,页面展示项
     */
    private Integer gamePlatformId;

    /**
     * 游戏时间,页面展示项
     */
    private String gameTime;

    /**
     * 游戏时间戳
     */
    private Long gameTimestamp;

    /**
     * 下注金额,页面展示项
     */
    private Double betAmount;

    /**
     * 奖金,页面展示项
     */
    private Double winFee;

    /**
     * 游戏结果对应玩家所属站点
     */
    private String lineCode;

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 用户所属平台ID,如xini,ycw
     * @return app_id 用户所属平台ID,如xini,ycw
     */
    public String getAppId() {
        return appId;
    }

    /**
     * 用户所属平台ID,如xini,ycw
     * @param appId 用户所属平台ID,如xini,ycw
     */
    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    /**
     * 用户账户
     * @return account 用户账户
     */
    public String getAccount() {
        return account;
    }

    /**
     * 用户账户
     * @param account 用户账户
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * 登录游戏种类所属三方平台ID,如开元棋牌,页面展示项
     * @return game_platform_id 登录游戏种类所属三方平台ID,如开元棋牌,页面展示项
     */
    public Integer getGamePlatformId() {
        return gamePlatformId;
    }

    /**
     * 登录游戏种类所属三方平台ID,如开元棋牌,页面展示项
     * @param gamePlatformId 登录游戏种类所属三方平台ID,如开元棋牌,页面展示项
     */
    public void setGamePlatformId(Integer gamePlatformId) {
        this.gamePlatformId = gamePlatformId;
    }

    /**
     * 游戏时间,页面展示项
     * @return game_time 游戏时间,页面展示项
     */
    public String getGameTime() {
        return gameTime;
    }

    /**
     * 游戏时间,页面展示项
     * @param gameTime 游戏时间,页面展示项
     */
    public void setGameTime(String gameTime) {
        this.gameTime = gameTime == null ? null : gameTime.trim();
    }

    /**
     * 游戏时间戳
     * @return game_timestamp 游戏时间戳
     */
    public Long getGameTimestamp() {
        return gameTimestamp;
    }

    /**
     * 游戏时间戳
     * @param gameTimestamp 游戏时间戳
     */
    public void setGameTimestamp(Long gameTimestamp) {
        this.gameTimestamp = gameTimestamp;
    }

    /**
     * 下注金额,页面展示项
     * @return bet_amount 下注金额,页面展示项
     */
    public Double getBetAmount() {
        return betAmount;
    }

    /**
     * 下注金额,页面展示项
     * @param betAmount 下注金额,页面展示项
     */
    public void setBetAmount(Double betAmount) {
        this.betAmount = betAmount;
    }

    /**
     * 奖金,页面展示项
     * @return win_fee 奖金,页面展示项
     */
    public Double getWinFee() {
        return winFee;
    }

    /**
     * 奖金,页面展示项
     * @param winFee 奖金,页面展示项
     */
    public void setWinFee(Double winFee) {
        this.winFee = winFee;
    }

    /**
     * 游戏结果对应玩家所属站点
     * @return line_code 游戏结果对应玩家所属站点
     */
    public String getLineCode() {
        return lineCode;
    }

    /**
     * 游戏结果对应玩家所属站点
     * @param lineCode 游戏结果对应玩家所属站点
     */
    public void setLineCode(String lineCode) {
        this.lineCode = lineCode == null ? null : lineCode.trim();
    }

    /**
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", account=").append(account);
        sb.append(", gamePlatformId=").append(gamePlatformId);
        sb.append(", gameTime=").append(gameTime);
        sb.append(", gameTimestamp=").append(gameTimestamp);
        sb.append(", betAmount=").append(betAmount);
        sb.append(", winFee=").append(winFee);
        sb.append(", lineCode=").append(lineCode);
        sb.append("]");
        return sb.toString();
    }
}
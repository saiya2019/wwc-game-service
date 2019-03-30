package com.wwc.game.chess.ky.po;

public class GameBettingRecord {
    /**
     * 
     */
    private Long id;

    /**
     * 用户所属平台ID
     */
    private String appId;

    /**
     * 游戏种类所属三方平台ID,如1
     */
    private Integer gamePlatformId;

    /**
     * 游戏种类所属三方平台名称,如开元棋牌
     */
    private String gamePlatformName;

    /**
     * 游戏局号
     */
    private String gameBureauId;

    /**
     * 玩家账号列表
     */
    private String accounts;

    /**
     * 房间ID列表
     */
    private Integer serverId;

    /**
     * 游戏ID列表
     */
    private Integer kindId;

    /**
     * 桌子号列表
     */
    private Integer tableId;

    /**
     * 椅子号列表
     */
    private Integer chairId;

    /**
     * 
     */
    private Integer userCount;

    /**
     * 
     */
    private Integer cardValue;

    /**
     * 
     */
    private Double cellScore;

    /**
     * 总下注
     */
    private Double allBet;

    /**
     * 盈利列表
     */
    private Double profit;

    /**
     * 抽水列表
     */
    private Double revenue;

    /**
     * 游戏开始时间列表
     */
    private String gameStartTime;

    /**
     * 游戏结束时间列表
     */
    private String gameEndTime;

    /**
     * 渠道ID列表
     */
    private Integer channelId;

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
     * 用户所属平台ID
     * @return app_id 用户所属平台ID
     */
    public String getAppId() {
        return appId;
    }

    /**
     * 用户所属平台ID
     * @param appId 用户所属平台ID
     */
    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    /**
     * 游戏种类所属三方平台ID,如1
     * @return game_platform_id 游戏种类所属三方平台ID,如1
     */
    public Integer getGamePlatformId() {
        return gamePlatformId;
    }

    /**
     * 游戏种类所属三方平台ID,如1
     * @param gamePlatformId 游戏种类所属三方平台ID,如1
     */
    public void setGamePlatformId(Integer gamePlatformId) {
        this.gamePlatformId = gamePlatformId;
    }

    /**
     * 游戏种类所属三方平台名称,如开元棋牌
     * @return game_platform_name 游戏种类所属三方平台名称,如开元棋牌
     */
    public String getGamePlatformName() {
        return gamePlatformName;
    }

    /**
     * 游戏种类所属三方平台名称,如开元棋牌
     * @param gamePlatformName 游戏种类所属三方平台名称,如开元棋牌
     */
    public void setGamePlatformName(String gamePlatformName) {
        this.gamePlatformName = gamePlatformName == null ? null : gamePlatformName.trim();
    }

    /**
     * 游戏局号
     * @return game_bureau_id 游戏局号
     */
    public String getGameBureauId() {
        return gameBureauId;
    }

    /**
     * 游戏局号
     * @param gameBureauId 游戏局号
     */
    public void setGameBureauId(String gameBureauId) {
        this.gameBureauId = gameBureauId == null ? null : gameBureauId.trim();
    }

    /**
     * 玩家账号列表
     * @return accounts 玩家账号列表
     */
    public String getAccounts() {
        return accounts;
    }

    /**
     * 玩家账号列表
     * @param accounts 玩家账号列表
     */
    public void setAccounts(String accounts) {
        this.accounts = accounts == null ? null : accounts.trim();
    }

    /**
     * 房间ID列表
     * @return server_id 房间ID列表
     */
    public Integer getServerId() {
        return serverId;
    }

    /**
     * 房间ID列表
     * @param serverId 房间ID列表
     */
    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    /**
     * 游戏ID列表
     * @return kind_id 游戏ID列表
     */
    public Integer getKindId() {
        return kindId;
    }

    /**
     * 游戏ID列表
     * @param kindId 游戏ID列表
     */
    public void setKindId(Integer kindId) {
        this.kindId = kindId;
    }

    /**
     * 桌子号列表
     * @return table_id 桌子号列表
     */
    public Integer getTableId() {
        return tableId;
    }

    /**
     * 桌子号列表
     * @param tableId 桌子号列表
     */
    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    /**
     * 椅子号列表
     * @return chair_id 椅子号列表
     */
    public Integer getChairId() {
        return chairId;
    }

    /**
     * 椅子号列表
     * @param chairId 椅子号列表
     */
    public void setChairId(Integer chairId) {
        this.chairId = chairId;
    }

    /**
     * 
     * @return user_count 
     */
    public Integer getUserCount() {
        return userCount;
    }

    /**
     * 
     * @param userCount 
     */
    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    /**
     * 
     * @return card_value 
     */
    public Integer getCardValue() {
        return cardValue;
    }

    /**
     * 
     * @param cardValue 
     */
    public void setCardValue(Integer cardValue) {
        this.cardValue = cardValue;
    }

    /**
     * 
     * @return cell_score 
     */
    public Double getCellScore() {
        return cellScore;
    }

    /**
     * 
     * @param cellScore 
     */
    public void setCellScore(Double cellScore) {
        this.cellScore = cellScore;
    }

    /**
     * 总下注
     * @return all_bet 总下注
     */
    public Double getAllBet() {
        return allBet;
    }

    /**
     * 总下注
     * @param allBet 总下注
     */
    public void setAllBet(Double allBet) {
        this.allBet = allBet;
    }

    /**
     * 盈利列表
     * @return profit 盈利列表
     */
    public Double getProfit() {
        return profit;
    }

    /**
     * 盈利列表
     * @param profit 盈利列表
     */
    public void setProfit(Double profit) {
        this.profit = profit;
    }

    /**
     * 抽水列表
     * @return revenue 抽水列表
     */
    public Double getRevenue() {
        return revenue;
    }

    /**
     * 抽水列表
     * @param revenue 抽水列表
     */
    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    /**
     * 游戏开始时间列表
     * @return game_start_time 游戏开始时间列表
     */
    public String getGameStartTime() {
        return gameStartTime;
    }

    /**
     * 游戏开始时间列表
     * @param gameStartTime 游戏开始时间列表
     */
    public void setGameStartTime(String gameStartTime) {
        this.gameStartTime = gameStartTime == null ? null : gameStartTime.trim();
    }

    /**
     * 游戏结束时间列表
     * @return game_end_time 游戏结束时间列表
     */
    public String getGameEndTime() {
        return gameEndTime;
    }

    /**
     * 游戏结束时间列表
     * @param gameEndTime 游戏结束时间列表
     */
    public void setGameEndTime(String gameEndTime) {
        this.gameEndTime = gameEndTime == null ? null : gameEndTime.trim();
    }

    /**
     * 渠道ID列表
     * @return channel_id 渠道ID列表
     */
    public Integer getChannelId() {
        return channelId;
    }

    /**
     * 渠道ID列表
     * @param channelId 渠道ID列表
     */
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
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
        sb.append(", gamePlatformId=").append(gamePlatformId);
        sb.append(", gamePlatformName=").append(gamePlatformName);
        sb.append(", gameBureauId=").append(gameBureauId);
        sb.append(", accounts=").append(accounts);
        sb.append(", serverId=").append(serverId);
        sb.append(", kindId=").append(kindId);
        sb.append(", tableId=").append(tableId);
        sb.append(", chairId=").append(chairId);
        sb.append(", userCount=").append(userCount);
        sb.append(", cardValue=").append(cardValue);
        sb.append(", cellScore=").append(cellScore);
        sb.append(", allBet=").append(allBet);
        sb.append(", profit=").append(profit);
        sb.append(", revenue=").append(revenue);
        sb.append(", gameStartTime=").append(gameStartTime);
        sb.append(", gameEndTime=").append(gameEndTime);
        sb.append(", channelId=").append(channelId);
        sb.append(", lineCode=").append(lineCode);
        sb.append("]");
        return sb.toString();
    }
}
package com.wwc.game.chess.ky.po;

public class GameKindServerHouse {
    /**
     * 
     */
    private Integer id;

    /**
     * 所属游戏种类ID
     */
    private Integer gameKindId;

    /**
     * 冗余游戏代码
     */
    private String gameCode;

    /**
     * 冗余游戏名称
     */
    private String gameName;

    /**
     * 游戏种类所属三方平台ID,如1
     */
    private Integer gamePlatformId;

    /**
     * 游戏种类所属三方平台名称,如开元棋牌
     */
    private String gamePlatformName;

    /**
     * 三方游戏(如开元棋牌)所属平台ID,如xini-v2
     */
    private String appId;

    /**
     * 服务器ID
     */
    private Integer serverId;

    /**
     * 房间名称
     */
    private String houseName;

    /**
     * 是否可用
     */
    private Boolean enable;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 游戏种类图片url地址
     */
    private String url;

    /**
     * 备用字段
     */
    private String reserve;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 所属游戏种类ID
     * @return game_kind_id 所属游戏种类ID
     */
    public Integer getGameKindId() {
        return gameKindId;
    }

    /**
     * 所属游戏种类ID
     * @param gameKindId 所属游戏种类ID
     */
    public void setGameKindId(Integer gameKindId) {
        this.gameKindId = gameKindId;
    }

    /**
     * 冗余游戏代码
     * @return game_code 冗余游戏代码
     */
    public String getGameCode() {
        return gameCode;
    }

    /**
     * 冗余游戏代码
     * @param gameCode 冗余游戏代码
     */
    public void setGameCode(String gameCode) {
        this.gameCode = gameCode == null ? null : gameCode.trim();
    }

    /**
     * 冗余游戏名称
     * @return game_name 冗余游戏名称
     */
    public String getGameName() {
        return gameName;
    }

    /**
     * 冗余游戏名称
     * @param gameName 冗余游戏名称
     */
    public void setGameName(String gameName) {
        this.gameName = gameName == null ? null : gameName.trim();
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
     * 三方游戏(如开元棋牌)所属平台ID,如xini-v2
     * @return app_id 三方游戏(如开元棋牌)所属平台ID,如xini-v2
     */
    public String getAppId() {
        return appId;
    }

    /**
     * 三方游戏(如开元棋牌)所属平台ID,如xini-v2
     * @param appId 三方游戏(如开元棋牌)所属平台ID,如xini-v2
     */
    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    /**
     * 服务器ID
     * @return server_id 服务器ID
     */
    public Integer getServerId() {
        return serverId;
    }

    /**
     * 服务器ID
     * @param serverId 服务器ID
     */
    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    /**
     * 房间名称
     * @return house_name 房间名称
     */
    public String getHouseName() {
        return houseName;
    }

    /**
     * 房间名称
     * @param houseName 房间名称
     */
    public void setHouseName(String houseName) {
        this.houseName = houseName == null ? null : houseName.trim();
    }

    /**
     * 是否可用
     * @return enable 是否可用
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * 是否可用
     * @param enable 是否可用
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * 排序
     * @return sort 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 排序
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 游戏种类图片url地址
     * @return url 游戏种类图片url地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 游戏种类图片url地址
     * @param url 游戏种类图片url地址
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 备用字段
     * @return reserve 备用字段
     */
    public String getReserve() {
        return reserve;
    }

    /**
     * 备用字段
     * @param reserve 备用字段
     */
    public void setReserve(String reserve) {
        this.reserve = reserve == null ? null : reserve.trim();
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
        sb.append(", gameKindId=").append(gameKindId);
        sb.append(", gameCode=").append(gameCode);
        sb.append(", gameName=").append(gameName);
        sb.append(", gamePlatformId=").append(gamePlatformId);
        sb.append(", gamePlatformName=").append(gamePlatformName);
        sb.append(", appId=").append(appId);
        sb.append(", serverId=").append(serverId);
        sb.append(", houseName=").append(houseName);
        sb.append(", enable=").append(enable);
        sb.append(", sort=").append(sort);
        sb.append(", url=").append(url);
        sb.append(", reserve=").append(reserve);
        sb.append("]");
        return sb.toString();
    }
}
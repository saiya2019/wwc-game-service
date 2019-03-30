package com.wwc.game.chess.ky.po;

import java.util.Date;

public class GamePlatformConfiginfo {
    /**
     * 游戏平台ID
     */
    private Integer id;

    /**
     * 用户所属平台projectID,如xini-v2
     */
    private String appId;

    /**
     * 游戏平台类型
     */
    private String platformType;

    /**
     * 游戏平台类型名称
     */
    private String platformTypeName;

    /**
     * 游戏平台代码
     */
    private String platformCode;

    /**
     * 游戏平台名称
     */
    private String platformName;

    /**
     * 
     */
    private Boolean enable;

    /**
     * 
     */
    private Integer sort;

    /**
     * 
     */
    private String url;

    /**
     * 拉数据接口URL
     */
    private String getRecordUrl;

    /**
     * 备用接口URL
     */
    private String backupsUrl;

    /**
     * MD5密钥
     */
    private String md5key;

    /**
     * DES密钥
     */
    private String deskey;

    /**
     * 公钥
     */
    private String publicKey;

    /**
     * 私钥
     */
    private String privateKey;

    /**
     * 代理编号
     */
    private String agentId;

    /**
     * lc+代理编号
     */
    private String lineCode;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 备用字段
     */
    private String reserve;

    /**
     * 游戏平台ID
     * @return id 游戏平台ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 游戏平台ID
     * @param id 游戏平台ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 用户所属平台projectID,如xini-v2
     * @return app_id 用户所属平台projectID,如xini-v2
     */
    public String getAppId() {
        return appId;
    }

    /**
     * 用户所属平台projectID,如xini-v2
     * @param appId 用户所属平台projectID,如xini-v2
     */
    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    /**
     * 游戏平台类型
     * @return platform_type 游戏平台类型
     */
    public String getPlatformType() {
        return platformType;
    }

    /**
     * 游戏平台类型
     * @param platformType 游戏平台类型
     */
    public void setPlatformType(String platformType) {
        this.platformType = platformType == null ? null : platformType.trim();
    }

    /**
     * 游戏平台类型名称
     * @return platform_type_name 游戏平台类型名称
     */
    public String getPlatformTypeName() {
        return platformTypeName;
    }

    /**
     * 游戏平台类型名称
     * @param platformTypeName 游戏平台类型名称
     */
    public void setPlatformTypeName(String platformTypeName) {
        this.platformTypeName = platformTypeName == null ? null : platformTypeName.trim();
    }

    /**
     * 游戏平台代码
     * @return platform_code 游戏平台代码
     */
    public String getPlatformCode() {
        return platformCode;
    }

    /**
     * 游戏平台代码
     * @param platformCode 游戏平台代码
     */
    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode == null ? null : platformCode.trim();
    }

    /**
     * 游戏平台名称
     * @return platform_name 游戏平台名称
     */
    public String getPlatformName() {
        return platformName;
    }

    /**
     * 游戏平台名称
     * @param platformName 游戏平台名称
     */
    public void setPlatformName(String platformName) {
        this.platformName = platformName == null ? null : platformName.trim();
    }

    /**
     * 
     * @return enable 
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * 
     * @param enable 
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * 
     * @return sort 
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 
     * @param sort 
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 
     * @return url 
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url 
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 拉数据接口URL
     * @return get_record_url 拉数据接口URL
     */
    public String getGetRecordUrl() {
        return getRecordUrl;
    }

    /**
     * 拉数据接口URL
     * @param getRecordUrl 拉数据接口URL
     */
    public void setGetRecordUrl(String getRecordUrl) {
        this.getRecordUrl = getRecordUrl == null ? null : getRecordUrl.trim();
    }

    /**
     * 备用接口URL
     * @return backups_url 备用接口URL
     */
    public String getBackupsUrl() {
        return backupsUrl;
    }

    /**
     * 备用接口URL
     * @param backupsUrl 备用接口URL
     */
    public void setBackupsUrl(String backupsUrl) {
        this.backupsUrl = backupsUrl == null ? null : backupsUrl.trim();
    }

    /**
     * MD5密钥
     * @return MD5Key MD5密钥
     */
    public String getMd5key() {
        return md5key;
    }

    /**
     * MD5密钥
     * @param md5key MD5密钥
     */
    public void setMd5key(String md5key) {
        this.md5key = md5key == null ? null : md5key.trim();
    }

    /**
     * DES密钥
     * @return DESKey DES密钥
     */
    public String getDeskey() {
        return deskey;
    }

    /**
     * DES密钥
     * @param deskey DES密钥
     */
    public void setDeskey(String deskey) {
        this.deskey = deskey == null ? null : deskey.trim();
    }

    /**
     * 公钥
     * @return public_key 公钥
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * 公钥
     * @param publicKey 公钥
     */
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey == null ? null : publicKey.trim();
    }

    /**
     * 私钥
     * @return private_key 私钥
     */
    public String getPrivateKey() {
        return privateKey;
    }

    /**
     * 私钥
     * @param privateKey 私钥
     */
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey == null ? null : privateKey.trim();
    }

    /**
     * 代理编号
     * @return agent_id 代理编号
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * 代理编号
     * @param agentId 代理编号
     */
    public void setAgentId(String agentId) {
        this.agentId = agentId == null ? null : agentId.trim();
    }

    /**
     * lc+代理编号
     * @return line_code lc+代理编号
     */
    public String getLineCode() {
        return lineCode;
    }

    /**
     * lc+代理编号
     * @param lineCode lc+代理编号
     */
    public void setLineCode(String lineCode) {
        this.lineCode = lineCode == null ? null : lineCode.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     * @return update_time 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        sb.append(", appId=").append(appId);
        sb.append(", platformType=").append(platformType);
        sb.append(", platformTypeName=").append(platformTypeName);
        sb.append(", platformCode=").append(platformCode);
        sb.append(", platformName=").append(platformName);
        sb.append(", enable=").append(enable);
        sb.append(", sort=").append(sort);
        sb.append(", url=").append(url);
        sb.append(", getRecordUrl=").append(getRecordUrl);
        sb.append(", backupsUrl=").append(backupsUrl);
        sb.append(", md5key=").append(md5key);
        sb.append(", deskey=").append(deskey);
        sb.append(", publicKey=").append(publicKey);
        sb.append(", privateKey=").append(privateKey);
        sb.append(", agentId=").append(agentId);
        sb.append(", lineCode=").append(lineCode);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", reserve=").append(reserve);
        sb.append("]");
        return sb.toString();
    }
}
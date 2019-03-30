package com.wwc.game.chess.ky.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PlatformChangeRecord implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     * 用户账号
     */
    private String account;

    /**
     * app_id
     */
    private String appId;

    /**
     * 订单编号
     */
    private String orderId;

    /**
     * 来源项目名称
     */
    private String fromPlatformName;

    /**
     * 来源项目第三方code
     */
    private String fromPlatformThirdCode;

    /**
     * 去处项目名称
     */
    private String toPlatformName;

    /**
     * 去处项目第三方code
     */
    private String toPlatformThirdCode;

    /**
     * 转换金额
     */
    private BigDecimal changeMoney;

    /**
     * 状态：0流程数据,不对用户展示. 1充值失败 100充值成功。(部分功能默认是成功,目前只有1和100的状态码对用户展示,根据对接业务需求来定)
     */
    private Byte status;

    /**
     * 可使用下分金额
     */
    private BigDecimal canUsingMoney;

    /**
     * 展示平台金额转换的时间字符串
     */
    private String changeTime;

    /**
     * 创建日期
     */
    private Date createTime;

    /**
     * 修改日期
     */
    private Date updateTime;

    public PlatformChangeRecord(Integer id, String account, String appId, String orderId, String fromPlatformName, String fromPlatformThirdCode, String toPlatformName, String toPlatformThirdCode, BigDecimal changeMoney, Byte status, BigDecimal canUsingMoney) {
        this.id = id;
        this.account = account;
        this.appId = appId;
        this.orderId = orderId;
        this.fromPlatformName = fromPlatformName;
        this.fromPlatformThirdCode = fromPlatformThirdCode;
        this.toPlatformName = toPlatformName;
        this.toPlatformThirdCode = toPlatformThirdCode;
        this.changeMoney = changeMoney;
        this.status = status;
        this.canUsingMoney = canUsingMoney;
    }

    public PlatformChangeRecord() {
    }

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
     * 用户账号
     * @return account 用户账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 用户账号
     * @param account 用户账号
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * app_id
     * @return app_id app_id
     */
    public String getAppId() {
        return appId;
    }

    /**
     * app_id
     * @param appId app_id
     */
    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    /**
     * 订单编号
     * @return order_id 订单编号
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 订单编号
     * @param orderId 订单编号
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * 来源项目名称
     * @return from_platform_name 来源项目名称
     */
    public String getFromPlatformName() {
        return fromPlatformName;
    }

    /**
     * 来源项目名称
     * @param fromPlatformName 来源项目名称
     */
    public void setFromPlatformName(String fromPlatformName) {
        this.fromPlatformName = fromPlatformName == null ? null : fromPlatformName.trim();
    }

    /**
     * 来源项目第三方code
     * @return from_platform_third_code 来源项目第三方code
     */
    public String getFromPlatformThirdCode() {
        return fromPlatformThirdCode;
    }

    /**
     * 来源项目第三方code
     * @param fromPlatformThirdCode 来源项目第三方code
     */
    public void setFromPlatformThirdCode(String fromPlatformThirdCode) {
        this.fromPlatformThirdCode = fromPlatformThirdCode == null ? null : fromPlatformThirdCode.trim();
    }

    /**
     * 去处项目名称
     * @return to_platform_name 去处项目名称
     */
    public String getToPlatformName() {
        return toPlatformName;
    }

    /**
     * 去处项目名称
     * @param toPlatformName 去处项目名称
     */
    public void setToPlatformName(String toPlatformName) {
        this.toPlatformName = toPlatformName == null ? null : toPlatformName.trim();
    }

    /**
     * 去处项目第三方code
     * @return to_platform_third_code 去处项目第三方code
     */
    public String getToPlatformThirdCode() {
        return toPlatformThirdCode;
    }

    /**
     * 去处项目第三方code
     * @param toPlatformThirdCode 去处项目第三方code
     */
    public void setToPlatformThirdCode(String toPlatformThirdCode) {
        this.toPlatformThirdCode = toPlatformThirdCode == null ? null : toPlatformThirdCode.trim();
    }

    /**
     * 转换金额
     * @return change_money 转换金额
     */
    public BigDecimal getChangeMoney() {
        return changeMoney;
    }

    /**
     * 转换金额
     * @param changeMoney 转换金额
     */
    public void setChangeMoney(BigDecimal changeMoney) {
        this.changeMoney = changeMoney;
    }

    /**
     * 状态：0流程数据,不对用户展示. 1充值失败 100充值成功。(部分功能默认是成功,目前只有1和100的状态码对用户展示,根据对接业务需求来定)
     * @return status 状态：0流程数据,不对用户展示. 1充值失败 100充值成功。(部分功能默认是成功,目前只有1和100的状态码对用户展示,根据对接业务需求来定)
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 状态：0流程数据,不对用户展示. 1充值失败 100充值成功。(部分功能默认是成功,目前只有1和100的状态码对用户展示,根据对接业务需求来定)
     * @param status 状态：0流程数据,不对用户展示. 1充值失败 100充值成功。(部分功能默认是成功,目前只有1和100的状态码对用户展示,根据对接业务需求来定)
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 可使用下分金额
     * @return can_using_money 可使用下分金额
     */
    public BigDecimal getCanUsingMoney() {
        return canUsingMoney;
    }

    /**
     * 可使用下分金额
     * @param canUsingMoney 可使用下分金额
     */
    public void setCanUsingMoney(BigDecimal canUsingMoney) {
        this.canUsingMoney = canUsingMoney;
    }

    /**
     * 展示平台金额转换的时间字符串
     * @return change_time 展示平台金额转换的时间字符串
     */
    public String getChangeTime() {
        return changeTime;
    }

    /**
     * 展示平台金额转换的时间字符串
     * @param changeTime 展示平台金额转换的时间字符串
     */
    public void setChangeTime(String changeTime) {
        this.changeTime = changeTime == null ? null : changeTime.trim();
    }

    /**
     * 创建日期
     * @return create_time 创建日期
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建日期
     * @param createTime 创建日期
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改日期
     * @return update_time 修改日期
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改日期
     * @param updateTime 修改日期
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @mbggenerated
     */
    @Override
    public String toString() {
        return "PlatformChangeRecord{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", appId='" + appId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", fromPlatformName='" + fromPlatformName + '\'' +
                ", fromPlatformThirdCode='" + fromPlatformThirdCode + '\'' +
                ", toPlatformName='" + toPlatformName + '\'' +
                ", toPlatformThirdCode='" + toPlatformThirdCode + '\'' +
                ", changeMoney=" + changeMoney +
                ", status=" + status +
                ", canUsingMoney=" + canUsingMoney +
                ", changeTime='" + changeTime + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
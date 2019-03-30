package com.wwc.game.chess.ky.api;

import com.google.gson.*;
import com.wwc.common.entity.ResponseObject;
import com.wwc.common.request.BaseController;
import com.wwc.common.request.CurrentRequestHolder;
import com.wwc.game.chess.ky.exception.KYExceptionEnum;
import com.wwc.game.chess.ky.po.PlatformChangeRecord;
import com.wwc.game.chess.ky.service.PlatformChangeRecordService;
import com.wwc.game.chess.ky.utils.LogUtil;
import com.wwc.game.chess.ky.utils.PostData;
import com.wwc.game.chess.ky.utils.PropertiesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping(value = "/ky")
public class KYHandlerController extends BaseController {

    private static final Gson gson = new GsonBuilder().create();
    private static final long serialVersionUID = 1L;
    private static final String agent = PropertiesUtil.getValue("agent").toString();
    private static final String linecode = PropertiesUtil.getValue("linecode").toString();
    private static final String md5 = PropertiesUtil.getValue("md5").toString();
    private static final String des = PropertiesUtil.getValue("des").toString();
    private static final String url = PropertiesUtil.getValue("url").toString();
    private static final String getRecordUrl = PropertiesUtil.getValue("getRecordUrl").toString();
    private final  String appId= CurrentRequestHolder.getCurrentRequestContext().getAppid();
    @Autowired
    private PlatformChangeRecordService platformChangeRecordService;


    @RequestMapping("/handler")
    public ResponseObject handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String result = "";
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmssSSS");


            String account = request.getParameter("account").isEmpty() ? "test0001" : request.getParameter("account");
            String orderId = request.getParameter("orderId").isEmpty() ? agent + df.format(new Date()) + account : request.getParameter("orderId");
            String money = request.getParameter("money").isEmpty() ? "0" : request.getParameter("money");
            String apiUrl = url;
            String projectId = request.getParameter("projectId").isEmpty() ? "" : request.getParameter("projectId");
            String fromPlatName = request.getParameter("fromPlatName").isEmpty() ? "" : request.getParameter("fromPlatName");
            String fromPlatCode = request.getParameter("fromPlatCode").isEmpty() ? "" : request.getParameter("fromPlatCode");
            String toPlatName = request.getParameter("toPlatName").isEmpty() ? "" : request.getParameter("toPlatName");
            String toPlatCode = request.getParameter("toPlatCode").isEmpty() ? "" : request.getParameter("toPlatCode");

            BigDecimal changeMoney = new BigDecimal(money);


            String s = request.getParameter("s").isEmpty() ? "0" : request.getParameter("s");
            int key = Integer.parseInt(s);

            switch (key) {
                case 0:
                    String ip = getIp(request);
                    //String result = "{\"m\":\"/channelHandle\",\"d\":{\"code\":5}}";
                    result = PostData.game(agent, account, money, orderId, des, md5, apiUrl, ip, linecode);
                    LogUtil.info("KY棋牌登录请求返回值" + result);
                    //String result = "{\"m\":\"/channelHandle\",\"s\":100,\"d\":{\"code\":0,\"url\":\"https://game.ky206.com/index.html?account=30089_20190315&token=eyJkYXRhIjoiMzAwODlfMjAxOTAzMTUiLCJjcmVhdGVkIjoxNTUzNTk4NTc4LCJleHAiOjE1MH0=.UeCDygY5Itou0A65cLAqeu55Cl/zq1CYURURLCyDLPA=&lang=zh-CN&route=kywss.ky206.com\"}}";
                case 2:
                case 3:
                    //校验金额
                    if (changeMoney.compareTo(new BigDecimal("0")) <= 0) {
                        String msg = KYExceptionEnum.getDescriptionByCode(KYExceptionEnum.UpdateMoneyError.getCode(), true);
                        return ResponseObject.of(-1, msg);
                    }

                    if (changeMoney.compareTo(new BigDecimal("10000000")) > 0) {
                        String msg = KYExceptionEnum.getDescriptionByCode(KYExceptionEnum.UpdateMoneyNotMoreThan1000w.getCode(), true);
                        return ResponseObject.of(-1, msg);
                    }


                    Integer uniqueKey = 0;

                    Date nowTime = new Date();

                    //默认第三方都是返回失败的
                    Integer code = -1;
                    //第三方返回的可下分金额 默认插入都是0,只有第三方返回正确的时候更新为正确值
                    BigDecimal canUsingMoney = new BigDecimal(0);
                    //默认平台金额转换都是成功的 如果失败则通过接口修改0,并进行相应操作
                    Byte status = new Byte("100");
                    /**
                     * 上分or下分成功写入平台额度转换记录
                     */
                    PlatformChangeRecord record = new PlatformChangeRecord(uniqueKey,account,appId,orderId,fromPlatName,fromPlatCode,toPlatName,toPlatCode,changeMoney,status,canUsingMoney);
                    //持久化后的数据
                    LogUtil.info("wwc-game 默认调用第三方成功写入平台额度转换记录" + record.toString());
                    record = platformChangeRecordService.add(record);
                    if (key == 2) {
                        result = PostData.sf(agent, account, money, orderId, des, md5, apiUrl);
                        LogUtil.info("KY棋牌上分请求返回值" + result);
                        JsonObject returnData = new JsonParser().parse(result).getAsJsonObject();
                        JsonObject ro = new JsonParser().parse(returnData.get("d").toString()).getAsJsonObject();
                        code = ro.get("code").getAsInt();
                        if (!code.equals(0)) {
                            //失败的情况下,先将记录更新为转换失败状态
                            record.setStatus(new Byte("0"));
                            record.setUpdateTime(new Date());
                            LogUtil.info("wwc-game 调用第三方上分失败更新平台额度转换记录" + record.toString());
                            platformChangeRecordService.add(code, record);
                            String msg = KYExceptionEnum.getDescriptionByCode(code, true);
                            return ResponseObject.of(-1, msg);
                        }
                        canUsingMoney = ro.get("money").getAsBigDecimal();
                    } else {
                        result = PostData.xiafen(agent, account, money, orderId, des, md5, apiUrl);
                        LogUtil.info("KY棋牌下分请求返回值" + result);
                        JsonObject returnData = new JsonParser().parse(result).getAsJsonObject();
                        JsonObject ro = new JsonParser().parse(returnData.get("d").toString()).getAsJsonObject();
                        code = ro.get("code").getAsInt();
                        if (!code.equals(0)) {
                            //失败的情况下,先将记录更新为转换失败状态
                            record.setStatus(new Byte("0"));
                            record.setUpdateTime(new Date());
                            LogUtil.info("wwc-game 调用第三方下分失败更新平台额度转换记录" + record.toString());
                            platformChangeRecordService.add(code, record);
                            String msg = KYExceptionEnum.getDescriptionByCode(code, true);
                            return ResponseObject.of(-1, msg);
                        }
                        canUsingMoney = ro.get("money").getAsBigDecimal();
                    }
                    /*
                     * 成功 返回记录信息,更新 可下分金额
                     */
                    record.setCanUsingMoney(canUsingMoney);
                    platformChangeRecordService.add(record);
                    return ResponseObject.ofData(record);



                /*case 1:
                    response.getWriter().append(PostData.getBalance(agent, account,  des, md5, apiUrl));
                    break;
                case 2:
                    response.getWriter().append(PostData.sf(agent, account, money, orderId, des, md5, apiUrl));
                    break;
                case 3:
                    response.getWriter().append(PostData.xiafen(agent, account, money, orderId, des, md5, apiUrl));
                    break;
                case 4:
                    response.getWriter().append(PostData.getOrder(agent, orderId, des, md5, apiUrl));
                    break;
                case 5:
                    response.getWriter().append(PostData.getState(agent, account, des, md5, apiUrl));
                    break;
                case 6:
                    apiUrl = getRecordUrl;
                    df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String startTime = request.getParameter("startTime").isEmpty() ? df.format(new Date()) : request.getParameter("startTime");
                    String endTime = request.getParameter("endTime").isEmpty() ? df.format(new Date()) : request.getParameter("endTime");
                    startTime = df.parse(startTime).getTime()+"";
                    endTime = df.parse(endTime).getTime()+"";
                    response.getWriter().append(PostData.getRecord(agent, startTime,endTime, des, md5, apiUrl));
                    break;
                case 7:
                    response.getWriter().append(PostData.getAllBalance(agent, account,  des, md5, apiUrl));
                    break;
                case 8:
                    response.getWriter().append(PostData.kick(agent, account,  des, md5, apiUrl));
                    break;*/
                default:
                    break;
            }

        } catch (Exception e) {
            response.getWriter().append("{\"code\":-1,\"msg\":\"" + e.getMessage().replace("\"", "'") + "\"}");
        }
        dealWithResult(result);
        return dealWithResult(result);
    }

    private ResponseObject dealWithResult(String result) {
        String msg = "游戏暂未开放";
        JsonObject returnData = new JsonParser().parse(result).getAsJsonObject();
        Map<String, String> ro = gson.fromJson(returnData.get("d").toString(), Map.class);
        if (null != ro && "0.0".equals(String.valueOf(ro.get("code")))) {
            msg = ro.get("url");
            return ResponseObject.ofData(msg);
        }
        return ResponseObject.of(-1, msg);
    }

    /**
     * 获取客户端请求的真实ip地址
     *
     * @param request 请求对象
     * @return String 客户端请求ip
     */
    public static String getIp(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        if (ip.contains(",")) {
            ip = ip.split(",")[0];
        }
        ;
        return ip;
    }

}

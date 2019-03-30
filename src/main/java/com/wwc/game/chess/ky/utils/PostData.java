package com.wwc.game.chess.ky.utils;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;

import java.util.Date;
import java.util.Map;


/**
 * 前端数据处理类
 */
public class PostData {



	
	/**
	 * POST提交数据方法
	 */
	public static String post(String postUrl) {
		return post(postUrl, null);
	}

	/**
	 * POST提交数据方法
	 */
	public static String post(String postUrl, Map<String, String> entity) {
		String obj = null;
		HttpClient client = new HttpClient();
		PostMethod method = null;
		try {
			method = new PostMethod(postUrl);
			if (entity != null) {
				for (String key : entity.keySet()) {
					method.setParameter(key, entity.get(key));
				}
			}
			client.executeMethod(method);
			System.out.println(client.getState());
			obj = method.getResponseBodyAsString();
			System.out.println(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}	
	
	/**
	 * POST提交数据方法
	 */
	public static String get(String postUrl) {
		String obj = null;
		HttpClient client = new HttpClient();
		GetMethod method = null;
		try {
			method = new GetMethod(postUrl);
			client.executeMethod(method);
			client.getHttpConnectionManager().getParams().setConnectionTimeout(8000);
			client.getHttpConnectionManager().getParams().setSoTimeout(8000);
			obj = method.getResponseBodyAsString();
//			System.out.println(method.getStatusCode());
//			System.out.println(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}	
	
	
	/**
	 * 进入游戏接口
	 * @param agent 代理帐号
	 * @param account 帐号
	 * @param money 余额
	 * @param orderId 订单号
	 * @param dk DES密钥
	 * @param mk MD5密钥
	 * @param apiUrl api接口URL
	 * @param ip 请求IP地址
	 * @param lineCode lineCode
	 * @return 结果
	 * @throws Exception 
	 */
	public static String game(String agent,String account,String money,String orderId,String dk,String mk,String apiUrl,String ip,String lineCode) throws Exception {			
		String time = new Date().getTime()+"";
		String params = "s=0&account="+account+"&money="+money+"&orderid="+orderId+"&ip="+ip+"&lineCode="+lineCode;
		String param = Encrypt.AESEncrypt(params,dk);
		String key = Encrypt.MD5(agent+time + mk);
		String postUrl = apiUrl.concat("?agent=").concat(agent).concat("&timestamp=").concat(time).concat("&param=").concat(param).concat("&key=").concat(key);
		System.out.println("提交"+postUrl);
		return get(postUrl);
	}	
	
	
	/**
	 * 查询可下分余额
	 * @param agent 代理帐号
	 * @param account 帐号
	 * @param des DES密钥
	 * @param md5 MD5密钥
	 * @param apiUrl API接口
	 */
	public static String getBalance(String agent,String account,String des,String md5,String apiUrl) throws Exception{	
		String time = new Date().getTime()+"";
		String params = "s=1&account="+account;
		String param = Encrypt.AESEncrypt(params,des);
		String key = Encrypt.MD5(agent+time + md5);
		String postUrl = apiUrl.concat("?agent=").concat(agent).concat("&timestamp=").concat(time).concat("&param=").concat(param).concat("&key=").concat(key);
		System.out.println("请求URL："+postUrl);
		return get(postUrl);
	}
	
	/**
	 * 上分接口
	 * @param agent 代理帐号
	 * @param account 帐号
	 * @param money 余额
	 * @param orderid 订单号
	 * @param des DES密钥
	 * @param md5 MD5密钥
	 * @param apiUrl API接口
	 */
	public static String sf(String agent,String account,String money,String orderid,String des,String md5,String apiUrl) throws Exception{	
		String time = new Date().getTime()+"";
		String params = "s=2&account="+account+"&money="+money+"&orderid="+orderid;
		String param = Encrypt.AESEncrypt(params,des);
		String key = Encrypt.MD5(agent+time + md5);
		String postUrl = apiUrl.concat("?agent=").concat(agent).concat("&timestamp=").concat(time).concat("&param=").concat(param).concat("&key=").concat(key);
		System.out.println("请求URL："+postUrl);
		return get(postUrl);
	}	
	

	
	/**
	 * 下分接口
	 * @param agent 代理帐号
	 * @param account 帐号
	 * @param money 余额
	 * @param orderid 订单号
	 * @param des DES密钥
	 * @param md5 MD5密钥
	 * @param apiUrl API接口
	 */
	public static String xiafen(String agent,String account,String money,String orderid,String des,String md5,String apiUrl) throws Exception{		
		String time = new Date().getTime()+"";
		String params = "s=3&account="+account+"&money="+money+"&orderid="+orderid;
		String param = Encrypt.AESEncrypt(params,des);
		String key = Encrypt.MD5(agent+time + md5);
		String postUrl = apiUrl.concat("?agent=").concat(agent).concat("&timestamp=").concat(time).concat("&param=").concat(param).concat("&key=").concat(key);
		System.out.println("请求URL："+postUrl);
		return get(postUrl);		
	}
	

	/**
	 * 订单查询
	 * @param agent 代理帐号
	 * @param orderid 订单号
	 * @param des DES密钥
	 * @param md5 MD5密钥
	 * @param apiUrl API接口
	 */
	public static String getOrder(String agent,String orderid,String des,String md5,String apiUrl) throws Exception{	
		String time = new Date().getTime()+"";
		String params = "s=4&orderid="+orderid;
		String param = Encrypt.AESEncrypt(params,des);
		String key = Encrypt.MD5(agent+time + md5);
		String postUrl = apiUrl.concat("?agent=").concat(agent).concat("&timestamp=").concat(time).concat("&param=").concat(param).concat("&key=").concat(key);
		System.out.println("请求URL："+postUrl);
		return get(postUrl);
	}
	
	/**
	 * 玩家是否在线查询
	 * @param agent 代理帐号
	 * @param account 帐号
	 * @param des DES密钥
	 * @param md5 MD5密钥
	 * @param apiUrl API接口
	 */
	public static String getState(String agent,String account,String des,String md5,String apiUrl) throws Exception{	
		String time = new Date().getTime()+"";
		String params = "s=5&account="+account;
		String param = Encrypt.AESEncrypt(params,des);
		String key = Encrypt.MD5(agent+time + md5);
		String postUrl = apiUrl.concat("?agent=").concat(agent).concat("&timestamp=").concat(time).concat("&param=").concat(param).concat("&key=").concat(key);
		System.out.println("请求URL："+postUrl);
		return get(postUrl);
	}
	
	/**
	 * 获取游戏结果数据接口
	 * @param agent 代理帐号
	 * @param startTime 开始时间
	 * @param endTime 结束时间
	 * @param dk DES密钥
	 * @param mk MD5密钥
	 * @param apiUrl api接口URL
	 */
	public static String getRecord(String agent,String startTime,String endTime,String dk,String mk,String apiUrl) throws Exception {			
		String time = new Date().getTime()+"";
		String params = "s=6&startTime="+startTime+"&endTime="+endTime;
		String param = Encrypt.AESEncrypt(params,dk);
		String key = Encrypt.MD5(agent+time + mk);
		String postUrl = apiUrl.concat("?agent=").concat(agent).concat("&timestamp=").concat(time).concat("&param=").concat(param).concat("&key=").concat(key);
		System.out.println("提交"+postUrl);
		return get(postUrl);
	}	
	
	/**
	 * 查询玩家总分
	 * @param agent 代理帐号
	 * @param account 帐号
	 * @param des DES密钥
	 * @param md5 MD5密钥
	 * @param apiUrl API接口
	 */
	public static String getAllBalance(String agent,String account,String des,String md5,String apiUrl) throws Exception{	
		String time = new Date().getTime()+"";
		String params = "s=7&account="+account;
		String param = Encrypt.AESEncrypt(params,des);
		String key = Encrypt.MD5(agent+time + md5);
		String postUrl = apiUrl.concat("?agent=").concat(agent).concat("&timestamp=").concat(time).concat("&param=").concat(param).concat("&key=").concat(key);
		System.out.println("请求URL："+postUrl);
		return get(postUrl);
	}

	
	/**
	 * 踢玩家下线
	 * @param agent 代理帐号
	 * @param account 帐号
	 * @param des DES密钥
	 * @param md5 MD5密钥
	 * @param apiUrl API接口
	 */
	public static String kick(String agent,String account,String des,String md5,String apiUrl) throws Exception{	
		String time = new Date().getTime()+"";
		String params = "s=8&account="+account;
		String param = Encrypt.AESEncrypt(params,des);
		String key = Encrypt.MD5(agent+time + md5);
		String postUrl = apiUrl.concat("?agent=").concat(agent).concat("&timestamp=").concat(time).concat("&param=").concat(param).concat("&key=").concat(key);
		System.out.println("请求URL："+postUrl);
		return get(postUrl);
	}
}

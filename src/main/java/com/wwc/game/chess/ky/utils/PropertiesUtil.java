package com.wwc.game.chess.ky.utils;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 操作proerties文件类
 *
 */
public class PropertiesUtil {
	/**
	 * 获取key对应的值
	 * @param key 键
	 * @return String 值
	 */
	public static Object getValue(String key){
		try{
			Properties prop = new Properties();  
			InputStream inStream = PropertiesUtil.class.getResourceAsStream("/config.properties");
			InputStream in = new BufferedInputStream(inStream);
	        prop.load(in);//加载属性列表	       
	        in.close();
	        return prop.get(key);
		}catch(IOException ex){
			ex.printStackTrace();

		}
		return null;
	}
}

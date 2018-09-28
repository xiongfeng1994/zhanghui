package com.gto.zhanghui.utils;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.codec.binary.Base64;

import com.alibaba.fastjson.JSONObject;

public class HelperUtil {
	public static final String GTKDKEY = "GTKDKEY";
	public static final String LOGIN_URL = "http://180.166.235.94:80/gtoidentityserver/connect/token";
	public static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static final String COLOR = "#000000";
	public static final String ENCODE = "utf-8"; 

	/**
	 * 自动生成32位的UUid，对应数据库的主键id进行插入用。
	 * @return
	 */
	public static String getUUID() {
		
		return UUID.randomUUID().toString().replace("-", "");
	}
	
	/**
	 * 根据billCode得到get接口数据
	 * @param billCode
	 * @return
	 */
	public static String getResult(String billCode) {
		
		String urlDecodeString = "{\"billCode\":"+billCode+"}";
		String key = "GTKDKEY";
		String data_digest1 = getRookieDigest(urlDecodeString+key, "UTF-8");
		String url = "http://192.168.0.199:8322/GTKDServiceInterface/gtkd/pda/qry/LastTrajectory";
		String params = "data="+urlDecodeString+"&data_digest="+data_digest1+"&cpCode=test";
		return HttpRequest.sendGet(url, params);
	}
	
	/**
	 * 获取access_token
	 * @return
	 */
	public static String getAccessToken() {
		
		String url = "https://api.weixin.qq.com/cgi-bin/token";
		String params = "grant_type=client_credential&appid=wxe0e1817877210934&secret=412b5eaaf4e097b6cecaaaa2d318ebee";
		String result = HttpRequest.sendGet(url, params);
		JSONObject jsonObject = JSONObject.parseObject(result);
		String access_token = jsonObject.getString("access_token");
		return access_token;
	}
	
	/**
	 * 返回签名data_digest
	 * @param content urlDecodeString=url(param) + key GTKDKEY
	 * @param charset 字符编码
	 * @return
	 */
	public static String getRookieDigest(String content, String charset) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(content.getBytes(charset));
            return new String(Base64.encodeBase64(md.digest()), charset);
        } catch (Exception e) {
            return "";
        }
	}
	
    /**
     * URL 解码
     *
     * @return String
     * @author lifq
     * @date 2015-3-17 下午04:09:51
     */
    public static String getURLDecoderString(String str) {
        String result = "";
        if (null == str) {
            return "";
        }
        try {
            result = java.net.URLDecoder.decode(str, ENCODE);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    /**
     * URL 转码
     *
     * @return String
     * @author lifq
     * @date 2015-3-17 下午04:10:28
     */
    public static String getURLEncoderString(String str) {
        String result = "";
        if (null == str) {
            return "";
        }
        try {
            result = java.net.URLEncoder.encode(str, ENCODE);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }
	
	/**
     * 获取利用反射获取类里面的值和名称
     *
     * @param obj
     * @return
     * @throws IllegalAccessException
     */
    public static Map<String, Object> objectToMap(Object obj) throws IllegalAccessException {
        Map<String, Object> map = new HashMap<>();
        Class<?> clazz = obj.getClass();
        System.out.println(clazz);
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            String fieldName = field.getName();
            Object value = field.get(obj);
            map.put(fieldName, value);
        }
        return map;
    }
    
    
}

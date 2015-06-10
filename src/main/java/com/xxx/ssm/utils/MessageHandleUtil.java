/*
 * Copyright (C) xxxx-2015 Your Company Inc.All Rights Reserved.
 * 
 * FileName：MessageHandleUtil.java
 * 
 * Description：信息处理工具
 * 
 * History：
 * 1.0 Kai.Zhao 2015年6月10日 Create
 * 1.1 Kai.Zhao 2015年6月10日 JSON返回
 */
package com.xxx.ssm.utils;

import com.alibaba.fastjson.JSONObject;
import com.xxx.ssm.config.CommonConstant;

/**
 * 信息处理工具
 * 
 * @author Kai.Zhao
 * @version 1.0
 * @see
 */
public class MessageHandleUtil {

	/**
	 * 组织JSON返回信息
	 * 
	 * @param returnCode 返回码
	 * @param returnMessage 返回值
	 * @param data 返回数据
	 * @return
	 * @see
	 */
	public static String returnJSONString(int returnCode, String returnMessage, Object data) {
		JSONObject json = new JSONObject();
		json.put(CommonConstant.RETURN_CODE, returnCode);
		json.put(CommonConstant.RETURN_MESSAGE, returnMessage);
		json.put(CommonConstant.DATA, data);
		return json.toJSONString();
	}

	/**
	 * 组织JSON返回信息
	 * 
	 * @param returnCode 返回码
	 * @param returnMessage 返回值
	 * @return
	 * @see
	 */
	public static String returnJSONString(int returnCode, String returnMessage) {
		JSONObject json = new JSONObject();
		json.put(CommonConstant.RETURN_CODE, returnCode);
		json.put(CommonConstant.RETURN_MESSAGE, returnMessage);
		return json.toJSONString();
	}

}

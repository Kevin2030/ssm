/*
 * Copyright (C) xxxx-2015 Your Company Inc.All Rights Reserved.
 * 
 * FileName：CommonUtil.java
 * 
 * Description：通用工具
 * 
 * History：
 * 1.0 Kai.Zhao 2015年6月10日 Create
 * 1.1 Kai.Zhao 2015年6月10日 字符串空验证
 */
package com.xxx.ssm.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * 通用工具
 * 
 * @author Kai.Zhao
 * @version 1.0
 * @see
 */
public class CommonUtil {

	/**
	 * 验证空字符串
	 * 
	 * @param params 字符集
	 * @return
	 * @see
	 */
	public static boolean isBlank(String... params) {
		for (String param : params) {
			if (StringUtils.isBlank(param)) {
				return true;
			}
		}
		return false;
	}
}

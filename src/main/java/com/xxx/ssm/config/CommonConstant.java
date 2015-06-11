/*
 * Copyright (C) xxxx-2015 Your Company Inc.All Rights Reserved.
 * 
 * FileName：CommonConstants.java
 * 
 * Description：系统常量
 * 
 * History：
 * 1.0 Kai.Zhao 2015年6月10日 Create
 * 1.1 Kai.Zhao 2015年6月10日 返回码、返回值
 */
package com.xxx.ssm.config;

/**
 * 常量
 * 
 * @author Kai.Zhao
 * @version 1.0
 * @see
 */
public class CommonConstant {
	/**
	 * 返回码
	 */
	public static final String RETURN_CODE = "status";
	/**
	 * 返回值
	 */
	public static final String RETURN_MESSAGE = "msg";
	/**
	 * 返回数据
	 */
	public static final String DATA = "data";

	/**
	 * 返回值
	 * 
	 * @author Kai.Zhao
	 * @version 1.0
	 * @see
	 */
	public class ReturnMessage {
		public static final String FAILURE = "操作失败";
		public static final String SERVICE_ERROR = "服务器异常,请稍候再试!";
		public static final String REQUEST_ILLEGAL = "请求非法";
		public static final String SERVICE_TIME_OUT = "登录超时";
		public static final String SUCCESS = "操作成功";
		public static final String CLIENT_INPUT_ERROR = "客户端输入错误";
	}

	/**
	 * 返回Code
	 * 
	 * @author Kai.Zhao
	 * @version 1.0
	 * @see
	 */
	public class ReturnCode {
		/**
		 * 成功
		 */
		public static final int SUCCESS = 200;
		/**
		 * 服务器异常
		 */
		public static final int SERVICE_ERROR = 500;
		/**
		 * 请求非法
		 */
		public static final int REQUEST_ILLEGAL = 501;
		/**
		 * 超时
		 */
		public static final int SERVICE_TIME_OUT = 502;
		/**
		 * 失败
		 */
		public static final int FAILURE = 600;
		/**
		 * 客户端输入错误
		 */
		public static final int CLIENT_INPUT_ERROR = 601;

	}
}

package com.javaniuniu.servicesms.service;

import com.javaniuniu.internalcommon.dto.ResponseResult;
import com.javaniuniu.internalcommon.dto.servicesms.request.SmsSendRequest;

public interface SmsService {
	/**
	 * 发送短信
	 * @param request
	 * @return
	 */
	public ResponseResult sendSms(SmsSendRequest request);
}
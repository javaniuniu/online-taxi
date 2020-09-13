package com.javaniuniu.apipassenger.service;

import com.javaniuniu.internalcommon.dto.ResponseResult;
import com.javaniuniu.internalcommon.dto.servicesms.request.SmsSendRequest;

public interface ServiceSmsRestTemplateService {

    public ResponseResult sendSms(String phoneNumber, String code);
}

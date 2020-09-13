package com.javaniuniu.apipassenger.service;

import com.javaniuniu.internalcommon.dto.ResponseResult;
import com.javaniuniu.internalcommon.dto.servicesms.request.SmsSendRequest;

public interface ServiceVerificationCodeRestTemplateService {

    public ResponseResult generatorCode(int identity, String phoneNumber);

    public ResponseResult verifyCode(int identity, String phoneNumber, String code);
}

package com.javaniuniu.apipassenger.service.impl;

import com.javaniuniu.apipassenger.service.AuthService;
import com.javaniuniu.apipassenger.service.ServicePassengerUserService;
import com.javaniuniu.apipassenger.service.ServiceVerificationCodeRestTemplateService;
import com.javaniuniu.apipassenger.service.VerificationCodeService;
import com.javaniuniu.internalcommon.constant.CommonStatusEnum;
import com.javaniuniu.internalcommon.constant.IdentityConstant;
import com.javaniuniu.internalcommon.dto.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private ServiceVerificationCodeRestTemplateService serviceVerificationCodeRestTemplateService;

    @Autowired
    private ServicePassengerUserService servicePassengerUserService;

    @Override
    public ResponseResult auth(String passengerPhone, String code) {
        // 验证验证码：
        ResponseResult responseResult = serviceVerificationCodeRestTemplateService.verifyCode(IdentityConstant.PASSENGER,passengerPhone,code);
        if (responseResult.getCode() != CommonStatusEnum.SUCCESS.getCode()){
            return ResponseResult.fail("登录失败：验证码校验失败");
        }

        // 用户登录
        responseResult = servicePassengerUserService.login(passengerPhone);
        if (responseResult.getCode() != CommonStatusEnum.SUCCESS.getCode()){
            return ResponseResult.fail("登录失败：登录失败");
        }

        return responseResult;
    }

}

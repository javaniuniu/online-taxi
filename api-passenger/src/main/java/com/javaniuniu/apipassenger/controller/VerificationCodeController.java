package com.javaniuniu.apipassenger.controller;

import com.javaniuniu.apipassenger.request.ShortMsgRequest;
import com.javaniuniu.apipassenger.service.VerificationCodeService;
import com.javaniuniu.internalcommon.dto.ResponseResult;
import com.javaniuniu.internalcommon.dto.servicesms.request.SmsSendRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/verify-code")
public class VerificationCodeController {

    @Autowired
    private VerificationCodeService verificationCodeService;

    @PostMapping("/send")
    public ResponseResult send(@RequestBody @Validated ShortMsgRequest request){

        return verificationCodeService.send(request.getPhoneNumber());
    }
}

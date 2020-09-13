package com.javaniuniu.apipassenger.service;

import com.javaniuniu.internalcommon.dto.ResponseResult;

public interface VerificationCodeService {

    public ResponseResult send(String phoneNumber);

    public ResponseResult verify(String phoneNumber, String code);
}

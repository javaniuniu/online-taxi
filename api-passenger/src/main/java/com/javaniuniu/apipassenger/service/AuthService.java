package com.javaniuniu.apipassenger.service;

import com.javaniuniu.internalcommon.dto.ResponseResult;

public interface AuthService {
    public ResponseResult auth(String passengerPhone, String code);
}

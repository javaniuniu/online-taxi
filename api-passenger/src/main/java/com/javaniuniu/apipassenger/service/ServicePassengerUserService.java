package com.javaniuniu.apipassenger.service;

import com.javaniuniu.internalcommon.dto.ResponseResult;
import com.javaniuniu.internalcommon.dto.servicepassengeruser.request.LoginRequest;

public interface ServicePassengerUserService {

    public ResponseResult login(String passengerPhone);
}

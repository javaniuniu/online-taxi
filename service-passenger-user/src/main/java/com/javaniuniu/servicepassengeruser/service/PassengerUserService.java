package com.javaniuniu.servicepassengeruser.service;

import com.javaniuniu.internalcommon.dto.ResponseResult;

public interface PassengerUserService {

    public ResponseResult login(String passengerPhone);

    public ResponseResult logout(String token);
}

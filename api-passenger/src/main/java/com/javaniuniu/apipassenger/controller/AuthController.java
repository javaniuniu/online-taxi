package com.javaniuniu.apipassenger.controller;

import com.javaniuniu.apipassenger.request.UserAuthRequest;
import com.javaniuniu.apipassenger.service.AuthService;
import com.javaniuniu.internalcommon.dto.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseResult login(@RequestBody @Validated UserAuthRequest userAuthRequest) {

        String passengerPhone = userAuthRequest.getPassengerPhone();
        String code = userAuthRequest.getCode();

        return authService.auth(passengerPhone , code);

    }
}

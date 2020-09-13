package com.javaniuniu.servicepassengeruser.dao;

import com.javaniuniu.servicepassengeruser.entity.ServicePassengerUserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ServicePassengerUserInfoCustomDao extends ServicePassengerUserInfoDao{

    /**
     * 根据手机号查询乘客信息
     * @param passengerPhone
     * @return
     */
    ServicePassengerUserInfo selectByPhoneNumber(String passengerPhone);
}
package com.javaniuniu.servicesms.dao;

import com.javaniuniu.servicesms.entity.ServiceSmsRecord;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
public interface ServiceSmsRecordDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ServiceSmsRecord record);

    int insertSelective(ServiceSmsRecord record);

    ServiceSmsRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ServiceSmsRecord record);

    int updateByPrimaryKey(ServiceSmsRecord record);
}
package com.javaniuniu.servicesms.dao;

import com.javaniuniu.servicesms.entity.ServiceSmsTemplate;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface ServiceSmsTemplateDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ServiceSmsTemplate record);

    int insertSelective(ServiceSmsTemplate record);

    ServiceSmsTemplate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ServiceSmsTemplate record);

    int updateByPrimaryKey(ServiceSmsTemplate record);
}
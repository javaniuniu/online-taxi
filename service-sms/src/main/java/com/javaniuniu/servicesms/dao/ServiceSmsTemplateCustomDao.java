package com.javaniuniu.servicesms.dao;

import com.javaniuniu.servicesms.entity.ServiceSmsTemplate;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
public interface ServiceSmsTemplateCustomDao extends ServiceSmsTemplateDao {

    ServiceSmsTemplate selectByTemplateId(String templateId);
}

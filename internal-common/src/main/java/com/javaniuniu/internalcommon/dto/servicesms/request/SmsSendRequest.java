package com.javaniuniu.internalcommon.dto.servicesms.request;

import com.javaniuniu.internalcommon.dto.servicesms.SmsTemplateDto;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * @author javaniuniu
 */
@Data
public class SmsSendRequest{

	private String[] receivers;
	private List<SmsTemplateDto> data;

	@Override
	public String toString() {
		return "SmsSendRequest [reveivers=" + Arrays.toString(receivers) + ", data=" + data + "]";
	}

}
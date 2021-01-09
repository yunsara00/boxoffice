package com.boot.leaf.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.leaf.dto.PaymentDto;
import com.boot.leaf.mapper.PaymentMapper;

@Service
public class PaymentBiz {
	
	@Autowired
	PaymentMapper mapper;
	
	public int selectPaymentno(String payment_impuid) {
		return mapper.selectPaymentno(payment_impuid);
	}
	
	public int insertPayment(PaymentDto dto) {
		return mapper.insertPayment(dto);
	}

}

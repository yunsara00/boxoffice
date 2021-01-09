package com.boot.leaf.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.leaf.dto.PaymentDto;
import com.boot.leaf.dto.ReservedSeatDto;
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
	
	public String selectSeat(ReservedSeatDto dto) {
		String seatno = "";
		
		List<ReservedSeatDto> list = mapper.selectSeat(dto);
		for(int i=0; i<list.size(); i++) {
			seatno += "," + list.get(i).getReserve_seat();
		}
		
		return seatno;
	}

}

package com.boot.leaf.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.boot.leaf.dto.PaymentDto;
import com.boot.leaf.dto.ReservedSeatDto;

@Mapper
public interface PaymentMapper {
	
	@Select(" SELECT PAYMENT_NO FROM PAYMENT WHERE PAYMENT_IMPUID = #{payment_impuid} ")
	public int selectPaymentno(String payment_impuid);
	
	@Insert(" INSERT INTO PAYMENT "
			+ " VALUES(PAYMENT_SEQ.NEXTVAL, #{payment_type}, #{payment_price}, 'Y', #{payment_date}, #{payment_impuid}, 'N') ")
	public int insertPayment(PaymentDto dto);

	@Select(" SELECT RESERVE_SEAT FROM RESERVEDSEAT WHERE MOVIENO = #{movieno} AND RESERVE_DATE = #{reserve_date} AND RESERVE_TIME = #{reserve_time} ")
	public List<ReservedSeatDto> selectSeat(ReservedSeatDto dto);
}

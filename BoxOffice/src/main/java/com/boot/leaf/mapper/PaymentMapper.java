package com.boot.leaf.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.boot.leaf.dto.PaymentDto;

@Mapper
public interface PaymentMapper {
	
	@Select(" SELECT PAYMENT_NO FROM PAYMENT WHERE PAYMENT_IMPUID = #{payment_impuid} ")
	public int selectPaymentno(String payment_impuid);
	
	@Insert(" INSERT INTO PAYMENT "
			+ " VALUES(PAYMENT_SEQ.NEXTVAL, #{payment_type}, #{payment_price}, 'Y', #{payment_date}, #{payment_impuid}, 'N') ")
	public int insertPayment(PaymentDto dto);

}

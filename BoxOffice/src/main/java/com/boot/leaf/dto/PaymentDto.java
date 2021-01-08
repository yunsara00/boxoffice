package com.boot.leaf.dto;

import java.util.Date;

public class PaymentDto {
	
	private int payment_no;
	private String payment_type;
	private String payment_price;
	private String payment_state;
	private Date payment_date;
	private String payment_impuid;
	private String payment_refund;
	
	public PaymentDto() {
	}
	public PaymentDto(int payment_no, String payment_type, String payment_price, String payment_state,
			Date payment_date, String payment_impuid, String payment_refund) {
		this.payment_no = payment_no;
		this.payment_type = payment_type;
		this.payment_price = payment_price;
		this.payment_state = payment_state;
		this.payment_date = payment_date;
		this.payment_impuid = payment_impuid;
		this.payment_refund = payment_refund;
	}
	
	public int getPayment_no() {
		return payment_no;
	}
	public void setPayment_no(int payment_no) {
		this.payment_no = payment_no;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	public String getPayment_price() {
		return payment_price;
	}
	public void setPayment_price(String payment_price) {
		this.payment_price = payment_price;
	}
	public String getPayment_state() {
		return payment_state;
	}
	public void setPayment_state(String payment_state) {
		this.payment_state = payment_state;
	}
	public Date getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}
	public String getPayment_impuid() {
		return payment_impuid;
	}
	public void setPayment_impuid(String payment_impuid) {
		this.payment_impuid = payment_impuid;
	}
	public String getPayment_refund() {
		return payment_refund;
	}
	public void setPayment_refund(String payment_refund) {
		this.payment_refund = payment_refund;
	}
	
	
}

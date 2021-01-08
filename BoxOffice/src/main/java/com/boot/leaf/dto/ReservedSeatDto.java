package com.boot.leaf.dto;

public class ReservedSeatDto {

	private int reserve_no;
	private int memberno;
	private int movieno;
	private int payment_no;
	private String reserve_date;
	private int reserve_time;
	private String reserve_seat;
	
	public ReservedSeatDto() {
	}
	public ReservedSeatDto(int reserve_no, int memberno, int movieno, int payment_no, String reserve_date,
			int reserve_time, String reserve_seat) {
		this.reserve_no = reserve_no;
		this.memberno = memberno;
		this.movieno = movieno;
		this.payment_no = payment_no;
		this.reserve_date = reserve_date;
		this.reserve_time = reserve_time;
		this.reserve_seat = reserve_seat;
	}
	
	public int getReserve_no() {
		return reserve_no;
	}
	public void setReserve_no(int reserve_no) {
		this.reserve_no = reserve_no;
	}
	public int getMemberno() {
		return memberno;
	}
	public void setMemberno(int memberno) {
		this.memberno = memberno;
	}
	public int getMovieno() {
		return movieno;
	}
	public void setMovieno(int movieno) {
		this.movieno = movieno;
	}
	public int getPayment_no() {
		return payment_no;
	}
	public void setPayment_no(int payment_no) {
		this.payment_no = payment_no;
	}
	public String getReserve_date() {
		return reserve_date;
	}
	public void setReserve_date(String reserve_date) {
		this.reserve_date = reserve_date;
	}
	public int getReserve_time() {
		return reserve_time;
	}
	public void setReserve_time(int reserve_time) {
		this.reserve_time = reserve_time;
	}
	public String getReserve_seat() {
		return reserve_seat;
	}
	public void setReserve_seat(String reserve_seat) {
		this.reserve_seat = reserve_seat;
	}
	
}

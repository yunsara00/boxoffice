package com.boot.leaf.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.boot.leaf.biz.BookBiz;
import com.boot.leaf.biz.PaymentBiz;
import com.boot.leaf.dto.MemberDto;
import com.boot.leaf.dto.PaymentDto;
import com.boot.leaf.dto.ReservedSeatDto;

@Controller
public class BookController {
	
	@Autowired
	BookBiz biz;
	@Autowired
	PaymentBiz paymentBiz;
	
	@GetMapping("/selectMovie")
	public String selectMovie(Model model, int movieno) {
		model.addAttribute("movie", biz.selectMovie(movieno));
		
		return "selectDate";
	}

	@PostMapping("/selectSeat")
	public String selectSeat(Model model, ReservedSeatDto dto, String moviename) {
		model.addAttribute("dto", dto);
		model.addAttribute("moviename", moviename);
		
		String reserveSeat = paymentBiz.selectSeat(dto);
		model.addAttribute("reserveSeat", reserveSeat);
		
		return "selectSeat";
	}

	@PostMapping("/requestPayment")
	public String requestPayment(HttpSession session, Model model, ReservedSeatDto dto, String seat, String price) {
		String[] seatArr = seat.split(",");
		
		MemberDto login = (MemberDto)session.getAttribute("login");
		dto.setMemberno(login.getMemberno());
		
		List<ReservedSeatDto> reserveList = new ArrayList<ReservedSeatDto>();
		for(int i=0; i<seatArr.length; i++) {
			dto.setReserve_seat(seatArr[i]);
			reserveList.add(dto);
		}
		session.setAttribute("reserveList", reserveList);
		
		model.addAttribute("price", price);
		
		return "payment";
	}
	
	@PostMapping("/paymentSuccess")
	public void paymentSuccess(HttpSession session, PaymentDto paymentDto) {
		paymentBiz.insertPayment(paymentDto);
		int payment_no = paymentBiz.selectPaymentno(paymentDto.getPayment_impuid());
		
		ArrayList<ReservedSeatDto> reserveList = (ArrayList) session.getAttribute("reserveList");
		
		for(int i=0; i<reserveList.size(); i++) {
			reserveList.get(i).setPayment_no(payment_no);
		}
		
		biz.insertBook(reserveList);
	}
}

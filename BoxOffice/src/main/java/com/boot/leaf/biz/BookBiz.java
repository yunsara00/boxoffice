package com.boot.leaf.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.leaf.dto.MovieDto;
import com.boot.leaf.dto.ReservedSeatDto;
import com.boot.leaf.mapper.BookMapper;

@Service
public class BookBiz {
	
	@Autowired
	BookMapper mapper;
	
	public MovieDto selectMovie(int movieno) {
		return mapper.selectMovie(movieno);
	}
	
	public int insertBook(List<ReservedSeatDto> list) {
		int res = 0;
		
		for(int i=0; i<list.size(); i++) {
			res += mapper.insertBook(list.get(i));
		}
		
		return res;
	}
	

}

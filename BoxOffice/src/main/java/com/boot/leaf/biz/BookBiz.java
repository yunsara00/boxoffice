package com.boot.leaf.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.leaf.dto.MovieDto;
import com.boot.leaf.mapper.BookMapper;

@Service
public class BookBiz {
	
	@Autowired
	BookMapper mapper;
	
	public MovieDto selectMovie(int movieno) {
		return mapper.selectMovie(movieno);
	}
	

}

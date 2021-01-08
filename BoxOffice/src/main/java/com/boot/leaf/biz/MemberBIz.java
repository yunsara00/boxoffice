package com.boot.leaf.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.leaf.dto.MemberDto;
import com.boot.leaf.mapper.MemberMapper;

@Service
public class MemberBIz {
	@Autowired
	MemberMapper mapper;
	
	public MemberDto login(MemberDto dto) {
		return mapper.login(dto);
	}

	public int register(MemberDto dto) {
		return mapper.register(dto);
	}
}

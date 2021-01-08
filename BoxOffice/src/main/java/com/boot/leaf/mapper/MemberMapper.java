package com.boot.leaf.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.boot.leaf.dto.MemberDto;

@Mapper
public interface MemberMapper {
	
	@Select(" SELECT MEMBERNO, MEMBERID, MEMBERPW, MEMBERNAME " + 
			"		FROM MYMEMBER " + 
			"		WHERE MEMBERID = #{memberid} " + 
			"		AND MEMBERPW = #{memberpw} ")
	MemberDto login(MemberDto dto);
	
	@Insert(" INSERT INTO MYMEMBER VALUES(MEMBERSEQ.NEXTVAL, #{memberid}, #{memberpw}, #{membername}) ")
	int register(MemberDto dto);

}

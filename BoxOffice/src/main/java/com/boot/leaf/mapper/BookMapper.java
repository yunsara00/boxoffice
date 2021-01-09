package com.boot.leaf.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.boot.leaf.dto.MovieDto;
import com.boot.leaf.dto.ReservedSeatDto;

@Mapper
public interface BookMapper {

	@Select(" SELECT MOVIENO, MOVIENAME FROM MOVIE WHERE MOVIENO = #{movieno} ")
	public MovieDto selectMovie(int movieno);
	
	@Insert(" INSERT INTO RESERVESEAT "
			+ " VALUES(RESERVEDSEAT_SEQ.NEXTVAL, #{memberno}, #{movieno}, "
			+ " #{payment_no}, #{reserve_date}, #{reserve_time}, #{reserve_seat}) ")
	public int insertBook(ReservedSeatDto dto);
	
}

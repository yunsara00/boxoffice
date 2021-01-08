package com.boot.leaf.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.boot.leaf.dto.MovieDto;

@Mapper
public interface BookMapper {

	@Select(" SELECT MOVIENO, MOVIENAME FROM MOVIE WHERE MOVIENO = #{movieno} ")
	MovieDto selectMovie(int movieno);
	
}

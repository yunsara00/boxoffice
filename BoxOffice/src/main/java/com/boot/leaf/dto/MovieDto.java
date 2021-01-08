package com.boot.leaf.dto;

public class MovieDto {
	
	private int movieno;
	private String moviename;
	
	public MovieDto() {
	}
	public MovieDto(int movieno, String moviename) {
		this.movieno = movieno;
		this.moviename = moviename;
	}
	
	public int getMovieno() {
		return movieno;
	}
	public void setMovieno(int movieno) {
		this.movieno = movieno;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	
	


}

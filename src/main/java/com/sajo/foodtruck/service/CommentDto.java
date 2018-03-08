package com.sajo.foodtruck.service;

public class CommentDto {
	private String cno;
	private String title;
	private java.sql.Date cpostdate;
	private String no;
	private String id;
	//프로그램의 효율성을 위한 속성 추가
	private String name;

	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public java.sql.Date getCpostdate() {
		return cpostdate;
	}
	public void setCpostdate(java.sql.Date cpostdate) {
		this.cpostdate = cpostdate;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

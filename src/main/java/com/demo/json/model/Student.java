package com.demo.json.model;

public class Student {
	
	private int sid;
	private String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public Student() {
		super();
	}
	
	
	

}

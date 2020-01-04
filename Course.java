package com.sbi;

public class Course {
	int course_id;
	String course_name;
	int course_duration;
	int course_fees;
	public Course() {}
	public Course(int course_id, String course_name, int course_duration, int course_fees) {
		
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_duration = course_duration;
		this.course_fees = course_fees;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public int getCourse_duration() {
		return course_duration;
	}
	public void setCourse_duration(int course_duration) {
		this.course_duration = course_duration;
	}
	public int getCourse_fees() {
		return course_fees;
	}
	public void setCourse_fees(int course_fees) {
		this.course_fees = course_fees;
	}
	
	
	


}

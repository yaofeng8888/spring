package com.yaofeng.pojo.po;

public class Teacher {

	private String teacherName;
	private Integer age;
	private Phone phone;
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Teacher [teacherName=" + teacherName + ", age=" + age + ", phone=" + phone + "]";
	}
	
}

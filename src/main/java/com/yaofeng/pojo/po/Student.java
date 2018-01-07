package com.yaofeng.pojo.po;

public class Student {
	private String name;
	private Integer age;
	
	private Phone phone;
	
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Student() {
		System.out.println("Œ“¿¥¡À");
	}
	public Student(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}

	
}

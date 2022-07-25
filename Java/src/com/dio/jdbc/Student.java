package com.dio.jdbc;

public class Student {
	private int id;
	private String name;
	private int age;
	private String state;
	
	public Student(int id, String name, int age, String state) {
		this.setId(id);
		this.setName(name);
		this.setAge(age);
		this.setState(state);
	}
	public Student(String name, int age, String state) {
		this.setName(name);
		this.setAge(age);
		this.setState(state);
	}
	public Student() {
		// no arguments sent!
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", age=" + age + ", state=" + state + "]";
	}
	
	

}

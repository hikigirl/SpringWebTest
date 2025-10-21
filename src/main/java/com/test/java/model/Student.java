package com.test.java.model;

import lombok.Getter;

//@Getter
public class Student {
	private String name;
	private String gender;
	
	public String getTest() {
		return name;
	}

	public String aaa() { //jackson-databind가 get~~로 시작하지 않으면 getter라고 인식하지 못함
		return gender;
	}

	public Student() {
		this.name="스프링";
		this.gender="남자";
	}
}

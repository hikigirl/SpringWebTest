package com.test.java.model;

public class SpringDAO {

	public int count() {
		//select를 했다고 가정, 일단 100을 돌려줌
		return 120;
	}

	public void add(AddressDTO dto) {
		//db작업했다고 가정
		System.out.println(dto);
		
	}

}

package com.test.java.model;

import org.springframework.stereotype.Repository;

@Repository
public class SpringDAO {

	public int count() {
		//select를 했다고 가정, 일단 100을 돌려줌
		return 120;
	}

	public void add(AddressDTO dto) {
		//db작업했다고 가정
		System.out.println(dto);
		
	}

	public String work() {
		// ex08, 어노테이션을 이용한 의존 주입
		
		//select 했다고 가정
		return "의존주입 Annotation방식";
	}

}
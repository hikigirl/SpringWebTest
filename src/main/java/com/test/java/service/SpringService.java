package com.test.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.java.model.SpringDAO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Service 
//@NoArgsConstructor //기본 생성자(인자값 없음) 
//@AllArgsConstructor //모든 멤버 변수를 인자값으로 갖는 생성자
@RequiredArgsConstructor //반드시 초기화가 필요한 멤버 변수(final 상수)
public class SpringService {
	
	//Annotation을 이용한 의존 주입
	
	//1. @Autowired + 생성자
	/*  
	private SpringDAO dao;
	//의존 주입 도구(여기서는 생성자) -> @AutoWired 선언
	@Autowired
	public SpringService(SpringDAO dao) {
		this.dao = dao;
	}
	*/
	
	//2. @Autowired + Setter
	/*  
	private SpringDAO dao;
	@Autowired
	public void setDao(SpringDAO dao) {
		this.dao = dao;
	}
	*/
	
	//3. 멤버 변수에 직접 @Autowired 선언
	//- 의존 주입 도구(생성자, setter)가 필요없다.
	//- 가장 간편하지만 테스트와 유지보수가 어려움
	/*
	@Autowired
	private SpringDAO dao;
	*/
	
	//4. 생성자 + @Autowired 생략
	//- Spring 4.3부터 지원
	//- 생성자가 1개일때만 생략 가능(생성자 오버로딩 2개 이상 안되어있을 때에만)
	/*
	private SpringDAO dao;
		
	public SpringService(SpringDAO dao) {
		this.dao = dao;
	}
	*/
	
	//5. Lombok + Setter
	/*
	@Setter(onMethod_ = @Autowired)
	private SpringDAO dao;
	*/
	
	//6. Lombok + 생성자
	private final SpringDAO dao;
	private int num;
	private String text;

	
	
	public String work() {
		//기존 방식
		//SpringDAO dao = new SpringDAO();
		
		String data = dao.work();
		
		return data;
	}

}
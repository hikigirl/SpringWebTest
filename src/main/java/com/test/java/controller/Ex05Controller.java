package com.test.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping(value="/ex05.do")
public class Ex05Controller {
	//dao를 여기서 선언해서 공동으로 사용하는 것도 가능
//	
//	@RequestMapping(value="/ex05.do", method = RequestMethod.GET)
//	public String ex05() {
//		//db작업 -> dao
//		
//		return "ex05";
//	}
//	@RequestMapping(value="/ex05get.do", method = RequestMethod.GET)
//	public String ex05get() {
//		//db작업 -> dao
//		return "ex05get";
//	}
//	
//	@RequestMapping(value="/ex05post.do", method = RequestMethod.POST)
//	public String ex05post() {
//		return "ex05post";
//	}
	
	/* 
		조금 더 생략 가능
	*/
	@GetMapping(value="/ex05.do")
	public String ex05() {
		return "ex05";
	}
	
	@GetMapping("/ex05get.do")
	public String ex05get() {
		return "ex05get";
	}
	
	@PostMapping("/ex05post.do")
	public String ex05post() {
		return "ex05post";
	}
	
//	java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'ex05Controller' method
//	
//	@RequestMapping
//	public String ex05get() {
//		return "ex05get";
//	}
	
}

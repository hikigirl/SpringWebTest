package com.test.java.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//컨트롤러 구현
//1. Controler 인터페이스 구현
//2. @Controller 어노테이션 사용 -> 지금 해볼 방식
@Controller
@RequestMapping(value="/ex03.do")
public class Ex03Controller {
	//doGet(), doPost(), handleRequest() => 예약 메서드
	// 요청 메서드 역할을 할 메서드에 @RequestMapping 어노테이션을 붙임
	
//	@RequestMapping
//	public ModelAndView test() {
//		//페이지 만드는 작업
//		ModelAndView mv = new ModelAndView("ex03");
//		return mv;
//	}
	
	@RequestMapping
	public String test(HttpServletRequest req) {
		String name = "강아지";
		req.setAttribute("name", name);
		
		return "ex03";
	}
	
}

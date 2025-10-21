package com.test.java.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//스프링 -> 서블릿 대신 일반 클래스 사용
//이전의 서블릿 역할(컨트롤러)
//컨트롤러란? 전체적인 업무 흐름을 통제 & 클라이언트 요청 처리

// 가상 주소를 만들기 위해 스프링 빈으로 만든다
// 
public class Ex01Controller implements Controller {
	//요청 메서드(doGet(), doPost()) == handleRequest()
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//업무 진행...
		
		//Servlet에서는
		//RequestDispatcher -> forward(req, resp) -> JSP 호출
		
		//ModelAndView 클래스
		// 1. Model 역할(데이터 전송 상자, request 역할)
		// 2. View 역할(JSP)
		
		String name = "아무개";
//		request.setAttribute("name", name);
		
		ModelAndView mv = new ModelAndView();
		
		//mv.setViewName("JSP 경로 작성");
		// 파일 [/WEB-INF/views/WEB-INF/views/ex01.jsp.jsp]을(를) 찾을 수 없습니다.
		//mv.setViewName("/WEB-INF/views/ex01.jsp"); 
		
		mv.setViewName("ex01");
		mv.addObject("name", name);
		
		return mv;
	}
	
}

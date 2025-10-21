package com.test.java.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.test.java.model.SpringDAO;

public class Ex02Controller implements Controller {
	
	//1. 
	private SpringDAO dao;
	
	//2. 의존 주입 도구 생성(생성자 or setter)
	public Ex02Controller(SpringDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//생성자 오버로딩 되어있음 - ModelAndView(String ViewName);
		
		//DB작업했다고 가정
		
		//Ex02Controller <- 관계 -> SpringDAO
		//SpringDAO dao = new SpringDAO();
		
		
		int count = dao.count();	
		
		ModelAndView mv = new ModelAndView("ex02");
		
		mv.addObject("count", count);
		
		
		return mv;
	}

}

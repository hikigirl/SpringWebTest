package com.test.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.java.service.SpringService;

import lombok.RequiredArgsConstructor;

@Controller @RequiredArgsConstructor
public class Ex08Controller {
	
	//의존 주입 도구 세팅
	private final SpringService service;
	
//	@Autowired
//	public Ex08Controller(SpringService service) {
//		this.service = service;
//	}
	
	@GetMapping(value="/ex08.do")
	public String ex08(Model model) {
		
		//Controller -> 의존 -> service -> 의존 -> DAO
		//SpringService service = new SpringService();
		
		String data = service.work();
		
		model.addAttribute("data", data);
		
		return "ex08";
	}
}

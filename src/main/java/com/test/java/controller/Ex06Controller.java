package com.test.java.controller;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.java.model.AddressDTO;
import com.test.java.model.SpringDAO;

@Controller
@RequestMapping(value="/board") //여기에 공통 경로를 적을 수 있음
public class Ex06Controller {
	
	@GetMapping(value="/ex06.do")
	public String ex06() {
		return "ex06";
	}
	/*
	@PostMapping(value="/ex06ok.do")
	public String ex06ok(HttpServletRequest req) {
		//요청 메서드는 스프링 컨테이너가 생성할 수 있는 자원은
		//매개변수를 통해서 전달받을 수 있다. 
		//=> 스프링 컨테이너는 무슨 자원을 생성할 수 있는가?
		
		//필터를 걸어서 사용하자
//		try {
//			req.setCharacterEncoding("UTF-8");
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
		
		System.out.println(req!=null);
		String data = req.getParameter("data");
		req.setAttribute("data", data);
		
		return "ex06ok";
	} 
	*/
	
	/*
	@PostMapping(value="/ex06ok.do")
	public String ex06ok(@RequestParam("data") String data, Model model) {
		//기존 방식 	-> request객체를 통해서...(req.getParameter())
		
		//Spring 방식 	-> annotation, @RequestParam("key")
		//				-> 파라미터 자동 수집 기능
		System.out.println(data);
		model.addAttribute("data", data);
		
		return "ex06ok";
	}
	*/
	
	
	
	/*  
	@PostMapping(value="/ex06ok.do")
	public String ex06ok(@RequestParam("data") String data, Model model) {
		
		int num = Integer.parseInt(data);
		
		model.addAttribute("data", num*2);
		
		return "ex06ok";
	}
	*/
	
	/* 
	@PostMapping(value="/ex06ok.do")
	public String ex06ok(@RequestParam("data") int data, Model model) {
		
		model.addAttribute("data", data*2);
		
		return "ex06ok";
	}
	*/
	
	/*
	@PostMapping(value="/ex06ok.do")
	public String ex06ok(@RequestParam("data") boolean data, Model model) {
		
		//내부적으로 Boolean.parseBoolean(data)
		
		model.addAttribute("data", data? "참" : "거짓");
		
		return "ex06ok";
	}
	*/
	
	/*  
	@PostMapping(value="/ex06ok.do")
	public String ex06ok(@RequestParam(name="data", defaultValue = "기본값") String data, Model model) {
		//defaultValue
		// - 값이 null or "" -> 대신할 값
		
		System.out.println(data.equals(""));
		System.out.println(data == null);
		
		model.addAttribute("data", data);
		
		return "ex06ok";
	}
	*/
	
	/*  
	@PostMapping(value="/ex06ok.do")
	public String ex06ok(@RequestParam(name="data", required=false) String data, Model model) {
		//defaultValue
		// - 값이 null or "" -> 대신할 값
		
		//System.out.println(data.equals(""));
		System.out.println(data == null);
		
		model.addAttribute("data", data);
		
		return "ex06ok";
	}
	*/
	
	/*  
	@PostMapping(value="/ex06ok.do")
	public String ex06ok(String data, Model model) {
		//requestparam annotation을 생략하는 것이 가능
		//단, jsp 상에서의 태그 속성값 name과 매개변수의 이름이 동일해야한다.
		model.addAttribute("data", data);
		
		return "ex06ok";
	}
	*/
	
	/*  
	@PostMapping(value="/ex06ok.do")
	public String ex06ok(Model model, 
			@RequestParam("name") String name, 
			@RequestParam("age") Integer age, 
			@RequestParam("address") String address) {
		
		//model.addAttribute("data", data);
//		model.addAttribute("name", name);
//		model.addAttribute("age", age);
//		model.addAttribute("address", address);
		
		AddressDTO dto = new AddressDTO();
		
		dto.setName(name);
		dto.setAge(age);
		dto.setAddress(address);
		
		SpringDAO dao = new SpringDAO();
		dao.add(dto);
		
		return "ex06ok";
	}
	*/
	
	/*  
	@PostMapping(value="/ex06ok.do")
	public String ex06ok(Model model, String name, Integer age, String address) {
		
		AddressDTO dto = new AddressDTO();
		
		dto.setName(name);
		dto.setAge(age);
		dto.setAddress(address);
		
		SpringDAO dao = new SpringDAO();
		dao.add(dto);
		
		return "ex06ok";
	}
	
	*/
	
	/*  
	@PostMapping(value="/ex06ok.do")
	public String ex06ok(Model model, AddressDTO dto) {
		
		//태그의 name과 DTO의 setter명이 동일 -> 자동 파라미터 수집 가능
		SpringDAO dao = new SpringDAO();
		dao.add(dto);
//		model.addAttribute("dto", dto);
		
		return "ex06ok";
	}
	*/
	
	/*  
	@PostMapping(value="/ex06ok.do")
	public String ex06ok(Model model, AddressDTO dto, String id) {
		
		//태그의 name과 DTO의 setter명이 동일 -> 자동 파라미터 수집 가능
		SpringDAO dao = new SpringDAO();
		dao.add(dto);
		System.out.println(id);
//		model.addAttribute(dto);
//		model.addAttribute("dto", dto);
		
		return "ex06ok";
	}
	
	*/
	
	/*  
	@PostMapping(value="/ex06ok.do")
	public String ex06ok(Model model, 
			@RequestParam("cb") String[] cb) { //annotation 생략 가능
		System.out.println(Arrays.toString(cb));
		
		return "ex06ok";
	}
	*/
	
	/* 
	@PostMapping(value="/ex06ok.do")
	public String ex06ok(Model model, 
			@RequestParam("cb") List<String> cb) { //컬렉션은 annotation 생략 불가능
		//System.out.println(Arrays.toString(cb));
		System.out.println(cb);
		
		
		return "ex06ok";
	}
	 */
	
	@PostMapping(value="/ex06ok.do")
	public String ex06ok(Model model, @ModelAttribute("data") String data) { 
		//model.addAttribute("data", data);
		//@ModelAttribute = getParameter + addAttribute
		return "ex06ok";
	}
	
	
}

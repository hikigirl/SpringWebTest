package com.test.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/ex04.do", method = {RequestMethod.GET, RequestMethod.POST})
public class Ex04Controller {
	@RequestMapping
	public String ex04() {
		return "ex04";
	}
}

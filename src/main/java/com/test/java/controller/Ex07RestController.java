package com.test.java.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.test.java.model.AddressDTO;
import com.test.java.model.Student;

//Ajax 처리용 컨트롤러(json 처리 관련)
//json 전용이므로, jsp를 호출할 수 없음. 
@RestController
public class Ex07RestController {

//	@GetMapping(value="/ex07json.do") 
//	public List<AddressDTO> ex07() {
//	
//		//DB -> select 했다고 가정
//		AddressDTO dto = new AddressDTO();
//		dto.setName("홍길동");
//		dto.setAge(20);
//		dto.setAddress("서울시 강남구 대치동");
//		
//		AddressDTO dto2 = new AddressDTO();
//		dto2.setName("강아지");
//		dto2.setAge(20);
//		dto2.setAddress("서울시 강남구 대치동");
//		
//		AddressDTO dto3 = new AddressDTO();
//		dto3.setName("고양이");
//		dto3.setAge(20);
//		dto3.setAddress("서울시 강남구 대치동");
//		
//		List<AddressDTO> list = new ArrayList<AddressDTO>();
//		list.add(dto3);
//		list.add(dto2);
//		list.add(dto);
//		
//		return list;
//	}
	
//	@GetMapping(value="/ex07json.do") 
//	public Map<String, Integer> ex07() {
//	
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		map.put("kor", 100);
//		map.put("eng", 90);
//		map.put("math", 80);
//		
//		return map;
//	}
	
	@GetMapping(value="/ex07json.do") 
	public Student ex07() {
		
		Student s = new Student();
		
		return s;
	}
	
}

package com.test.java.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.test.java.model.AddressDTO;

@Controller
public class Ex07Controller {

	//요청 메서드의 반환값 종류
/*
	1. String
	- JSP 파일명
	- ViewResolver 호출
*/

//	@GetMapping(value="/ex07.do") 
//	public String ex07() {
//		return "ex07";
//	}
	
/*
	2. void
	- spring 4.3 이후 지원
	- 요청 주소의 이름과 동일한 jsp를 호출한다. 
*/
//	@GetMapping(value="/ex07.do") 
//	public void ex07() {
//		//ex07.jsp를 자동 호출
//	}
	
	
/*
	3. String + 키워드
	- redirect -> resp.sendRedirect() 역할
	- forward  -> pageContext.forward() 역할
*/
//	@GetMapping(value="/ex07.do") 
//	public String ex07() {
//		return "redirect:/board/ex06.do";
//		return "forward:/board/ex06.do";
//	}

/*
	4. String -> 편하니까 익히는거 추천...
	- RedirectAttributes
	- 쿼리스트링을 자동으로 만들어 줌
*/
//	@GetMapping(value="/ex07.do") 
//	public String ex07(RedirectAttributes rttr) {
//		String column = "subject";
//		String word = "java";
//		
//		rttr.addAttribute("column",column);
//		rttr.addAttribute("word",word);
//		
//		//return "redirect:/board/ex06.do?column=subject&word=java";
//		//return "redirect:/board/ex06.do?column="+column+"&word="+word;
//		return "redirect:/board/ex06.do"; 
//		//결과 => http://localhost:8080/java/board/ex06.do?column=subject&word=java
//		
//	}

/*
	5. JSON 반환 -> ajax에서 자주 사용, 스프링에서도 ajax를 자주 사용하는건 마찬가지임
	- @ResponseBody + jackson-databind
	- 요청 메서드의 반환값이 자동으로 json 변환 + 반환
	- 의존성 추가 필요(.jar 추가)
*/
//	@GetMapping(value="/ex07.do") 
//	public @ResponseBody String ex07() {
//		/*
//			{
//				name: "홍길동"
//			}
//		*/
//		
//		String name = "hong";
//		
//		return name;
//	}
	@GetMapping(value="/ex07.do") 
	public @ResponseBody List<AddressDTO> ex07() {
	/*
		{
			name: "홍길동",
			age: 20,
			address: "서울시 강남구 대치동"
		}
	*/
	/*
		[
		  {
		    "name": "홍길동",
		    "age": 20,
		    "address": "서울시 강남구 대치동"
		  },
		  {
		    "name": "홍길동",
		    "age": 20,
		    "address": "서울시 강남구 대치동"
		  },
		  {
		    "name": "홍길동",
		    "age": 20,
		    "address": "서울시 강남구 대치동"
		  }
		]
	*/
		//DB -> select 했다고 가정
		AddressDTO dto = new AddressDTO();
		dto.setName("홍길동");
		dto.setAge(20);
		dto.setAddress("서울시 강남구 대치동");
		
		AddressDTO dto2 = new AddressDTO();
		dto2.setName("강아지");
		dto2.setAge(20);
		dto2.setAddress("서울시 강남구 대치동");
		
		AddressDTO dto3 = new AddressDTO();
		dto3.setName("고양이");
		dto3.setAge(20);
		dto3.setAddress("서울시 강남구 대치동");
		
		List<AddressDTO> list = new ArrayList<AddressDTO>();
		list.add(dto3);
		list.add(dto2);
		list.add(dto);
		
		return list;
	}
	
	
	
}

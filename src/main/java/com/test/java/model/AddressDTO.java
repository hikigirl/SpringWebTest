package com.test.java.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class AddressDTO {
	private String name;
	private Integer age; //wrapper 클래스 사용하는 이유 -> 나이 확보 실패시 null 처리를 위해
	private String address;
}

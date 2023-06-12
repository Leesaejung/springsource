package com.spring.memo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data // get, set, 기본 생성자, toString
public class itemDTO {
	private int no;
	private String name;
	private int price;
}

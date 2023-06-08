package com.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString @Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class MemberAuthDTO {
	private String userid;
	private String auth;
}

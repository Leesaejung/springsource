package com.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;

import com.spring.domain.PersonDTO;

public interface PersonMapper {
	
//	@Insert("insert into person(id,name) values(#{id},#{name})")
//	public int insert(PersonDTO insert);
	
	// interface + XML
	// 메소드명과 XML에 작성한 id명이 일치해야 함
	public int insertPerson(PersonDTO insert);
	public int updatePerson(PersonDTO update);
	public int deletePerson(String id);
	public PersonDTO selectOne(String id);
	public List<PersonDTO> selectAll();
	
}

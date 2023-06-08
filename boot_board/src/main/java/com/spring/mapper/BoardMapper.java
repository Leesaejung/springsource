package com.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.spring.domain.BoardDTO;
import com.spring.domain.Criteria;
// 언제나 항상 mapper.xml과 짝꿍

@Mapper
public interface BoardMapper {

	public List<BoardDTO> list(Criteria cri);
	public int insert(BoardDTO dto);
	public BoardDTO get(int bno);
	public int update(BoardDTO dto);
	public int delete(int bno);
	public int totalCnt(Criteria cri);
	public int updateReplyCnt(@Param("bno")int bno, @Param("amount")int amount);

	// 상세 조회 + 파일 정보
	public BoardDTO readAttach(int bno);
}

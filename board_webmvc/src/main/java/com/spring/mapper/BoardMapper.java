package com.spring.mapper;

import java.util.List;

import com.spring.domain.BoardDTO;
import com.spring.domain.Criteria;
// 언제나 항상 mapper.xml과 짝꿍
public interface BoardMapper {

	public List<BoardDTO> list(Criteria cri);
	public int insert(BoardDTO dto);
	public BoardDTO get(int bno);
	public int update(BoardDTO dto);
	public int delete(int bno);
	public int totalCnt(Criteria cri);

}

package com.spring.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.spring.domain.BookDTO;

// 파라메터는 하나로 넘기는게 편함
// 여러개로 넘길 때는 @Param() 어노테이션 사용해야 함
// Parameter 'price' not found
public interface BookService {
	boolean insertBook(BookDTO insertDto);
	boolean updateBook(int price, int code);
	boolean deleteBook(int code);
	BookDTO getBook(int code);
	List<BookDTO> getBookList();
}

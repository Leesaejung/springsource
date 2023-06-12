package com.spring.memo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.memo.entity.Item;
import java.lang.String;
import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
	
	// findBy + 필드명
	// 상품 이름으로 검색
	
	List<Item> findByItemNm(String itemnm);
	
	// 상품명 or 상품 상세 설명과 일치하는 것
	// findBy + 필드명 + or + 필드명
	List<Item> findByItemNmOrItemDetail(String itemNm, String itemDetail);
	
	// 특정 가격 이하인 상품 조회
	List<Item> findByPriceLessThan(int price);
	
	// 특정 가격보다 이하인 상품을 조회 후 내림차순 정렬
	List<Item> findByPriceLessThanOrderByPriceDesc(int price);
	
}

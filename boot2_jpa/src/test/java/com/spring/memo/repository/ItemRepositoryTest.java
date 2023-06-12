package com.spring.memo.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.memo.entity.Item;
import com.spring.memo.entity.ItemSellStatus;

import lombok.Builder;

@SpringBootTest
public class ItemRepositoryTest {
	
	// ItemRepository 잘 작성되었는지 테스트 : 단위 테스트
	@Autowired
	private ItemRepository respository;
	
/*	
	@Test
	public void itemCreateTest() {

		Item item = new Item();
		item.setItemNm("이어폰");
		item.setPrice(125000);
		item.setStockNumber(40);
		item.setItemDetail("공식인증 사이트 판매처");
		item.setItemSellStatus(ItemSellStatus.SELL);
		item.setRegTime(LocalDateTime.now());
		item.setUpdateTime(LocalDateTime.now());

		// @Builder 사용 시
		item = Item.builder()
					.itemNm("타이타닉 티켓")
					.price(10000)
					.stockNumber(100)
					.itemDetail("선박 티켓")
					.itemSellStatus(ItemSellStatus.SELL)
					.regTime(LocalDateTime.now())
					.updateTime(LocalDateTime.now())
					.build();
		
		Item newItem = respository.save(item);
		System.out.println(newItem);
	
	}		
*/ 
/*
	// 조회
	@Test
	public void getItem() {
		//Optional<Item> item = respository.findById(1L);
		//item.ifPresent(ele -> System.out.println(ele));
		
		respository.findById(1L).ifPresent(ele -> System.out.println(ele));
		
		Item item = respository.findById(4L).orElseThrow(EntityNotFoundException::new);
		System.out.println(item);
	}
*/
/*	
	// 전체 조회
	@Test
	public void getItem() {
		//Optional<Item> item = respository.findById(1L);
		//item.ifPresent(ele -> System.out.println(ele));
		
		List<Item> list = respository.findAll();
		list.forEach(item -> System.out.println(item));
		
	}
*/
/*
	// 상품명 조회 , like 아님 = 임
	@Test
	public void getItem() {
		//List<Item> list = respository.findByItemNm("블루투스 스피커");
		//list.forEach(item -> System.out.println(item));
		
		respository.findByItemNm("블루투스 스피커").forEach(item -> System.out.println(item));
		
	}
*/
/*	
	// 상품명 or 상품 상세 조회
	@Test
	public void getNameOrDetail() {
		List<Item> list = respository.findByItemNmOrItemDetail("블루투스 스피커", "카라티");
		list.forEach(item -> System.out.println(item));
		
		//respository.findByItemNmOrItemDetail("블루투스 스피커", "카라티").forEach(item -> System.out.println(item));
		
	}
*/
/*	
	// 상품명 or 상품 상세 조회
	@Test
	public void getPriceLessThan() {
		//List<Item> list = respository.findByPriceLessThan(15000);
		//list.forEach(item -> System.out.println(item));
		
		respository.findByPriceLessThan(50000).forEach(item -> System.out.println(item));
		
	}
*/		
	
	// 상품명 or 상품 상세 조회
		@Test
		public void getPriceLessThanOrder() {
			//List<Item> list = respository.findByPriceLessThan(15000);
			//list.forEach(item -> System.out.println(item));
			
			respository.findByPriceLessThanOrderByPriceDesc(900000).forEach(item -> System.out.println(item));
			
		}
		
}

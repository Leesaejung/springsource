package com.spring.memo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.memo.entity.Cart;
import com.spring.memo.entity.CartItem;
import com.spring.memo.entity.Item;

@SpringBootTest
public class CartItemRepositoryTest {
	
	@Autowired
	private CartRepository cartRepository;
		
	@Autowired
	private ItemRepository itemRepository;

	@Autowired
	private CartItemRepository repository;
	
	@Test
	public void createCartItem () {
		
		// Cart 번호가 2번이 있어야 하고
		Cart cart = cartRepository.findById(2L).orElseThrow();
		
		// Item 번호가 3번이 있어야 하는 상황이에요
		// Item 아이디가 지금 1,4,5,6 인거 같은데요 ==> 번호가 없으니까 에러
		Item item = itemRepository.findById(4L).orElseThrow();
		
		CartItem cartItem = CartItem.builder()
									.cart(cart)
									.item(item)
									.count(2)
									.build();
		
		CartItem newItem = repository.save(cartItem);
		System.out.println(newItem);
	}
}

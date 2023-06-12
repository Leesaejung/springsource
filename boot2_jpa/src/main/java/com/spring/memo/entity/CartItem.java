package com.spring.memo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CartItem {
	
	@Id
	@Column(name="cart_item_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne		// 아이템은 여러개, 카트는 하나
	@JoinColumn(name="cart_id")
	private Cart cart;
	
	@ManyToOne		// 아이템은 여러개, 카트는 하나
	@JoinColumn(name="item_id")
	private Item item;
	
	private int count; // 상품 갯수
}

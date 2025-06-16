package com.selimhorri.app.business.order.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.selimhorri.app.business.order.service.CartClientService;
import com.selimhorri.app.business.order.model.CartDto;
import com.selimhorri.app.business.order.model.OrderDto;
import com.selimhorri.app.business.order.model.response.CartOrderServiceDtoCollectionResponse;

import java.util.Collections;

@Component
public class CartClientServiceFallback implements CartClientService {

	@Override
	public ResponseEntity<CartOrderServiceDtoCollectionResponse> findAll() {
		return ResponseEntity.ok(new CartOrderServiceDtoCollectionResponse(Collections.emptyList()));
	}

	@Override
	public ResponseEntity<CartDto> findById(String id) {
		return ResponseEntity.status(503).body(null);
	}

	@Override
	public ResponseEntity<CartDto> save(CartDto cartDto) {
		return ResponseEntity.status(503).body(null);
	}

	@Override
	public ResponseEntity<CartDto> update(String id, CartDto cartDto) {
		return ResponseEntity.status(503).body(null);
	}

	@Override
	public ResponseEntity<CartDto> update(CartDto cartDto) {
		return ResponseEntity.status(503).body(null);
	}

	@Override
	public ResponseEntity<Boolean> deleteById(String id) {
		return ResponseEntity.status(503).body(null);
	}
}

package com.selimhorri.app.business.orderItem.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.selimhorri.app.business.orderItem.model.OrderItemDto;
import com.selimhorri.app.business.orderItem.model.OrderItemId;
import com.selimhorri.app.business.orderItem.model.response.OrderItemOrderItemServiceDtoCollectionResponse;

import java.util.Collections;

@Component
public class OrderItemClientServiceFallback implements OrderItemClientService {

    @Override
    public ResponseEntity<OrderItemOrderItemServiceDtoCollectionResponse> findAll() {
        return ResponseEntity.ok(new OrderItemOrderItemServiceDtoCollectionResponse(Collections.emptyList()));
    }

    @Override
    public ResponseEntity<OrderItemDto> save(OrderItemDto orderItemDto) {
        return ResponseEntity.status(503).body(null);
    }

    @Override
    public ResponseEntity<OrderItemDto> update(OrderItemDto orderItemDto) {
        return ResponseEntity.status(503).body(null);
    }

    @Override
    public ResponseEntity<Boolean> deleteById(OrderItemId orderItemId) {
        return ResponseEntity.status(503).build();
    }

    @Override
    public ResponseEntity<Boolean> deleteById(String orderId, String productId) {
        return ResponseEntity.status(503).build();
    }

    @Override
    public ResponseEntity<OrderItemDto> findById(OrderItemId orderItemId) {
        return ResponseEntity.status(503).body(null);
    }

    @Override
    public ResponseEntity<OrderItemDto> findById(String orderId, String productId) {
        return ResponseEntity.status(503).body(null);
    }
}
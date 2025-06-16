package com.selimhorri.app.business.order.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.selimhorri.app.business.order.model.OrderDto;
import com.selimhorri.app.business.order.model.response.OrderOrderServiceDtoCollectionResponse;

import java.util.Collections;

@Component
public class OrderClientServiceFallback implements OrderClientService {
    @Override
    public ResponseEntity<OrderOrderServiceDtoCollectionResponse> findAll() {
        return ResponseEntity.ok(new OrderOrderServiceDtoCollectionResponse(Collections.emptyList()));
    }
    @Override
    public ResponseEntity<OrderDto> findById(String orderId) {
        return ResponseEntity.status(503).body(null);
    }
    @Override
    public ResponseEntity<OrderDto> save(final OrderDto orderDto) {
        return ResponseEntity.status(503).body(null);
    }

    @Override
    public ResponseEntity<Boolean> deleteById(final String orderId) {
        return ResponseEntity.status(503).body(null);
    }

    @Override
    public ResponseEntity<OrderDto> update(final String orderId, final OrderDto orderDto) {
        return ResponseEntity.status(503).body(null);
    }

    @Override
    public ResponseEntity<OrderDto> update(final OrderDto orderDto) {
        return ResponseEntity.status(503).body(null);
    }
}
package com.selimhorri.app.business.product.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.selimhorri.app.business.product.model.CategoryDto;
import com.selimhorri.app.business.product.model.response.CategoryProductServiceCollectionDtoResponse;

import java.util.Collections;

@Component
public class CategoryClientServiceFallback implements CategoryClientService {
    @Override
    public ResponseEntity<CategoryProductServiceCollectionDtoResponse> findAll() {
        return ResponseEntity.ok(new CategoryProductServiceCollectionDtoResponse(Collections.emptyList()));
    }
    @Override
    public ResponseEntity<CategoryDto> findById(String categoryId) {
        return ResponseEntity.status(503).body(null);
    }
    @Override
    public ResponseEntity<CategoryDto> save(CategoryDto categoryDto) {
        return ResponseEntity.status(503).body(null);
    }

    @Override
    public ResponseEntity<Boolean> deleteById(String categoryId) {
        return ResponseEntity.status(503).build();
    }

    @Override
    public ResponseEntity<CategoryDto> update(String categoryId, CategoryDto categoryDto) {
        return ResponseEntity.status(503).body(null);
    }

    @Override
    public ResponseEntity<CategoryDto> update(CategoryDto categoryDto) {
        return ResponseEntity.status(503).body(null);
    }
}
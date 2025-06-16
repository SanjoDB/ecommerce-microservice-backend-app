package com.selimhorri.app.business.product.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.selimhorri.app.business.product.model.ProductDto;
import com.selimhorri.app.business.product.model.response.ProductProductServiceCollectionDtoResponse;

@Component
public class ProductClientServiceFallback implements ProductClientService {

    @Override
    public ResponseEntity<ProductProductServiceCollectionDtoResponse> findAll() {
        return ResponseEntity.ok(new ProductProductServiceCollectionDtoResponse());
    }

    @Override
    public ResponseEntity<ProductDto> findById(String productId) {
        return ResponseEntity.ok(new ProductDto());
    }

    @Override
    public ResponseEntity<ProductDto> save(ProductDto productDto) {
        return ResponseEntity.ok(new ProductDto());
    }

    @Override
    public ResponseEntity<ProductDto> update(ProductDto productDto) {
        return ResponseEntity.ok(new ProductDto());
    }

    @Override
    public ResponseEntity<ProductDto> update(String productId, ProductDto productDto) {
        return ResponseEntity.ok(new ProductDto());
    }

    @Override
    public ResponseEntity<Boolean> deleteById(String productId) {
        return ResponseEntity.ok(Boolean.FALSE);
    }
    
}

package com.selimhorri.app.business.user.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.selimhorri.app.business.user.model.AddressDto;
import com.selimhorri.app.business.user.model.response.AddressUserServiceCollectionDtoResponse;

@Component
public class AddressClientServiceFallback implements AddressClientService {

    @Override
    public ResponseEntity<AddressUserServiceCollectionDtoResponse> findAll() {
        return ResponseEntity.ok(new AddressUserServiceCollectionDtoResponse());
    }

    @Override
    public ResponseEntity<AddressDto> findById(String addressId) {
        return ResponseEntity.ok(new AddressDto());
    }

    @Override
    public ResponseEntity<AddressDto> save(AddressDto addressDto) {
        return ResponseEntity.ok(new AddressDto());
    }

    @Override
    public ResponseEntity<AddressDto> update(AddressDto addressDto) {
        return ResponseEntity.ok(new AddressDto());
    }

    @Override
    public ResponseEntity<AddressDto> update(String addressId, AddressDto addressDto) {
        return ResponseEntity.ok(new AddressDto());
    }

    @Override
    public ResponseEntity<Boolean> deleteById(String addressId) {
        return ResponseEntity.ok(Boolean.FALSE);
    }
    
}

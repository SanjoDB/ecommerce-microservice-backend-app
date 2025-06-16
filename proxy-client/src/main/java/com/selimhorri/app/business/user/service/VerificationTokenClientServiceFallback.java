package com.selimhorri.app.business.user.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.selimhorri.app.business.user.model.VerificationTokenDto;
import com.selimhorri.app.business.user.model.response.VerificationUserTokenServiceCollectionDtoResponse;

@Component
public class VerificationTokenClientServiceFallback implements VerificationTokenClientService {

    @Override
    public ResponseEntity<VerificationUserTokenServiceCollectionDtoResponse> findAll() {
        return ResponseEntity.ok(new VerificationUserTokenServiceCollectionDtoResponse());
    }

    @Override
    public ResponseEntity<VerificationTokenDto> findById(String verificationTokenId) {
        return ResponseEntity.ok(new VerificationTokenDto());
    }

    @Override
    public ResponseEntity<VerificationTokenDto> save(VerificationTokenDto verificationTokenDto) {
        return ResponseEntity.ok(new VerificationTokenDto());
    }

    @Override
    public ResponseEntity<VerificationTokenDto> update(VerificationTokenDto verificationTokenDto) {
        return ResponseEntity.ok(new VerificationTokenDto());
    }

    @Override
    public ResponseEntity<VerificationTokenDto> update(String verificationTokenId, VerificationTokenDto verificationTokenDto) {
        return ResponseEntity.ok(new VerificationTokenDto());
    }

    @Override
    public ResponseEntity<Boolean> deleteById(String verificationTokenId) {
        return ResponseEntity.ok(Boolean.FALSE);
    }
    
}

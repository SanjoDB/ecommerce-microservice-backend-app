package com.selimhorri.app.business.user.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.selimhorri.app.business.user.model.CredentialDto;
import com.selimhorri.app.business.user.model.response.CredentialUserServiceCollectionDtoResponse;

@Component
public class CredentialClientServiceFallback implements CredentialClientService {

    @Override
    public ResponseEntity<CredentialUserServiceCollectionDtoResponse> findAll() {
        return ResponseEntity.ok(new CredentialUserServiceCollectionDtoResponse());
    }

    @Override
    public ResponseEntity<CredentialDto> findById(String credentialId) {
        return ResponseEntity.ok(new CredentialDto());
    }

    @Override
    public ResponseEntity<CredentialDto> findByUsername(String username) {
        return ResponseEntity.ok(new CredentialDto());
    }

    @Override
    public ResponseEntity<CredentialDto> save(CredentialDto credentialDto) {
        return ResponseEntity.ok(new CredentialDto());
    }

    @Override
    public ResponseEntity<CredentialDto> update(CredentialDto credentialDto) {
        return ResponseEntity.ok(new CredentialDto());
    }

    @Override
    public ResponseEntity<CredentialDto> update(String credentialId, CredentialDto credentialDto) {
        return ResponseEntity.ok(new CredentialDto());
    }

    @Override
    public ResponseEntity<Boolean> deleteById(String credentialId) {
        return ResponseEntity.ok(Boolean.FALSE);
    }
    
}

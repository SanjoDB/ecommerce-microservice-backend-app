package com.selimhorri.app.business.user.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import java.util.Collections;

import com.selimhorri.app.business.user.model.UserDto;
import com.selimhorri.app.business.user.model.response.UserUserServiceCollectionDtoResponse;

@Component
public class UserClientServiceFallback implements UserClientService {
    @Override
    public ResponseEntity<UserUserServiceCollectionDtoResponse> findAll() {
        return ResponseEntity.ok(new UserUserServiceCollectionDtoResponse(Collections.emptyList()));
    }
    @Override
    public ResponseEntity<UserDto> findById(String userId) {
        return ResponseEntity.status(503).body(null);
    }
    @Override
    public ResponseEntity<UserDto> save(UserDto userDto) {
        return ResponseEntity.status(503).body(null);
    }
    @Override
    public ResponseEntity<Boolean> deleteById(String userId) {
        return ResponseEntity.status(503).build();
    }
    @Override
    public ResponseEntity<UserDto> update(String userId, UserDto userDto) {
        return ResponseEntity.status(503).body(null);
    }
    @Override
    public ResponseEntity<UserDto> update(UserDto userDto) {
        return ResponseEntity.status(503).body(null);
    }
    @Override
    public ResponseEntity<UserDto> findByUsername(String username) {
        return ResponseEntity.status(503).body(null);
    }
}
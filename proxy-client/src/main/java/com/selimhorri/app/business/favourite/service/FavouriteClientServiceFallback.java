package com.selimhorri.app.business.favourite.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.selimhorri.app.business.favourite.model.FavouriteDto;
import com.selimhorri.app.business.favourite.model.FavouriteId;
import com.selimhorri.app.business.favourite.model.response.FavouriteFavouriteServiceCollectionDtoResponse;

import java.util.Collections;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Component
public class FavouriteClientServiceFallback implements FavouriteClientService {

    @Override
    public ResponseEntity<FavouriteFavouriteServiceCollectionDtoResponse> findAll() {
        return ResponseEntity.ok(new FavouriteFavouriteServiceCollectionDtoResponse());
    }

    @Override
    public ResponseEntity<FavouriteDto> findById(String param1, String param2, String param3) {
        return ResponseEntity.status(503).body(null);
    }

    @Override
    public ResponseEntity<FavouriteDto> findById(FavouriteId favouriteId) {
        return ResponseEntity.status(503).body(null);
    }

    @Override
    public ResponseEntity<FavouriteDto> save(FavouriteDto favouriteDto) {
        return ResponseEntity.status(503).body(null);
    }

    @Override
    public ResponseEntity deleteById(FavouriteId favouriteId) {
        return ResponseEntity.status(503).body(null);
    }

    @Override
    public ResponseEntity deleteById(String param1, String param2, String param3) {
        return ResponseEntity.status(503).body(null);
    }

    @Override
    public ResponseEntity<FavouriteDto> update(FavouriteDto favouriteDto) {
        return ResponseEntity.status(503).body(null);
    }
}
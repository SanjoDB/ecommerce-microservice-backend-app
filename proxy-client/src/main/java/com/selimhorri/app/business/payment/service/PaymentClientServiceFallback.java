package com.selimhorri.app.business.payment.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.selimhorri.app.business.payment.model.PaymentDto;
import com.selimhorri.app.business.payment.model.response.PaymentPaymentServiceDtoCollectionResponse;

import java.util.Collections;

@Component
public class PaymentClientServiceFallback implements PaymentClientService {
    @Override
    public ResponseEntity<PaymentPaymentServiceDtoCollectionResponse> findAll() {
        return ResponseEntity.ok(new PaymentPaymentServiceDtoCollectionResponse(Collections.emptyList()));
    }
    @Override
    public ResponseEntity<PaymentDto> findById(String paymentId) {
        return ResponseEntity.status(503).body(null);
    }
    @Override
    public ResponseEntity<PaymentDto> save(PaymentDto paymentDto) {
        return ResponseEntity.status(503).body(null);
    }

    @Override
    public ResponseEntity<Boolean> deleteById(String paymentId) {
        return ResponseEntity.status(503).build();
    }

    @Override
    public ResponseEntity<PaymentDto> update(PaymentDto paymentDto) {
        return ResponseEntity.status(503).body(null);
    }
}
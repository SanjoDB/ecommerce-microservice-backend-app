package com.selimhorri.app.business.orderItem.service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.selimhorri.app.business.orderItem.model.OrderItemDto;
import com.selimhorri.app.business.orderItem.model.OrderItemId;
import com.selimhorri.app.business.orderItem.model.response.OrderItemOrderItemServiceDtoCollectionResponse;

import io.github.resilience4j.retry.annotation.Retry;

@FeignClient(name = "SHIPPING-SERVICE", 
contextId = "shippingClientService", 
path = "/shipping-service/api/shippings",
fallback = OrderItemClientServiceFallback.class)
@Retry(name = "shippingClientService")
public interface OrderItemClientService {
	
	@GetMapping
	ResponseEntity<OrderItemOrderItemServiceDtoCollectionResponse> findAll();
	
	@GetMapping("/{orderId}/{productId}")
	ResponseEntity<OrderItemDto> findById(
			@PathVariable("orderId") final String orderId, 
			@PathVariable("productId") final String productId);
	
	@GetMapping("/find")
	ResponseEntity<OrderItemDto> findById(
			@RequestBody 
			@NotNull(message = "Input must not be NULL") 
			@Valid final OrderItemId orderItemId);
	
	@PostMapping
	ResponseEntity<OrderItemDto> save(
			@RequestBody 
			@NotNull(message = "Input must not be NULL") 
			@Valid final OrderItemDto orderItemDto);
	
	@PutMapping
	ResponseEntity<OrderItemDto> update(
			@RequestBody 
			@NotNull(message = "Input must not be NULL") 
			@Valid final OrderItemDto orderItemDto);
	
	@DeleteMapping("/{orderId}/{productId}")
	ResponseEntity<Boolean> deleteById(
			@PathVariable("orderId") final String orderId, 
			@PathVariable("productId") final String productId);
	
	@DeleteMapping("/delete")
	ResponseEntity<Boolean> deleteById(
			@RequestBody 
			@NotNull(message = "Input must not be NULL") 
			@Valid final OrderItemId orderItemId);
	
}











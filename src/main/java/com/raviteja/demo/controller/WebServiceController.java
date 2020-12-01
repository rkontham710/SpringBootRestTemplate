package com.raviteja.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WebServiceController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping(value="/products")
	public ResponseEntity<Object> getProductList() {
		return restTemplate.exchange("http://localhost:8080/products", HttpMethod.GET, null, Object.class);
	}
}

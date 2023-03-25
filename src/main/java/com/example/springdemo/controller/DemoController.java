package com.example.springdemo.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.entity.Product;

@RestController
public class DemoController {

	@GetMapping("/")
	public ResponseEntity<Product> first() {
		System.out.println("base path called");
		// creating body
		Product body = new Product(100, "intial_data", "This is first data");

		// creating status
		HttpStatus okStatus = HttpStatus.OK;

		//creating headers
		HttpHeaders headers = new HttpHeaders();
		headers.add("prashant", "CGI");
		headers.add("sneha", "prodapt");

		// Adding all in the ResponseEntity object
		//ResponseEntity<Product> res = new ResponseEntity<Product>(body, headers, okStatus);

		return new ResponseEntity<>(body, okStatus);
	}

	@GetMapping("/product")
	public ResponseEntity<Product> getProduct1() {
		System.out.println("product path called");
		// creating body
		Product body = new Product(200, "Colgate", "A good toothpaste");

		// creating status
		HttpStatus okStatus = HttpStatus.OK;

		//creating headers
		HttpHeaders headers = new HttpHeaders();
		headers.add("prashant", "CGI");
		headers.add("sneha", "prodapt");

		// Adding all in the ResponseEntity object
		//ResponseEntity<Product> res = new ResponseEntity<Product>(body, headers, okStatus);

		return new ResponseEntity<>(body, okStatus);
	}

}

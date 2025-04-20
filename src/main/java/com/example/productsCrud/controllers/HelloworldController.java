package com.example.productsCrud.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/helloWorld")
public class HelloworldController {
	
	@GetMapping
	public ResponseEntity<String> findAll(){
		return ResponseEntity.ok("HelloWorld");
	}

}

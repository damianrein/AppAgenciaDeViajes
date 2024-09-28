package com.AppAgenciaDeViajes.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AppAgenciaDeViajes.entities.City;
import com.AppAgenciaDeViajes.services.CityService;

@RestController
@RequestMapping("/city")
public class CityController {

	private CityService service;

	public CityController(CityService service) {
		this.service = service;
	}
	
	@PostMapping("/")
	public ResponseEntity<?> createCity(@RequestBody City city){
		service.newCity(city);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	
}

package com.AppAgenciaDeViajes.services;

import org.springframework.stereotype.Service;

import com.AppAgenciaDeViajes.entities.City;
import com.AppAgenciaDeViajes.repositories.ICityRepository;

@Service
public class CityService {

	private ICityRepository repo;
	
	
	
	public void newCity(City city) {
		repo.save(city);
	}
}

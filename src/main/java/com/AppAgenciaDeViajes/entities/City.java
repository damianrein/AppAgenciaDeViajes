package com.AppAgenciaDeViajes.entities;

import java.util.Set;

import jakarta.persistence.OneToMany;

public class City {

	private Long id;
	@OneToMany
	private Set<Hotel> hotels;
}

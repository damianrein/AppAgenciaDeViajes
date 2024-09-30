package com.AppAgenciaDeViajes.entities;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Attraction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String direction;
	@ManyToOne
	private City city;
	private LocalTime openingTime;
	private LocalTime closingTime;
	
	public Attraction(Long id, String name, String direction, City city, LocalTime openingTime, LocalTime closingTime) {
		this.id = id;
		this.name = name;
		this.direction = direction;
		this.city = city;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public LocalTime getOpeningTime() {
		return openingTime;
	}
	public void setOpeningTime(LocalTime openingTime) {
		this.openingTime = openingTime;
	}
	public LocalTime getClosingTime() {
		return closingTime;
	}
	public void setClosingTime(LocalTime closingTime) {
		this.closingTime = closingTime;
	}
	public Long getId() {
		return id;
	}
}

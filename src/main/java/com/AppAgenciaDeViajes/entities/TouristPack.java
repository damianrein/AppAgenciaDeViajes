package com.AppAgenciaDeViajes.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class TouristPack {

	private Long id;
	private LocalDateTime departureDate; 
	private LocalDateTime returnDate;
	private short peoples;
	private String hotels;
	private String visits;
	private List<Attraction> attractions;
	private BigDecimal totalAmount;
	private TouristRoute route;
	
	
}

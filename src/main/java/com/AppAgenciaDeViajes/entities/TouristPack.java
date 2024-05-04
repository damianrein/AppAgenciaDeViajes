package com.AppAgenciaDeViajes.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TouristPack {

	private Long id;
	private LocalDateTime departureDate; 
	private LocalDateTime returnDate;
	private short peoples;
	private String hotels;
	private String visits;
	private String attractions;
	private BigDecimal totalAmount;
	private TouristRoute route;
}

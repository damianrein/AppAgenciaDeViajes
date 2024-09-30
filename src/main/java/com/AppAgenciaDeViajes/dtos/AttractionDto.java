package com.AppAgenciaDeViajes.dtos;

import java.time.LocalTime;

import com.AppAgenciaDeViajes.entities.City;

public record AttractionDto(String name, String direction, City city, LocalTime openingTime, LocalTime closingTime) {

}

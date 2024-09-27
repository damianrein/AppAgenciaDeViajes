package com.AppAgenciaDeViajes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AppAgenciaDeViajes.entities.Hotel;

public interface IHotelRepository extends JpaRepository<Hotel, Long>{

}

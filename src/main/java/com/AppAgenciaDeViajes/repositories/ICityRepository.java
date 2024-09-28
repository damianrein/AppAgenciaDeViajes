package com.AppAgenciaDeViajes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AppAgenciaDeViajes.entities.City;

public interface ICityRepository extends JpaRepository<City, Long> {

}

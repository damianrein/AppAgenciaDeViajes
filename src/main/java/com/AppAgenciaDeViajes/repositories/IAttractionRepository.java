package com.AppAgenciaDeViajes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AppAgenciaDeViajes.entities.Attraction;

public interface IAttractionRepository extends JpaRepository<Attraction, Long> {

}

package com.AppAgenciaDeViajes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AppAgenciaDeViajes.entities.TouristPack;

public interface ITouristPackRepository extends JpaRepository<TouristPack, Long>{

}

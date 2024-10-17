package com.AppAgenciaDeViajes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AppAgenciaDeViajes.entities.Client;

public interface IClientRepository extends JpaRepository<Client, Long>{

}

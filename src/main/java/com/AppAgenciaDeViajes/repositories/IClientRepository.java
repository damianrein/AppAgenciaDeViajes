package com.AppAgenciaDeViajes.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AppAgenciaDeViajes.entities.Client;

public interface IClientRepository extends JpaRepository<Client, Long>{

	Optional<Client> findByEmail(String username);
}

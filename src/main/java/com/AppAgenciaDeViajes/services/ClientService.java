package com.AppAgenciaDeViajes.services;

import org.springframework.stereotype.Service;

import com.AppAgenciaDeViajes.repositories.IClientRepository;

@Service
public class ClientService {

	private IClientRepository repo;

	public ClientService(IClientRepository repo) {
		this.repo = repo;
	}
	
	public void deleteClient(Long id) {
		repo.deleteById(id);
	}
	
}

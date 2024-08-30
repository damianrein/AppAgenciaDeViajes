package com.AppAgenciaDeViajes.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class Client {

	private Long id;
	private String name;
	private String lastname;
	private String email;
	private LocalDate birthdate;
}

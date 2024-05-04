package com.AppAgenciaDeViajes.entities;

import com.AppAgenciaDeViajes.enums.Stars;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class Hotel {

	private Long id;
	@Enumerated(EnumType.ORDINAL)
	private Stars star;
}

package com.AppAgenciaDeViajes.dtos;

import java.time.LocalDate;

public record ClientDto(String name, String lastname, String email, String password, Integer dni, LocalDate birthdate) {

}

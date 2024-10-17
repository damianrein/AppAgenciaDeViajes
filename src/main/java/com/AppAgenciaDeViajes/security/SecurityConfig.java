package com.AppAgenciaDeViajes.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

	@Autowired
	private AuthenticationProvider authProvider;
	@Autowired
	private AuthFilter authFilter;
	
	public SecurityConfig(AuthenticationProvider authProvider, AuthFilter authFilter) {
		this.authProvider = authProvider;
		this.authFilter = authFilter;
	}

	public SecurityFilterChain securityFilterChain(HttpSecurity http) {
		return null;
	}
}

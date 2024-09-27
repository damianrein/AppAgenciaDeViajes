package com.AppAgenciaDeViajes.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AppAgenciaDeViajes.services.HotelService;

@RestController
@RequestMapping("/h")
public class HotelController {

	private HotelService service;
}

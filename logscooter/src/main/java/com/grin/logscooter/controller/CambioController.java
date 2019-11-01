package com.grin.logscooter.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grin.logscooter.service.CambioService;

@RestController
//@RequestMapping( "/cambio" )
public class CambioController {

	private CambioService service;
	
	public CambioController(CambioService service) {
		super();
		this.service = service;
	}

	@PostMapping( "/scan/cambio" )	
	public ResponseEntity<?> cambio( @RequestBody Map<String, String> body){
		
		Integer estadoId = Integer.parseInt(body.get("estadoId"));
		Integer userID= Integer.parseInt(body.get("userId"));
		Integer scooterID=Integer.parseInt(body.get("scooterID"));
		ResponseEntity<?> response;
		response = ResponseEntity.ok( service.cambiarEstado(estadoId, userID, scooterID) );
		return response;
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hellow() {
		return "Hello World";
	}
}

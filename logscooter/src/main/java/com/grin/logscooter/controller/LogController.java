package com.grin.logscooter.controller;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grin.logscooter.service.LogService;

@RestController
@RequestMapping( "/logScooter" )
public class LogController {
	
	private LogService service;
	
	public LogController(LogService service) {
		super();
		this.service = service;
	}

	@GetMapping( "/{id}" )
	@Secured( "ROLE_ADMIN" )
	public ResponseEntity<?> showLog( @PathVariable Integer id ){
		ResponseEntity<?> response;
		try{
			response = ResponseEntity.ok( "Log" );
//			response = ResponseEntity.ok( service.get( id ) );
		}
		catch( NoSuchElementException e ) {
			response = ResponseEntity
					.status( HttpStatus.NOT_FOUND )
					.body( e.getMessage() );
		}
		
		return response;
	}
	
	
	@RequestMapping(value="/hello2", method=RequestMethod.GET)
	@Secured( "ROLE_ADMIN" )
	public String hellow2() {
		return "Hello World Log";
	}
}

package com.grin.logscooter.service.impl;

import java.util.Calendar;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.grin.logscooter.entity.Estado;
import com.grin.logscooter.entity.EstadoTransicion;
import com.grin.logscooter.entity.Log;
import com.grin.logscooter.entity.Scooter;
import com.grin.logscooter.entity.User;
import com.grin.logscooter.repository.EstadoRepository;
import com.grin.logscooter.repository.LogRepository;
import com.grin.logscooter.repository.ScooterRepository;
import com.grin.logscooter.service.CambioService;

@Service
@Transactional( readOnly = true )
public class CambioServiceImpl implements CambioService {
	
	private ScooterRepository scooterRepository;
	
	private EstadoRepository estadoRepository;
	
	private LogRepository logRepository;

	
	public CambioServiceImpl(ScooterRepository scooterRepository, EstadoRepository estadoRepository, LogRepository logRepository) {
		super();
		this.scooterRepository=scooterRepository;
		this.estadoRepository=estadoRepository;
		this.logRepository=logRepository;
	}


	@Override
	public String cambiarEstado(Integer estadoId, Integer userID, Integer scooterID) {
		Scooter scooter = existeScooter(scooterID);
		Estado edoActual=new Estado();
		edoActual.setEstadoID(estadoId);
		Estado estadoAnterior=new Estado();
		if (scooter==null) {
			scooter=new Scooter();
			scooter.setScooterID(scooterID);
			Estado estado = new Estado();
			estado.setEstadoID(estadoId);
			scooter.setEstado(estado);
			
			estadoAnterior.setEstadoID(null);
		} else {
			estadoAnterior=scooter.getEstado();
		}
		guardarScooter(scooter);
		EstadoTransicion estadoTransicion=getEdoTransi(estadoAnterior, edoActual); 
		Log log=new Log();
		log.setEstadoTransicion(estadoTransicion);
		log.setFecha(Calendar.getInstance().getTime());
		log.setScooter(scooter);
		User user=new User();
		user.setUserId(userID);
		log.setUser(user);
		guardarLog(log);
		return null;
	}
	

	private Scooter existeScooter(Integer scooterID) {
		return scooterRepository.getOne(scooterID);
	}
	
	private Scooter guardarScooter(Scooter scooter) {
		return scooterRepository.save(scooter);
	}
	
	private Log guardarLog(Log log) {
		return logRepository.save(log);
	}
	
	private EstadoTransicion getEdoTransi(Estado edoAnterior, Estado  edoActual) {
		return null;
	}
	
	

}

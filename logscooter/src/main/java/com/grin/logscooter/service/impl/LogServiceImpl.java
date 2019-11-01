package com.grin.logscooter.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.grin.logscooter.entity.Log;
import com.grin.logscooter.entity.User;
import com.grin.logscooter.repository.LogRepository;
import com.grin.logscooter.service.LogService;

@Service
@Transactional( readOnly = true )
public class LogServiceImpl implements LogService {
	
	private LogRepository repository;
	
	

	public LogServiceImpl(LogRepository repository) {
		super();
		this.repository= repository;
	}



	/**
	 * Obtener log por usuario desde el mas reciente al mas viejo
	 */
	@Override
	public List<Log> get(Integer userID) {
		User user=new User();
		user.setUserId(userID);
		List<Log> logs=repository.findByUserByFechaDesc(user);
		return logs;
	}

}

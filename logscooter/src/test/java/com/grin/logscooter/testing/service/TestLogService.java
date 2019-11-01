package com.grin.logscooter.testing.service;

import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Test;

import com.grin.logscooter.entity.Log;
import com.grin.logscooter.repository.LogRepository;
import com.grin.logscooter.service.LogService;
import com.grin.logscooter.service.impl.LogServiceImpl;

public class TestLogService {
	@Test
	public void testSuccessGet() {
		LogRepository logRepository = mock( LogRepository.class );
		when( logRepository.findById( anyInt() ) )
		.thenReturn( Optional.of( new Log() ) );
		
		LogService service = new LogServiceImpl( logRepository );
		
		
		Iterable<Log> logs = service.get( 1 );
		logs.forEach( l -> {
			assertNotNull( l.getLogId() );
		});
	}
	
	@Test
	public void testErrorGet() {
		
	}
}

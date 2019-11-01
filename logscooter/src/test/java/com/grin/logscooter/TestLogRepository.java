package com.grin.logscooter;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.grin.logscooter.entity.Log;
import com.grin.logscooter.entity.User;
import com.grin.logscooter.repository.LogRepository;

@RunWith( SpringRunner.class )
@DataJpaTest
public class TestLogRepository {
	
	@Autowired
	private TestEntityManager entityManager;
	@Autowired
	private LogRepository logRepository;
	
	@Test
	public void testGet() {
		User user= new User();
		user.setUserId(1);
		
		Iterable<Log> logs = logRepository.findByUserByFechaDesc(user);
		logs.forEach( l -> {
			assertNotNull( l.getLogId() );
		});
	}

}

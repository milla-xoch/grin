package com.grin.logscooter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grin.logscooter.entity.Log;
import com.grin.logscooter.entity.User;

public interface LogRepository extends JpaRepository<Log, Integer> {
	List<Log> findByUserByFechaDesc(User user);
}

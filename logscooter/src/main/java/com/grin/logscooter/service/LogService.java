package com.grin.logscooter.service;

import java.util.List;

import com.grin.logscooter.entity.Log;

public interface LogService {

	public List<Log> get(Integer userID);
}

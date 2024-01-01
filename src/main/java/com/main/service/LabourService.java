package com.main.service;

//LabourService.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Labour;
import com.main.repository.LabourRepository;

@Service
public class LabourService {
	@Autowired
	private LabourRepository labourRepository;

	public void processLabourData(Labour labour) {
		Labour savedLabour = labourRepository.save(labour);

	}

}

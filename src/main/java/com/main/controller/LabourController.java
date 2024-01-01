package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.Labour;
import com.main.service.LabourService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/labour")
public class LabourController {

	private final LabourService labourService;

	@Autowired
	public LabourController(LabourService labourService) {
		this.labourService = labourService;
	}

	@PostMapping("/submit")
	public void submitLabour(@RequestBody Labour labour) {
		labourService.processLabourData(labour);
	}
}

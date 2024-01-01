package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.main.entity.Distributor;
import com.main.service.DistributorService;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000") 

public class DistributorController {

	private final DistributorService distributorService;

	@Autowired
	public DistributorController(DistributorService distributorService) {
		this.distributorService = distributorService;
	}

	@PostMapping("/distributor/submit")
	public ResponseEntity<String> submitDistributor(@RequestBody Distributor distributor) {
	    distributorService.saveDistributor(distributor);
	    return ResponseEntity.ok("Distributor data received successfully.");
	}

}

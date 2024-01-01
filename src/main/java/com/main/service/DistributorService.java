package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.main.entity.Distributor;
import com.main.repository.DistributorRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class DistributorService {

	@Autowired
	private DistributorRepository distributorRepository;

	public Distributor saveDistributor(Distributor distributor) {
		return distributorRepository.save(distributor);
	}

}

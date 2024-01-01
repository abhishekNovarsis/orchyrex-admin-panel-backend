package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.FabricDetail;
import com.main.repository.FabricDetailRepository;

import java.util.List;

@Service
public class FabricDetailService {

	private final FabricDetailRepository fabricDetailRepository;

	@Autowired
	public FabricDetailService(FabricDetailRepository fabricDetailRepository) {
		this.fabricDetailRepository = fabricDetailRepository;
	}

//    public List<FabricDetail> getAllFabricDetails() {
//        return fabricDetailRepository.findAll();
//    }

	public FabricDetail saveFabricDetail(FabricDetail fabricDetail) {
		return fabricDetailRepository.save(fabricDetail);
	}

}

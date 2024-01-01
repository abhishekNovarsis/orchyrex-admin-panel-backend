package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.FinishedProductDetail;
import com.main.repository.FinishedProductDetailRepository;

import java.util.List;

@Service
public class FinishedProductDetailService {

	@Autowired
	private FinishedProductDetailRepository finishedProductDetailRepository;

//	public List<FinishedProductDetail> getAllFinishedProductDetails() {
//		return finishedProductDetailRepository.findAll();
//	}

	public FinishedProductDetail saveFinishedProductDetail(FinishedProductDetail finishedProductDetail) {
		return finishedProductDetailRepository.save(finishedProductDetail);
	}

}

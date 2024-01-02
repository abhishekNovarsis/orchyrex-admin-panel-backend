package com.main.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.main.entity.FinishedProductDetail;

public interface FinishedProductDetailRepository extends MongoRepository<FinishedProductDetail, String> {
    
}

package com.main.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.main.entity.FabricDetail;

public interface FabricDetailRepository extends MongoRepository<FabricDetail, String> {
   
}


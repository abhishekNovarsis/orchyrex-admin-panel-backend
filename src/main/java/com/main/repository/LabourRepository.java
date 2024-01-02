package com.main.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.main.entity.Labour;

public interface LabourRepository extends MongoRepository<Labour, String> {

}

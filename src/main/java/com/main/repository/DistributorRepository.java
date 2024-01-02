package com.main.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.main.entity.Distributor;

public interface DistributorRepository extends MongoRepository<Distributor, String> {

}

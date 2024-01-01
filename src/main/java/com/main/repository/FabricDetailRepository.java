package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.FabricDetail;

public interface FabricDetailRepository extends JpaRepository<FabricDetail, Long> {
   
}


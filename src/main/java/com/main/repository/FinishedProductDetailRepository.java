package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.FinishedProductDetail;

public interface FinishedProductDetailRepository extends JpaRepository<FinishedProductDetail, Long> {
    
}

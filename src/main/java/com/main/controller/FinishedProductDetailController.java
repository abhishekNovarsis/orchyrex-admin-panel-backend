package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.main.entity.FinishedProductDetail;
import com.main.service.FinishedProductDetailService;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/finished-product-details")
public class FinishedProductDetailController {

    private final FinishedProductDetailService finishedProductDetailService;

    @Autowired
    public FinishedProductDetailController(FinishedProductDetailService finishedProductDetailService) {
        this.finishedProductDetailService = finishedProductDetailService;
    }
    
    @PostMapping
    public FinishedProductDetail saveFinishedProductDetail(@RequestBody FinishedProductDetail finishedProductDetail) {
        return finishedProductDetailService.saveFinishedProductDetail(finishedProductDetail);
    }

//    @GetMapping
//    public List<FinishedProductDetail> getAllFinishedProductDetails() {
//        return finishedProductDetailService.getAllFinishedProductDetails();
//    }

    

    
}


package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.main.entity.FabricDetail;
import com.main.service.FabricDetailService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/fabric-details")
public class FabricDetailController {

	private final FabricDetailService fabricDetailService;

	@Autowired
	public FabricDetailController(FabricDetailService fabricDetailService) {
		this.fabricDetailService = fabricDetailService;
	}

	@PostMapping
	public FabricDetail saveFabricDetail(@RequestBody FabricDetail fabricDetail) {
		return fabricDetailService.saveFabricDetail(fabricDetail);
	}

//    @GetMapping
//    public List<FabricDetail> getAllFabricDetails() {
//        return fabricDetailService.getAllFabricDetails();
//    }

}

package com.anubhavtrainings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anubhavtrainings.businesslogic.vendorOperation;
import com.anubhavtrainings.entities.vendor;

@RestController
public class vendorController {
	
	@Autowired
	vendorOperation vendorRepo;
	
	@RequestMapping("/vendors")
	public List<vendor> getAllVendors(){
		return vendorRepo.getAllVendors();
	}
	
}

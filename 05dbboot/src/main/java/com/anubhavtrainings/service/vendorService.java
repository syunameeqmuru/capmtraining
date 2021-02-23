package com.anubhavtrainings.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anubhavtrainings.entities.Vendor;

@Component
public class vendorService {
	
	@Autowired
	IVendorPersistence vendor;
	
	public List<Vendor> readAllVendors(){
		return vendor.findAll();
	}
	
//	public Vendor getSingleVendorById(String vendorCode) {
//		
//		return (Vendor)vendors.get(vendorCode);
//	}
//	
//	public Vendor changeVendor(Vendor vendor) {
//		return vendor;
//	}
//	
	public Vendor createVendor(Vendor vendorObj) {
		return vendor.save(vendorObj);
	}
	
}

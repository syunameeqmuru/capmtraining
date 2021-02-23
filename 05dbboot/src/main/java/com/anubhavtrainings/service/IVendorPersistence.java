package com.anubhavtrainings.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anubhavtrainings.entities.Vendor;

public interface IVendorPersistence extends JpaRepository<Vendor, Long> {
	
}

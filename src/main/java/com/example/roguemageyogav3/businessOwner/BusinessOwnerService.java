package com.example.roguemageyogav3.businessOwner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessOwnerService {

    BusinessesOwnerRepository businessesOwnerRepository;

    @Autowired
    public BusinessOwnerService(BusinessesOwnerRepository businessesOwnerRepository) {
        this.businessesOwnerRepository = businessesOwnerRepository;
    }

    public List<BusinessesOwner> getAllBusinessOwners() {
        return businessesOwnerRepository.findAll();
    }
}

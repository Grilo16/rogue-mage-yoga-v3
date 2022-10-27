package com.example.roguemageyogav3.businessOwner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "owners")
public class BusinessOwnerController {

    BusinessOwnerService businessOwnerService;

    @Autowired
    public BusinessOwnerController(BusinessOwnerService businessOwnerService) {
        this.businessOwnerService = businessOwnerService;
    }

    @GetMapping
    public List<BusinessesOwner> getAllBusinessOwners(){
        return businessOwnerService.getAllBusinessOwners();
    }
}

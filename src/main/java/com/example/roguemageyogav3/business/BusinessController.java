package com.example.roguemageyogav3.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "businesses")
public class BusinessController {

    BusinessService businessService;

    @Autowired
    public BusinessController(BusinessService businessService) {
        this.businessService = businessService;
    }


    @GetMapping
    public List<Business> getAllBusinesses(){
        return businessService.getAllBusinesses();
    }

    @PostMapping(value = "/{id}")
    public void createNewBusiness(@PathVariable("id") Long id ,@RequestBody Business business){
        businessService.createNewBusiness(id, business);
    }
}

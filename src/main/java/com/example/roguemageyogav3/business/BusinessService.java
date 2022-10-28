package com.example.roguemageyogav3.business;

import com.example.roguemageyogav3.businessOwner.BusinessesOwnerRepository;
import com.example.roguemageyogav3.user.User;
import com.example.roguemageyogav3.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessService {


    UserRepository userRepository;
    BusinessRepository businessRepository;

    BusinessesOwnerRepository businessesOwnerRepository;

    @Autowired
    public BusinessService(UserRepository userRepository, BusinessRepository businessRepository, BusinessesOwnerRepository businessesOwnerRepository) {
        this.userRepository = userRepository;
        this.businessRepository = businessRepository;
        this.businessesOwnerRepository = businessesOwnerRepository;
    }

    public void createNewBusiness(Long userId, Business business){
        User businessOwner = userRepository.findById(userId).get();
        business.getOwners().add(businessOwner);
        businessRepository.save(business);

    }

    public List<Business> getAllBusinesses() {
        return businessRepository.findAll();
    }
}

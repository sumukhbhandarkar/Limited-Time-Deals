package com.example.demo.service;

import com.example.demo.entity.Claim;
import com.example.demo.repo.ClaimRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClaimServiceImpl implements ClaimService{

    @Autowired
    ClaimRepo repo;

    @Override
    public Claim claim(String claimId, String dealId, Integer userId) {
        return repo.save(new Claim(claimId, dealId, userId));
    }
}

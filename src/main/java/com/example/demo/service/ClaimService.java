package com.example.demo.service;

import com.example.demo.entity.Claim;
import org.springframework.stereotype.Service;

@Service
public interface ClaimService {
    public Claim claim(String claimId, String dealId, Integer userId);
}

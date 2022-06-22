package com.example.demo.service;

import com.example.demo.entity.Deal;
import com.example.demo.utils.DealChanges;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DealService {
    public Deal addDeal(String dealId, Integer itemId, Double price, Integer endTime, Integer quantity);
    public void updateDeal(Deal deal, DealChanges changes);
    public void deleteDeal(Deal deal);
    public Deal findDeal(String dealId);
    public List<Deal> getAll();
}

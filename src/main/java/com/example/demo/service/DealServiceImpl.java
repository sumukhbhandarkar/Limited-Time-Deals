package com.example.demo.service;

import com.example.demo.entity.Deal;
import com.example.demo.repo.DealRepo;
import com.example.demo.utils.DealChanges;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//String dealId, Integer itemId, Integer quantity, Double price, Integer endTime

@Service
public class DealServiceImpl implements DealService {

    @Autowired
    DealRepo dealRepo;

    @Override
    public Deal addDeal(String dealId, Integer itemId, Double price, Integer endTime, Integer quantity) {
        return dealRepo.save(new Deal(dealId, itemId, quantity, price, endTime));
    }

    @Override
    public void updateDeal(Deal deal, DealChanges changes) {
        Integer changeQuantity = changes.getChangeQuantity();
        Integer changeEndTime = changes.getChangeEndTime();
        if (changeEndTime != null)
            deal.setEndTime(changeEndTime);
        if (changeQuantity != null && changeQuantity > 0)
            deal.setQuantity(changeQuantity);
    }

    @Override
    public void deleteDeal(Deal deal) {
        dealRepo.delete(deal);
    }

    @Override
    public Deal findDeal(String dealId) {
        return dealRepo.findById(dealId).orElseThrow();
    }

    @Override
    public List<Deal> getAll() {
        return (List<Deal>) dealRepo.findAll();
    }


}

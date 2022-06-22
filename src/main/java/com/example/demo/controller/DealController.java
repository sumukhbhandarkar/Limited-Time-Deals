package com.example.demo.controller;

import com.example.demo.entity.Deal;
import com.example.demo.service.ClaimService;
import com.example.demo.service.ClaimServiceImpl;
import com.example.demo.service.DealService;
import com.example.demo.service.DealServiceImpl;
import com.example.demo.utils.ClaimDealChanges;
import com.example.demo.utils.DealChanges;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//String dealId, Integer itemId, Double price, Integer endTime, Integer quantity

@RestController
public class DealController {

    @Autowired
    DealServiceImpl dealService;

    @Autowired
    ClaimServiceImpl claimService;

    @PostMapping("/addDeal")
    public @ResponseBody ResponseEntity<String> addNewDeal(@RequestBody Deal deal) {
        String dealId = deal.getDealId();
        Integer itemId = deal.getItemId();
        Double price = deal.getPrice();
        Integer endTime = deal.getEndTime();
        Integer quantity = deal.getQuantity();

        dealService.addDeal(dealId, itemId, price, endTime, quantity);

        return new ResponseEntity<String>("Successfully added a new deeal", HttpStatus.OK);
    }

    @PostMapping("/claimDeal")
    public @ResponseBody ResponseEntity<String> claimDeal(@RequestBody ClaimDealChanges changes) {
        String dealId = changes.getDealId();
        Integer userId = changes.getUserId();
//        Deal deal = dealService.findDeal(dealId);
        String claimId = Integer.toString(userId);
        claimService.claim(claimId, dealId, userId);

        return new ResponseEntity<String>("Successfully claimed deal", HttpStatus.OK);

    }

    @PutMapping("/updateDeal{dealId}")
    public @ResponseBody ResponseEntity<String> updateDeal(@RequestBody DealChanges changes, @PathVariable String dealId) {
        Deal deal = dealService.findDeal(dealId);
        dealService.updateDeal(deal, changes);
        return new ResponseEntity<String>("Updated deal success", HttpStatus.OK);
    }

    @DeleteMapping("/deleteDeal{dealId}")
    public void deleteDeal(@PathVariable String dealId) {
        Deal deal = dealService.findDeal(dealId);
        dealService.deleteDeal(deal);
    }

    @GetMapping("/getAllDeals")
    public @ResponseBody ResponseEntity<List<Deal>> getDeals() {
        return new ResponseEntity<List<Deal>>(dealService.getAll(), HttpStatus.OK);
    }

}

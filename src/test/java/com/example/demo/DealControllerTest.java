//package com.example.demo;
//
//import com.example.demo.controller.DealController;
//import com.example.demo.entity.Deal;
//import com.example.demo.repo.DealRepo;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//@WebMvcTest(DealController.class)
//public class DealControllerTest {
//
//    @Autowired
////    MockMvc mockMvc;
//
//    @MockBean
//    DealRepo dealRepo;
//
//
//    Deal deal1 = new Deal("deal1", 1, 200, 25, 100);
//    Deal deal2 = new Deal("deal2", 2, 500, 145, 200);
//
//    @Test
//    public void createDealTest() throws Exception {
//        List<Deal> deals = new ArrayList<>(Arrays.asList(deal1, deal2));
//        Mockito.when(dealRepo.findAll()).thenReturn(deals);
//
//        mockMvc.perform(MockMvcRequestBuilders
//                .get("/getAllDeals")
//                .contentType(MediaType.APPLICATION_JSON));
//    }
//
//    @Test
//    public void updateDeal() throws Exception {
//
//    }
//}

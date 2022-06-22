package com.example.demo.utils;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ClaimDealChanges {
    @JsonProperty("userId")
    private Integer userId;

    @JsonProperty("dealId")
    private String dealId;

}

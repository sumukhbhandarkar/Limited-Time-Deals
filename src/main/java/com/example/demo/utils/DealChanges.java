package com.example.demo.utils;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DealChanges {

    @JsonProperty("changeQuantity")
    private Integer changeQuantity;

    @JsonProperty("changeEndTime")
    private Integer changeEndTime;

}

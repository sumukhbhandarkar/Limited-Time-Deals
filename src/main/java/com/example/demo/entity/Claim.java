package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="claim")
@Data
public class Claim {
    public Claim() {
        super();
    }

    public Claim(String claimId, String dealId, Integer userId) {
        this.claimId = claimId;
        this.dealId = dealId;
        this.userId = userId;
    }

    @Id
    @Column(name = "claimId")
    private String claimId;

    @Column
    private String dealId;

    @Column
    private Integer userId;
}

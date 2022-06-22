package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="deal")
@Data
public class Deal {

    @Id
    @Column(unique = true, nullable = false)
    private String dealId;

    @Column
    private Double price;

    @Column
    private Integer quantity;

    @Column
    private Integer itemId;

    @Column
    private Integer endTime;

    public Deal(String dealId, Integer itemId, Integer quantity, Double price, Integer endTime) {
        super();
        this.itemId = itemId;
        this.dealId = dealId;
        this.quantity = quantity;
        this.endTime = endTime;
        this.price = price;
    }

    public Deal() {
        super();
    }
}

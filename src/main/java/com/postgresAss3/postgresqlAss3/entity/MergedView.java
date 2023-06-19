package com.postgresAss3.postgresqlAss3.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Immutable;

@Entity(name = "v_merge_billing")
@Data
@Immutable
public class MergedView {
    @Id
    private String orderId;
    private String customerId;
    private String customerName;
    private String itemName;
    private int itemPrice;
    private int quantity;
    private int totalPrice;
}
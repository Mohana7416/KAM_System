package com.Udaan.KAM_System.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id",nullable = false)
    private int orderId;
    private LocalDate orderDate;
    private LocalDate deliveredDate;
    private BigDecimal totalAmount;
    private boolean PaymentStatus;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lead_id",referencedColumnName = "lead_id")
    private Lead_Management leadManagement;
}

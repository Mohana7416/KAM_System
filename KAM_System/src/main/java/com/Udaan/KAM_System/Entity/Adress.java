package com.Udaan.KAM_System.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Adress {
    @Id
    @Column(name = "adress_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adressId;
    @Column(name = "street_adress")
    private String streetAdress;
    private String city;
    private String state;
    private String country;
    private long pincode;

}

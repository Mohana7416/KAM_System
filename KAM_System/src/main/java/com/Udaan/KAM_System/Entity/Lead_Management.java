package com.Udaan.KAM_System.Entity;


import com.Udaan.KAM_System.Entity.Enum.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "lead_management")
public class Lead_Management
{
    @Id
    @Column(name = "lead_id",updatable = false,nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int leadId;
    @Column(name = "restaurant_name")
    private String restaurantName;
    @Column(name = "phone_number",nullable = false)
    private long phoneNumber;
    @Column(name = "email",unique = true,nullable = false)
    private String email;
    @Column(unique = true)
    private String website;
    @Enumerated(EnumType.STRING)
    @Column(name = "lead_status")
    private Status leadStatus;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private Address address;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "kam_id",referencedColumnName = "kam_id")
    private KAM kam;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "lead_id",referencedColumnName = "lead_id")
    private List<Orders> orders;



}

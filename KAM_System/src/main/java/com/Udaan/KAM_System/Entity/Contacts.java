package com.Udaan.KAM_System.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id",nullable = false,updatable = false,unique = true)
    private int contactId;
    @Column(name = "first_name",nullable = false)
    private String firstName;
    @Column(name = "last_name",nullable = false)
    private String lastName;
    @Column(name = "role",nullable = false)
    private String role;
    @Column(name = "phone_number",nullable = false,length = 10)
    private long phoneNumber;
    @Column(name = "email",nullable = false)
    private String email;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lead_id",referencedColumnName = "lead_id")
    private Lead_Management leadManagement;
}

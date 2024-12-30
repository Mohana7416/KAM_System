package com.Udaan.KAM_System.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "lead_mangement")
public class Lead_Mangement
{
    @Id
    @Column(name = "lead_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int leadId;
    @Column(name = "restuarant_name")
    private String restuarantName;
    @Column(name = "phone_number")
    private long phoneNumber;
    @Column(name = "email")
    private String email;
    private String website;
    private Adress adress;
//    @Column(name = "assigned_kam_first_name")
//    private String assignedKAMFirstName;
//    @Column(name = "assigned_kam_last_name")
//    private String assignedKAMLastName;


}

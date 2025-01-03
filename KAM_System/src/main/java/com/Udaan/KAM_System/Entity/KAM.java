package com.Udaan.KAM_System.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.lang.reflect.GenericArrayType;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KAM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kam_id")
    private int kamId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;


}

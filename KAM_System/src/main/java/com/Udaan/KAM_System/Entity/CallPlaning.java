package com.Udaan.KAM_System.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CallPlaning {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "call_id")
    private int callId;
    @Column(name = "last_call_date")
    private LocalDate lastCallDate;
    @Column(name = "next_call_date")
    private LocalDate nextCallDate;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "interaction_id",referencedColumnName = "interaction_id")
    private Interaction interaction;

}

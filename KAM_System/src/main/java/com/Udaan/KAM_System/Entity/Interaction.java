package com.Udaan.KAM_System.Entity;


import com.Udaan.KAM_System.Entity.Enum.InteractionStatus;
import com.Udaan.KAM_System.Entity.Enum.InteractionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Interaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "interaction_id")
    private int interactionId;
    @Enumerated(EnumType.STRING)
    private InteractionType interactionType;
    @Enumerated(EnumType.STRING)
    private InteractionStatus interactionStatus;
    @Column(name = "interaction_date")
    private LocalDate interactionDate;
    @Column(name = "interaction_time")
    private LocalTime interactionTime;
    private String notes;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_id",referencedColumnName = "contact_id")
    private Contacts contacts;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lead_id",referencedColumnName = "lead_id")
    private Lead_Management leadManagement;


}

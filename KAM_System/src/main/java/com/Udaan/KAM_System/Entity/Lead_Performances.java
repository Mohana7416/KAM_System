package com.Udaan.KAM_System.Entity;


import com.Udaan.KAM_System.Entity.Enum.LeadPerformancesStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lead_Performances {
    private int leadPerformanceId;
    @Enumerated(EnumType.STRING)
    private LeadPerformancesStatus status;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lead_id",referencedColumnName = "lead_id")
    private Lead_Management leadManagement;

}

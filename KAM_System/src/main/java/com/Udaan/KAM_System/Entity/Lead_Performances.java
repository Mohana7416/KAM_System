package com.Udaan.KAM_System.Entity;


import com.Udaan.KAM_System.Entity.Enum.LeadPerformancesStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lead_Performances {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int leadPerformanceId;
    @Enumerated(EnumType.STRING)
    private LeadPerformancesStatus status;


}

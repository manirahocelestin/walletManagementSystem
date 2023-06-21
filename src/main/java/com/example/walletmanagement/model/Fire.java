package com.example.walletmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "fire")
public class Fire {
    @Id
    private String vehicle_type;
    private String vehicle_usage_type;
    private String codeType; // models.IntegerField(primary_key=True)
    private String iNCENDIE_Less_than_orEqual_5ans;
    private String iNCENDIE_Greater_than_5ansAndLess_orEqual_10ans;
    private String iNCENDIE_Greater_than_10ans;
    private String tOTAL;
}

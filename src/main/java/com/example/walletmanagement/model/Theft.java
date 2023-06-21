package com.example.walletmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Theft {
    @Id
    private String vehicle_type;
    private String vehicle_usage_type;
    private String codeType;
    private String vOL_Less_than_orEqual_5ans;
    private String vOL_Greater_than_5ansAndLess_orEqual_10ans;
    private String vOL_Greater_than_10ans;
}

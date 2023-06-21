package com.example.walletmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ThirdParty {
    @Id
    private String vehicle_type;
    private String vehicle_usage_type;
    private String codeType;
    private String rc_Less_than_orEqual_5ans;
    private String rc_Greater_than_5ansAndLess_orEqual_10ans;
    private String rc_Greater_than_10ans;
}

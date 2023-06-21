package com.example.walletmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "own_damage")
public class OwnDamage {
    @Id
    private String codeType; // models.IntegerField(primary_key=True)
    //private String  CodeType; // models.IntegerField(primary_key=True, null=True, blank=True)
    private String vehicle_type;
    private String vehicle_usage_type;
    private String dM_Less_than_orEqual_5ans;
    private String dM_Greater_than_5ansAndLess_orEqual_10ans;
    private String dM_Greater_than_10ans;

}

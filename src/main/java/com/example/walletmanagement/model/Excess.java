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
@Table(name = "excess")
public class Excess {
    @Id
    private String vehicle_type;
    private String vehicle_usage_type;
    private String codeType;
    private String excessCD;
    private String excess_minLoading;
}

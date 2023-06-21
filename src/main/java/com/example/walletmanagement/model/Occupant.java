package com.example.walletmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "occupant")
public class Occupant {
    @Id
    private String tarifCode; // models.IntegerField(primary_key=True)
    private String tarifOccupant;
    private String primiumRatePerOccupent;
    private String dead_fees;
    private String medical_fees;
}

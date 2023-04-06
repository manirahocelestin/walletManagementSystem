package com.example.walletmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Marital_Status {
    @Id
    private String marital_Status;
    private String marital_Status_Description;
    private String interfaces;
    @ManyToOne(fetch = FetchType.LAZY)
    private CustomerRegistration customerRegistration;
}

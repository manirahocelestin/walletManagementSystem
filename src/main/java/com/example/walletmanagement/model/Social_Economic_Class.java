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
public class Social_Economic_Class {
    @Id
    private String social_Economic_Class;
    private String description;
    private String interfaces;
    @ManyToOne(fetch = FetchType.LAZY)
    private CustomerRegistration customerRegistration;
}

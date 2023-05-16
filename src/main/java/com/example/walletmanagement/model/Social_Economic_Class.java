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
public class Social_Economic_Class {
    @Id
    private String social_Economic_Class;
    private String description;
    private String interfaces;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private CustomerRegistration customerRegistration;
}

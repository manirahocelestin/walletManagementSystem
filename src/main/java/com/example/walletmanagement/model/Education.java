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
public class Education {
    @Id
    private String education_Description;
    private String interfaces;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private CustomerRegistration customerRegistration;
}

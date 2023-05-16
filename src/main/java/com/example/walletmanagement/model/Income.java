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


public class Income {
    @Id
    private String code;
    private String monthly_salary_in_Frw;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private CustomerRegistration customerRegistration;
}

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
public class Occupation {
    @Id
    private String  occupation;
    private String  occupation_Description;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private CustomerRegistration customerRegistration;
}

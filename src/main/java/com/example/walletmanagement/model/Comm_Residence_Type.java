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
public class Comm_Residence_Type {
    @Id
    private String comm_Residence_Type;
    private String description;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerRegistration customerRegistration;
}

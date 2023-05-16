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
public class Relationship_Type {
    @Id
    private String  relationship_Type;
    private String  relationship_Type_Description;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private CustomerRegistration customerRegistration;

}

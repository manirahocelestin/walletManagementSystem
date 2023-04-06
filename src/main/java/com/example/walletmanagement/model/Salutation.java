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
public class Salutation {
    @Id
    private String   salutation;
    private String salutationDescription;
    @ManyToOne(fetch = FetchType.LAZY)
    private CustomerRegistration customerRegistration;
}

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
public class Country {
    @Id

    private String  country;
    private String  country_Description;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerRegistration customerRegistration;

    //------------test-------------------
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Customer customer;

}

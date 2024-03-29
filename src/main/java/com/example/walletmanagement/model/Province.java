package com.example.walletmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Province {
    @Id
    private String  province_List;
    private String province_List_Description;
//    @OneToMany(mappedBy = "province_List",cascade = CascadeType.ALL,orphanRemoval = true)
//    private List<District> districts;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerRegistration customerRegistration;

    //---------------test-----------------------
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Customer customer;



}


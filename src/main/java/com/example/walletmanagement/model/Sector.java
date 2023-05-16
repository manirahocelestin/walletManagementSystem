package com.example.walletmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Sector {
    @Id
    private String  sector_List;
    private String sector_List_Description;
    @ManyToOne
    @JoinColumn(name = "district_list")
    private District    district_List;
    private String district_List_Description;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerRegistration customerRegistration;
//    @OneToMany(mappedBy = "sector_List",cascade = CascadeType.ALL,orphanRemoval = true)
//    private List<Cell> cells;

  

}

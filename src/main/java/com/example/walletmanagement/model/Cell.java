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
public class Cell {
    @Id
    private  String  cell_List;
    private  String cell_List_Description;
    @ManyToOne
   @JoinColumn(name = "sector_list")
    private Sector   sector_List;
    private String sector_List_Description;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerRegistration customerRegistration;
//    @OneToMany(mappedBy = "cell_List",cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Village> villages;

}

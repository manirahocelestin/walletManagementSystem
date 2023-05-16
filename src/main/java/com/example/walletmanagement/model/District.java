package com.example.walletmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.sql.results.graph.Fetch;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class District {
    @Id
    private String district_List;
    private String district_List_Description;
    @ManyToOne
    @JoinColumn(name = "province_list")
    private Province  province_List;
    private String province_List_Description;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerRegistration customerRegistration;
//    @OneToMany(mappedBy = "district_List",cascade = CascadeType.ALL,orphanRemoval = true)
//    private List<Sector> sectors;
    //---------test--------------
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Customer customer;


}

package com.example.walletmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "territorial_cover_limits")
public class Territorial_cover_limits {
    @Id
    private Long id;
    //Location Cover !! attributes titles names are imaginary specified
    private String territory;
    private String  territory_value;
    private String percentage;


}

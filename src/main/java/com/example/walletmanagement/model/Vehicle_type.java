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
@Table(name = "vehicle_type")
public class Vehicle_type {
  @Id
    private Long  id;
    //vehicle_type is asigned to vehicle classification in excell template

    private String vehicle_classification;
}

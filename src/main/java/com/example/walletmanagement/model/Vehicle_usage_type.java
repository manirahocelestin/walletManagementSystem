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
@Table(name = "vehicle_usage_type")
public class Vehicle_usage_type {
    @Id
    private Long id;
    //#Vehicle_usage_type is asigned to vehicel Class in excell template
    private String vehicel_Class;
}

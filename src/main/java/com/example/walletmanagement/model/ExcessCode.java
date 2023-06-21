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
@Table(name = "excess_code")
public class ExcessCode {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  id;
    private String codeNumber;
    private String codeName;
}

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
@Table(name = "check_payment")

public class CheckoutPayment {

    @Id
    private String id;
    private String paymentNumber;
    private String fullName;
    @Column(unique = true)
    private String plateNumber;
    private String mobileNumber;
    private String paymentAmount;
    private String email;
    private String transactionStatus;
    private String created_at;
    private String updated_at;
}

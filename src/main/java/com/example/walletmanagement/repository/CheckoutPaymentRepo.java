package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.CheckoutPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CheckoutPaymentRepo extends JpaRepository<CheckoutPayment, String> {



}

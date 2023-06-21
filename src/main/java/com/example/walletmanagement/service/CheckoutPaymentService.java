package com.example.walletmanagement.service;

import com.example.walletmanagement.model.CheckoutPayment;

import java.util.List;


public interface CheckoutPaymentService {
    CheckoutPayment savePayment(CheckoutPayment checkoutPayment);
    List<CheckoutPayment> findAllCheckoutPayment();
    List<CheckoutPayment> findById(String  id);
   CheckoutPayment updatePayment(String  id, CheckoutPayment checkoutPayment);
   void deletePayment(String  id);

}

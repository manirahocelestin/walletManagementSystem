package com.example.walletmanagement.service;

import com.example.walletmanagement.model.Customer_Gender;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface CustomerGenderService {
    List<Customer_Gender> findAllCustomerGender();
}

package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Customer_Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Customer_genderRep extends JpaRepository<Customer_Gender,String> {
}

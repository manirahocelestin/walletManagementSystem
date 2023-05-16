package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Customer_Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Customer_statusRepo extends JpaRepository<Customer_Status,String> {
}

package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Marital_Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Marital_statusRepo extends JpaRepository<Marital_Status,String> {
}

package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Legal_Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LegalStatusRepo extends JpaRepository<Legal_Status,String> {
}

package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.ExcessCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExcessCodeRepo extends JpaRepository<ExcessCode,Long> {
}

package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.LoadingFactor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface LoadingFactorRepo extends JpaRepository<LoadingFactor,String> {
}

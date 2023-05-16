package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.IncomeFrequency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeFrequencyRepo extends JpaRepository<IncomeFrequency,String> {
}

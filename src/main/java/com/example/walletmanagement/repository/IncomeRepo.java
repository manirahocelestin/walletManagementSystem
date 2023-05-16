package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeRepo extends JpaRepository<Income,String> {
}

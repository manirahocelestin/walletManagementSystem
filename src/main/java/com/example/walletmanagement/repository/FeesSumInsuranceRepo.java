package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Fees_sumInsured;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FeesSumInsuranceRepo extends JpaRepository<Fees_sumInsured,String> {
}

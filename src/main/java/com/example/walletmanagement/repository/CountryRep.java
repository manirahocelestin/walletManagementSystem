package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CountryRep extends JpaRepository<Country,String> {
}

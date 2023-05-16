package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.NAICS_Code;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Naics_codeRepo extends JpaRepository<NAICS_Code,String> {
}

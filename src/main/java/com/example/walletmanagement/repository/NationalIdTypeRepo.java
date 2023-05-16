package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.National_ID_Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationalIdTypeRepo extends JpaRepository<National_ID_Type,String> {
}

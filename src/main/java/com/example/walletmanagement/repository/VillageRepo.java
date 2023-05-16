package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Village;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VillageRepo extends JpaRepository<Village,String> {
}

package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Territorial_cover_limits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerritorialCoverLimitsRepo extends JpaRepository<Territorial_cover_limits,String> {
}

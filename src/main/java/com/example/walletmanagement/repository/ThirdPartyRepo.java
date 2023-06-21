package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.ThirdParty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ThirdPartyRepo extends JpaRepository<ThirdParty,String> {
}

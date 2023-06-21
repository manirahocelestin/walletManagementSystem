package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.OwnDamage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnDamageRepo extends JpaRepository<OwnDamage,String> {
}

package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Related_Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Related_partyRepo extends JpaRepository<Related_Party,String> {
}

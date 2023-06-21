package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Theft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheftRepo extends JpaRepository<Theft,String> {
}

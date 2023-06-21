package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Fire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FireRepo extends JpaRepository<Fire,String> {
}

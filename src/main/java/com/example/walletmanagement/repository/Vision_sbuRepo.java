package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Vision_SBU;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Vision_sbuRepo extends JpaRepository<Vision_SBU,String> {
}

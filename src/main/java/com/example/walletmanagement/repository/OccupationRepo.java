package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Occupation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OccupationRepo extends JpaRepository<Occupation,String> {
}

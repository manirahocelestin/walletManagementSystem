package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Occupant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OccupantRepo extends JpaRepository<Occupant,String> {
}

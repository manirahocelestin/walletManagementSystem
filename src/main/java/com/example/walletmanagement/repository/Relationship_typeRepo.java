package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Relationship_Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Relationship_typeRepo extends JpaRepository<Relationship_Type,String> {
}

package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Salutation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalutationRepo extends JpaRepository<Salutation,String> {
}

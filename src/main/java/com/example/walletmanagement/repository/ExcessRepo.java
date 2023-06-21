package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Excess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExcessRepo extends JpaRepository<Excess,String> {
}

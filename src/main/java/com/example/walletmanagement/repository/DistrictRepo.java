package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepo extends JpaRepository<District,String> {
}

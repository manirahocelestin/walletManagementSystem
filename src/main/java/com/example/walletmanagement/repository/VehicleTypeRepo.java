package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Vehicle_type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleTypeRepo extends JpaRepository<Vehicle_type,Long> {
}

package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Vehicle_usage_type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface VehicleUsageTypeRepo extends JpaRepository<Vehicle_usage_type,Long> {
}

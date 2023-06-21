package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Vehicle_usage_type;
import com.example.walletmanagement.repository.VehicleUsageTypeRepo;
import com.example.walletmanagement.service.VehicleUsageTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VehicleUsageTypeServiceImpl implements VehicleUsageTypeService {
    @Autowired
    private VehicleUsageTypeRepo usageTypeRepo;
    @Override
    public List<Vehicle_usage_type> findAllVehicleUsageType() {
        return usageTypeRepo.findAll();
    }
}

package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Vehicle_type;
import com.example.walletmanagement.repository.VehicleTypeRepo;
import com.example.walletmanagement.service.VehicleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VehicleTypeServiceImpl implements VehicleTypeService {
    @Autowired
    private VehicleTypeRepo vehicleTypeRepo;
    @Override
    public List<Vehicle_type> findAllVehicleType() {
        return vehicleTypeRepo.findAll();
    }
}

package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.District;
import com.example.walletmanagement.repository.DistrictRepo;
import com.example.walletmanagement.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {
    @Autowired
    private DistrictRepo districtRepo;

    @Override
    public List<District> findAllDistrict() {
        return districtRepo.findAll();
    }
}

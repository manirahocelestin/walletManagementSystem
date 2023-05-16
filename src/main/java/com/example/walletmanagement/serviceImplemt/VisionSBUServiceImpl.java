package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Vision_SBU;
import com.example.walletmanagement.repository.Vision_sbuRepo;
import com.example.walletmanagement.service.VisionSubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisionSBUServiceImpl implements VisionSubService {
    @Autowired
    private Vision_sbuRepo visionSbuRepo;

    @Override
    public List<Vision_SBU> findAllVisionSBU() {
        return visionSbuRepo.findAll();
    }
}

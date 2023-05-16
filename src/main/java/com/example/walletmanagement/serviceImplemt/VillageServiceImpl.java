package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Village;
import com.example.walletmanagement.repository.VillageRepo;
import com.example.walletmanagement.service.VillageService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service


public class VillageServiceImpl implements VillageService {
    @Autowired
    private  VillageRepo villageRepo;
    @Override
    public List<Village> findAllVillage() {
        return villageRepo.findAll();
    }



}

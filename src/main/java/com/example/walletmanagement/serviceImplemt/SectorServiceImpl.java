package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Sector;
import com.example.walletmanagement.repository.SectorRepo;
import com.example.walletmanagement.service.SectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectorServiceImpl  implements SectService{
    @Autowired
    private SectorRepo sectorRepo;

    @Override
    public List<Sector> findALlSector() {
        return sectorRepo.findAll();
    }
}




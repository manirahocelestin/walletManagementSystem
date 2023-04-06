package com.example.walletmanagement.service;

import com.example.walletmanagement.model.Sector;

import java.util.List;

public interface SectorService {
    List<Sector> findAllSector();

    Sector getSectorByName(String sectorName);


}

package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Sector;
import com.example.walletmanagement.repository.SectorRep;
import com.example.walletmanagement.service.SectorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor

public class SectorServiceImpl  implements SectorService {
    private final SectorRep sectorRep;
    @Override
    public List<Sector> findAllSector() {
        return sectorRep.findAll();
    }

    @Override
    public Sector getSectorByName(String sectorCode) {
        return sectorRep.getById(sectorCode);
    }

//    @Override
//    public Sector getSectorByName(String sectorName) {
//        return sectorRep.findBySector_List_Description(sectorName);
//    }



}

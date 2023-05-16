package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Economic_Sub_Sector_Code_ISIC;
import com.example.walletmanagement.repository.Economic_sub_sectorRep;
import com.example.walletmanagement.service.EconomicSubSectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EconomicSubSectorServiceImpl implements EconomicSubSectorService {
    @Autowired
    private Economic_sub_sectorRep economicSubSectorRep;


    @Override
    public List<Economic_Sub_Sector_Code_ISIC> findAllEconomicSubSector() {
        return economicSubSectorRep.findAll();
    }
}

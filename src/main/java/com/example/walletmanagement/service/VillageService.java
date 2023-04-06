package com.example.walletmanagement.service;

import com.example.walletmanagement.model.Village;

import java.util.List;

public interface VillageService {
    List<Village> findAllVillage();

    Village getVillage(String villageName);


}

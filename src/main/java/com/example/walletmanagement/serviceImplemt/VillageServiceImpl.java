package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Village;
import com.example.walletmanagement.repository.VillageRepo;
import com.example.walletmanagement.service.VillageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor

public class VillageServiceImpl implements VillageService {
    private final VillageRepo villageRepo;
    @Override
    public List<Village> findAllVillage() {
        return villageRepo.findAll();
    }

    @Override
    public Village getVillage(String villageCode) {
        return villageRepo.getById(villageCode);
    }

//    @Override
//    public Village getVillage(String villageName) {
//        return villageRepo.findByCell_List_Description(villageName);
//    }


}

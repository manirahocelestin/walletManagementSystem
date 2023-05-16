package com.example.walletmanagement.serviceImplemt;


import com.example.walletmanagement.model.National_ID_Type;
import com.example.walletmanagement.repository.NationalIdTypeRepo;
import com.example.walletmanagement.service.NationIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NationalIdServiceImpl implements NationIdService {
    @Autowired
    private NationalIdTypeRepo nationalIdTypeRepo;

    @Override
    public List<National_ID_Type> findAllNationId() {
        return nationalIdTypeRepo.findAll();
    }
}

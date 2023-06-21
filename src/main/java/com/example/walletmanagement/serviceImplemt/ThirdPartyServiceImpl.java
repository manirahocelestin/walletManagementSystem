package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.ThirdParty;
import com.example.walletmanagement.repository.ThirdPartyRepo;
import com.example.walletmanagement.service.ThirdPartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ThirdPartyServiceImpl implements ThirdPartyService {
    @Autowired
    private ThirdPartyRepo thirdPartyRepo;
    @Override
    public List<ThirdParty> findAllThirdParty() {
        return thirdPartyRepo.findAll();
    }
}

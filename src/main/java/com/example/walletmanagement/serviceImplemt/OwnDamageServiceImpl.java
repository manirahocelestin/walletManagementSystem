package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.OwnDamage;
import com.example.walletmanagement.repository.OwnDamageRepo;
import com.example.walletmanagement.service.OwnDamageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OwnDamageServiceImpl implements OwnDamageService {
    @Autowired
    private OwnDamageRepo ownDamageRepo;
    @Override
    public List<OwnDamage> findAllOwnDamage() {
        return ownDamageRepo.findAll();
    }
}

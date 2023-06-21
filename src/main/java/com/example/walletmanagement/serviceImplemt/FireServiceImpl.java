package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Fire;
import com.example.walletmanagement.repository.FireRepo;
import com.example.walletmanagement.service.FireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FireServiceImpl implements FireService {
    @Autowired
    private FireRepo fireRepo;
    @Override
    public List<Fire> findAllFire() {
        return fireRepo.findAll();
    }
}

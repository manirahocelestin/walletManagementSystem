package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Theft;
import com.example.walletmanagement.repository.TheftRepo;
import com.example.walletmanagement.service.TheftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TheftServiceServiceImpl implements TheftService {
    @Autowired
    private TheftRepo theftRepo;
    @Override
    public List<Theft> findAllTheft() {
        return theftRepo.findAll();
    }
}

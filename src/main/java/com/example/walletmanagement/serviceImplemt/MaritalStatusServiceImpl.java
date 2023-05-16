package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Marital_Status;
import com.example.walletmanagement.repository.Marital_statusRepo;
import com.example.walletmanagement.service.MaritalStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaritalStatusServiceImpl implements MaritalStatusService {
    @Autowired
    private Marital_statusRepo maritalStatusRepo;

    @Override
    public List<Marital_Status> findAllMaritalStatus() {
        return maritalStatusRepo.findAll();
    }
}

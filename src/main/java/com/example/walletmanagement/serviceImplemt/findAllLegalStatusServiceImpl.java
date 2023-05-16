package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Legal_Status;
import com.example.walletmanagement.repository.LegalStatusRepo;

import com.example.walletmanagement.service.LegalStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class findAllLegalStatusServiceImpl implements LegalStatusService {
    @Autowired
    private LegalStatusRepo legalStatusRepo;

    @Override
    public List<Legal_Status> findAllLegalStatus() {
        return legalStatusRepo.findAll();
    }
}

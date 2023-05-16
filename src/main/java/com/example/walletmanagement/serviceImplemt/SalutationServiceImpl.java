package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Salutation;
import com.example.walletmanagement.repository.SalutationRepo;
import com.example.walletmanagement.service.SalutationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalutationServiceImpl implements SalutationService {
    @Autowired
    private SalutationRepo salutationRepo;

    @Override
    public List<Salutation> findAllSalutation() {
        return salutationRepo.findAll();
    }
}

package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Occupation;
import com.example.walletmanagement.repository.OccupationRepo;
import com.example.walletmanagement.service.OccupationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OccupationServiceImpl implements OccupationService {
    @Autowired
    private OccupationRepo occupationRepo;

    @Override
    public List<Occupation> findAllOccupation() {
        return occupationRepo.findAll();
    }
}

package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Occupant;
import com.example.walletmanagement.repository.OccupantRepo;
import com.example.walletmanagement.service.OccupantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OccupantServiceImpl implements OccupantService {
    @Autowired
    private OccupantRepo occupantRepo;
    @Override
    public List<Occupant> findAllOccupant() {
        return occupantRepo.findAll();
    }
}

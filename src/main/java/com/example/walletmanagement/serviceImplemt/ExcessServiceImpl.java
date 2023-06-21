package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Excess;
import com.example.walletmanagement.repository.ExcessRepo;
import com.example.walletmanagement.service.ExcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExcessServiceImpl implements ExcessService {
    @Autowired
    private ExcessRepo excessRepo;
    @Override
    public List<Excess> findAllExcess() {
        return excessRepo.findAll();
    }
}

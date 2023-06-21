package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.LoadingFactor;
import com.example.walletmanagement.repository.LoadingFactorRepo;
import com.example.walletmanagement.service.LoadingFactorService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class LoadingFactorServiceImpl implements LoadingFactorService {
    @Autowired
    private LoadingFactorRepo factorRepo;
    @Override
    public List<LoadingFactor> findAllLoadingFactor() {
        return factorRepo.findAll();
    }
}

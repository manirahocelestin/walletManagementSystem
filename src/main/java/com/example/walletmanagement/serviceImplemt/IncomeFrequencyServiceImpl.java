package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.IncomeFrequency;
import com.example.walletmanagement.repository.IncomeFrequencyRepo;
import com.example.walletmanagement.service.IncomeFrequencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncomeFrequencyServiceImpl implements IncomeFrequencyService {
    @Autowired
    private IncomeFrequencyRepo incomeFrequencyRepo;

    @Override
    public List<IncomeFrequency> findAllIncomeFrequency() {
        return incomeFrequencyRepo.findAll();
    }
}

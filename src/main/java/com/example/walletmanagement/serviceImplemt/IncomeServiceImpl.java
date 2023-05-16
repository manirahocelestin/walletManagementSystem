package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Income;
import com.example.walletmanagement.repository.IncomeRepo;
import com.example.walletmanagement.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncomeServiceImpl implements IncomeService {
    @Autowired
    private IncomeRepo incomeRepo;

    @Override
    public List<Income> findAllIncome() {
        return incomeRepo.findAll();
    }
}

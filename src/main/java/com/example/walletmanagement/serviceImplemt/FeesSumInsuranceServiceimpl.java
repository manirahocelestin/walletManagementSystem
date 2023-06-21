package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Fees_sumInsured;
import com.example.walletmanagement.repository.FeesSumInsuranceRepo;
import com.example.walletmanagement.service.FeesSumInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FeesSumInsuranceServiceimpl implements FeesSumInsuranceService {
    @Autowired
    private FeesSumInsuranceRepo feesSumInsuranceRepo;
    @Override
    public List<Fees_sumInsured> findAllFeesSumInsurance() {
        return feesSumInsuranceRepo.findAll();
    }
}

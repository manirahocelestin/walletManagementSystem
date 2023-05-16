package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.NAICS_Code;
import com.example.walletmanagement.repository.Naics_codeRepo;
import com.example.walletmanagement.service.NaicsCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NaicsCodeServiceImpl implements NaicsCodeService {
    @Autowired
    private Naics_codeRepo naicsCodeRepo;

    @Override
    public List<NAICS_Code> findAllNaicsCode() {
        return naicsCodeRepo.findAll();
    }
}

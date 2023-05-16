package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Education;
import com.example.walletmanagement.repository.EducationRepo;
import com.example.walletmanagement.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationServiceImpl implements EducationService {
    @Autowired
    private EducationRepo educationRepo;
    @Override
    public List<Education> findAllEducation() {
        return educationRepo.findAll();
    }
}

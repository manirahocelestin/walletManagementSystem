package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Duration;
import com.example.walletmanagement.repository.DurationRepo;
import com.example.walletmanagement.service.DurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class DurationServiceImpl implements DurationService {
    @Autowired
    private DurationRepo durationRepo;
    @Override
    public List<Duration> findAllDuration() {
        return durationRepo.findAll();
    }
}

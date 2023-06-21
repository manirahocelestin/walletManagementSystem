package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Territorial_cover_limits;
import com.example.walletmanagement.repository.TerritorialCoverLimitsRepo;
import com.example.walletmanagement.service.TerritorialCoverLimitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TerritorialCoverLimitsServiceImpl  implements TerritorialCoverLimitsService {
    @Autowired
    private TerritorialCoverLimitsRepo coverLimitsRepo;
    @Override
    public List<Territorial_cover_limits> findAllTerritorialCover() {
        return coverLimitsRepo.findAll();
    }
}

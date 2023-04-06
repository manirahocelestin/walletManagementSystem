package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Province;
import com.example.walletmanagement.repository.ProvinceRepo;
import com.example.walletmanagement.service.ProvinceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProvinceServiceImpl implements ProvinceService {
    private final ProvinceRepo provinceRepo;

    @Override
    public List<Province> getAllProvince() {
        return provinceRepo.findAll();
    }
}

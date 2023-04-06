package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.District;
import com.example.walletmanagement.repository.DistrictRep;
import com.example.walletmanagement.service.DistrictService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class DistrictServiceImpl implements DistrictService {
    @Autowired
    private  DistrictRep districtRep;

    @Override
    public List<District> findAllDistrict() {
        return districtRep.findAll();
    }

    @Override
    public District getById(String districtCode) {
        return districtRep.getById(districtCode);
    }

//    @Override
//    public District getByName(String districtName) {
//        return districtRep.findByDistrict_List_Description(districtName);
//    }


}

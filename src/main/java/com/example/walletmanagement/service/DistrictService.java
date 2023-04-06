package com.example.walletmanagement.service;

import com.example.walletmanagement.model.District;

import java.util.List;

public interface DistrictService {
    List<District> findAllDistrict();

    District getById(String id);

}

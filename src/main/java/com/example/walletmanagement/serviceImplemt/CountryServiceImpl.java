package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Country;
import com.example.walletmanagement.repository.CountryRepo;
import com.example.walletmanagement.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryRepo countryRepo;


    @Override
    public List<Country> findAllCountry() {
        return countryRepo.findAll();
    }
}

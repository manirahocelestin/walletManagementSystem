//package com.example.walletmanagement.service;
//
//import com.example.walletmanagement.helper.ExcelCountryHelper;
//import com.example.walletmanagement.model.Country;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.ByteArrayInputStream;
//import java.io.IOException;
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class ExcelCountryService {
//    private final CountryRep countryRep;
//
//    public void save(MultipartFile file) {
//        try {
//            List<Country> countries = ExcelCountryHelper.excelCountries(file.getInputStream());
//            countryRep.saveAll(countries);
//
//        } catch (IOException e) {
//            throw new RuntimeException("fail to store excel data: " + e.getMessage());
//        }
//
//    }
//
//    public ByteArrayInputStream load() {
//        List<Country> countries = countryRep.findAll();
//
//        ByteArrayInputStream in = ExcelCountryHelper.countriesToExcel(countries);
//        return in;
//    }
//    public List<Country> getAllCountries(){
//        return countryRep.findAll();
//    }
//
//}
//
//
//
//

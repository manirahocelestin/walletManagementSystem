package com.example.walletmanagement.service;

import com.example.walletmanagement.helper.ExcelHelper;
import com.example.walletmanagement.model.Country;
import com.example.walletmanagement.repository.CountryRep;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.swing.plaf.multi.MultiFileChooserUI;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ExcelService {
    private final CountryRep countryRep;

    public void save(MultipartFile file) {
        try {
            List<Country> countries = ExcelHelper.excelCountries(file.getInputStream());
            countryRep.saveAll(countries);

        } catch (IOException e) {
            throw new RuntimeException("fail to store excel data: " + e.getMessage());
        }

    }

    public ByteArrayInputStream load() {
        List<Country> countries = countryRep.findAll();

        ByteArrayInputStream in = ExcelHelper.countriesToExcel(countries);
        return in;
    }
    public List<Country> getAllCountries(){
        return countryRep.findAll();
    }

}





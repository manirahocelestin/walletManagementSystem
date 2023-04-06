package com.example.walletmanagement.controller;

import com.example.walletmanagement.model.Province;
import com.example.walletmanagement.service.ProvinceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class ProvinceControllerAPI {
    private final ProvinceService provinceService;
    @GetMapping("/All")
    public ResponseEntity<List<Province>> getAllProvince(){
        return new ResponseEntity<>(provinceService.getAllProvince(), HttpStatus.OK);

    }
}

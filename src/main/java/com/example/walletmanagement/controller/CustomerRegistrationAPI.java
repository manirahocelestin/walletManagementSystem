package com.example.walletmanagement.controller;

import com.example.walletmanagement.model.CustomerRegistration;
import com.example.walletmanagement.service.CustomerRegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequiredArgsConstructor


public class CustomerRegistrationAPI {
    @Autowired
    private  CustomerRegistrationService service;

    @PostMapping("/createCustomer")
    public ResponseEntity<CustomerRegistration> createCustomerRegister(@RequestBody CustomerRegistration customerRegistration){
        return new ResponseEntity<>(service.createCustomerRegister(customerRegistration),HttpStatus.OK);
    }
    @GetMapping("/findAll")
    public ResponseEntity<List<CustomerRegistration>> getAllCustomers(){
        return new ResponseEntity<>(service.findAllCustomerRegister(),HttpStatus.OK);
    }


}



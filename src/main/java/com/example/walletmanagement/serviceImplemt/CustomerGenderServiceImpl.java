package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Customer_Gender;
import com.example.walletmanagement.repository.Customer_genderRep;
import com.example.walletmanagement.service.CustomerGenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class CustomerGenderServiceImpl implements CustomerGenderService {
    @Autowired
    private Customer_genderRep customerGenderRep;
    @Override
    public List<Customer_Gender> findAllCustomerGender() {
        return customerGenderRep.findAll();
    }
}

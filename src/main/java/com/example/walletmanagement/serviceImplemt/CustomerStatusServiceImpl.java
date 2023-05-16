package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Customer_Status;
import com.example.walletmanagement.repository.Customer_statusRepo;
import com.example.walletmanagement.service.CustomerStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CustomerStatusServiceImpl implements CustomerStatusService {
    @Autowired
    private Customer_statusRepo customerStatusRepo;

    @Override
    public List<Customer_Status> findAllCustomerStatus() {
        return customerStatusRepo.findAll();
    }
}

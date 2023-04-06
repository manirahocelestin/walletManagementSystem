package com.example.walletmanagement.service;

import com.example.walletmanagement.model.*;

import java.util.List;
import java.util.Set;

public interface CustomerRegistrationService {
    CustomerRegistration createCustomerRegister(CustomerRegistration customer);

    List<CustomerRegistration> findAllCustomerRegister();
    Set<CustomerRegistration> getAllPeopleLivingInProvince (Province province);
    Set<CustomerRegistration> getAllPeopleLivingInDistrict(District district);
    Set<CustomerRegistration> getAllPeopleLivingInSector(Sector sector);
    Set<CustomerRegistration> getAllPeopleLivingInCell(Cell cell);
    Set<CustomerRegistration> getAllPeopleLivingInVillage(Village village);






}

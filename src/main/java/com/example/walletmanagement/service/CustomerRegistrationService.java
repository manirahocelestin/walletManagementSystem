package com.example.walletmanagement.service;

import com.example.walletmanagement.model.*;

import java.util.List;
import java.util.Set;

public interface CustomerRegistrationService {
    CustomerRegistration createCustomerRegister(CustomerRegistration customer);

    List<CustomerRegistration> findAllCustomerRegister();
//    List<CustomerRegistration> getAllPeopleLivingInProvince (Province province);
//    List<CustomerRegistration> getAllPeopleLivingInDistrict(District district);
//    List<CustomerRegistration> getAllPeopleLivingInSector(Sector sector);
//    List<CustomerRegistration> getAllPeopleLivingInCell(Cell cell);
//    List<CustomerRegistration> getAllPeopleLivingInVillage(Village village);






}

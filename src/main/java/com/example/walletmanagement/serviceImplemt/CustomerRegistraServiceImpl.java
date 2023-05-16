package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.*;
import com.example.walletmanagement.repository.CustomerRegisterRepo;
import com.example.walletmanagement.service.CustomerRegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service

public class CustomerRegistraServiceImpl implements CustomerRegistrationService {
    @Autowired
    private  CustomerRegisterRepo customerRegisterRepo;

    @Override
    public CustomerRegistration createCustomerRegister(CustomerRegistration customerRegistration) {
        try {
            return customerRegisterRepo.save(customerRegistration);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<CustomerRegistration> findAllCustomerRegister() {
        return customerRegisterRepo.findAll();
    }

//    @Override
//    public List<CustomerRegistration> getAllPeopleLivingInProvince(Province province) {
//        return customerRegisterRepo.findByProvince(province);
//    }
//
//    @Override
//    public List<CustomerRegistration> getAllPeopleLivingInDistrict(District district) {
//        return customerRegisterRepo.findByDistrict(district);
//    }
//
//    @Override
//    public List<CustomerRegistration> getAllPeopleLivingInSector(Sector sector) {
//        return customerRegisterRepo.findBySector(sector);
//    }
//
//    @Override
//    public List<CustomerRegistration> getAllPeopleLivingInCell(Cell cell) {
//        return customerRegisterRepo.findByCell(cell);
//    }
//
//    @Override
//    public List<CustomerRegistration> getAllPeopleLivingInVillage(Village village) {
//        return customerRegisterRepo.findByVillage(village);
//    }
//
////    @Override
////    public CustomerRegistration getCustomerRegisterById(String id) {
////        return customerRegisterRepo.findByCustomer_ID(id);
////    }
////
////    @Override
////    public List<CustomerRegistration> findCustomerByProvince(String provinceName) {
////        return customerRegisterRepo.findByProvince(provinceName);
////    }
////
////    @Override
////    public List<CustomerRegistration> findCustomerByDistrict(String districtName) {
////        return customerRegisterRepo.findByDistrict(districtName);
////    }
////
////    @Override
////    public List<CustomerRegistration> findCustomerByCell(String cellName) {
////        return customerRegisterRepo.findByCell(cellName);
////    }
////
////    @Override
////    public List<CustomerRegistration> findCustomerByVillage(String villageName) {
////        return customerRegisterRepo.findByVillage(villageName);
////    }
//
////    @Override
////    public CustomerRegistration updateCustomerRegister(String id, CustomerRegistration registration) {
////        CustomerRegistration custRegister = customerRegisterRepo.findByCustomer_ID(id);
////        custRegister.setCustomer_Acronym(registration.getCustomer_Acronym());
////        custRegister.setCustomer_Gender(registration.getCustomer_Gender());
////        custRegister.setCustomer_Name(registration.getCustomer_Name());
////        custRegister.setCell(registration.getCell());
////        custRegister.setCustomer_Status(registration.getCustomer_Status());
////        custRegister.setCustomer_TIN(registration.getCustomer_TIN());
////        custRegister.setComm_Address_2(registration.getComm_Address_2());
////        custRegister.setComm_Address_village(registration.getComm_Address_village());
////        custRegister.setComm_Country(registration.getComm_Country());
////        custRegister.setComm_Residence_Type(registration.getComm_Residence_Type());
////        custRegister.setCustomer_Open_Date(registration.getCustomer_Open_Date());
////        custRegister.setDate_Last_Modified(registration.getDate_Last_Modified());
////        custRegister.setDate_of_Birth(registration.getDate_of_Birth());
////        custRegister.setDistrict(registration.getDistrict());
////        custRegister.setCustomerType(registration.getCustomerType());
////        custRegister.setEconomic_Sub_Sector_Code_ISIC(registration.getEconomic_Sub_Sector_Code_ISIC());
////        custRegister.setEducation(registration.getEducation());
////        custRegister.setEmp_Address_1(registration.getEmp_Address_1());
////        custRegister.setEmail_ID(registration.getEmail_ID());
////        custRegister.setEmp_province(registration.getEmp_province());
////        custRegister.setSector(registration.getSector());
////        custRegister.setEmp_Village(registration.getEmp_Village());
////        custRegister.setEmployee_ID(registration.getEmployee_ID());
////        custRegister.setEmployer_Name(registration.getEmployer_Name());
////        custRegister.setFax_Number_1(registration.getFax_Number_1());
////        custRegister.setForename_1(registration.getForename_1());
////        custRegister.setForename_2(registration.getForename_2());
////        custRegister.setFax_Number_2(registration.getFax_Number_2());
////        custRegister.setHealth_Insurance_Number(registration.getHealth_Insurance_Number());
////        custRegister.setIncome(registration.getIncome());
////        custRegister.setIncome_Frequency(registration.getIncome_Frequency());
////        custRegister.setLE_Book(registration.getLE_Book());
////        custRegister.setMarital_Status(registration.getMarital_Status());
////        custRegister.setNational_ID_Number(custRegister.getCustomer_ID());
////        custRegister.setNAICS_Code(registration.getNAICS_Code());
////        custRegister.setLE_Book(registration.getLE_Book());
////        custRegister.setNext_of_kin_ID_Number(registration.getNext_of_kin_ID_Number());
////        custRegister.setNext_of_kin_Name(registration.getNext_of_kin_Name());
////        custRegister.setNext_of_kin_Telephone(registration.getNext_of_kin_Telephone());
////        custRegister.setNumber_Of_Dependants(registration.getNumber_Of_Dependants());
////        custRegister.setRelated_Party_Name(registration.getRelated_Party_Name());
////        custRegister.setRelated_Party(registration.getRelated_Party());
////        return customerRegisterRepo.save(custRegister);
////    }
//
////    @Override
////    public void deleteCustomerRegister(String id) {
////        customerRegisterRepo.delete(id);
////
////    }
}

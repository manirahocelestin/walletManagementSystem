package com.example.walletmanagement.controller;

import com.example.walletmanagement.model.*;
import com.example.walletmanagement.service.CustomerRegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class CustomerRegistraUI {
    private CustomerRegistrationService registrationService;

    @PostMapping("/customerRegister")
    public String createCustomer(Model model) {
        model.addAttribute("customer", new CustomerRegistration());
        model.addAttribute("cell",new Cell());
        model.addAttribute("comm_Resident_type", new Comm_Residence_Type());
        model.addAttribute("country", new Country());
        model.addAttribute("customer_gender", new Customer_Gender());
        model.addAttribute("customer_status", new Customer_Status());
        model.addAttribute("customer_type", new Customer_Type());
        model.addAttribute("district", new District());
        model.addAttribute("economic_sub_sector_code_ISIC", new Economic_Sub_Sector_Code_ISIC());
        model.addAttribute("education", new Education());
        model.addAttribute("income", new Income());
        model.addAttribute("incomeFrequency", new IncomeFrequency());
        model.addAttribute("legal_status",new Legal_Status());
        model.addAttribute("marital_status",new Marital_Status());
        model.addAttribute("naics_code", new NAICS_Code());
        model.addAttribute("national_id", new National_ID_Type());
        model.addAttribute("occupation",new Occupation());
        model.addAttribute("province", new Province());
        model.addAttribute("related_party", new Related_Party());
        model.addAttribute("Salutation", new Salutation());
        model.addAttribute("sector",new Sector());
        model.addAttribute("social_economic_class", new Social_Economic_Class());
        model.addAttribute("vision_sbu", new Vision_SBU());
        return "registrationForm";


    }


}
/*
  @RequestMapping("/userRegistration")
    // /userRegistration: API : application programming  Interface / API should test in postman and swagger
    public String createUserRegistration(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("ETitleType", TitleType.values());
       // return "user/newUserRegistration";
        return "registration";
 */

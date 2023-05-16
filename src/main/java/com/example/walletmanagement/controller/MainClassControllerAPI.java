package com.example.walletmanagement.controller;

import com.example.walletmanagement.model.*;

import com.example.walletmanagement.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin

public class MainClassControllerAPI {


    @Autowired
    private DistrictService districtService;
    @Autowired
    private ProvinceService provinceService;
    @Autowired
    private SectService sectService;
    @Autowired
    private CellService cellService;
    @Autowired
    private CommonResidecyTypeService commonResidecyTypeService;
    @Autowired
    private CustomerGenderService customerGenderService;
    @Autowired
    private VillageService villageService;
    @Autowired
    private CountryService countryService;
    @Autowired
    private CustomerStatusService customerStatusService;
    @Autowired
    private EconomicSubSectorService economicSubSectorService;
    @Autowired
    private SalutationService salutationService;
    @Autowired
    private EducationService educationService;
    @Autowired
    private IncomeFrequencyService incomeFrequencyService;
    @Autowired
    private IncomeService incomeService;
    @Autowired
    private LegalStatusService legalStatusService;
    @Autowired
    private MaritalStatusService maritalStatusService;
    @Autowired
    private NaicsCodeService naicsCodeService;
    @Autowired
    private NationIdService nationIdService;
    @Autowired
    private OccupationService occupationService;
    @Autowired
    private RelatedPartyService relatedPartyService;
    @Autowired
    private RelationshipTypeService relationshipTypeService;
    @Autowired
    private VisionSubService visionSubService;
    @Autowired
    private SocialEconomicClassService socialEconomicClassService;



    @GetMapping("/findCell")
    public ResponseEntity<List<Cell>> findCell(){
        return new ResponseEntity<>(cellService.findAllCell(),HttpStatus.OK);

    }
    @GetMapping("/findCommonResidencyType")
    public ResponseEntity<List<Comm_Residence_Type>> findCommonResident(){
        return new ResponseEntity<>(commonResidecyTypeService.findAllCommResidentType(),HttpStatus.OK);

    }
    @GetMapping("/findCountry")
    public ResponseEntity<List<Country>> findCountry(){
        return new ResponseEntity<>(countryService.findAllCountry(),HttpStatus.OK);

    }
    @GetMapping("/findCustomerGender")
    public ResponseEntity<List<Customer_Gender>> findCustomerGender(){
        return new ResponseEntity<>(customerGenderService.findAllCustomerGender(),HttpStatus.OK);

    }
    @GetMapping("/findCustomerStatus")
    public ResponseEntity<List<Customer_Status>> findCustomerStatus(){
        return new ResponseEntity<>(customerStatusService.findAllCustomerStatus(),HttpStatus.OK);

    }

    @GetMapping("/findDistrict")
    public ResponseEntity<List<District>> findDistrict(){
        return new ResponseEntity<>(districtService.findAllDistrict(),HttpStatus.OK);

    }
    @GetMapping("/findProvince")
    public ResponseEntity<List<Province>> findProvince(){
        return new ResponseEntity<>(provinceService.getAllProvince(),HttpStatus.OK);
    }

    @GetMapping("/findSector")
    public ResponseEntity<List<Sector>> findSector(){
        return new ResponseEntity<>(sectService.findALlSector(),HttpStatus.OK);
    }

    @GetMapping("/findVillage")
    public ResponseEntity<List<Village>> findVillage(){
        return new ResponseEntity<>(villageService.findAllVillage(),HttpStatus.OK);

    }
    @GetMapping("/findEconomicSubSector")
    public ResponseEntity<List<Economic_Sub_Sector_Code_ISIC>> findEconomicSub(){
        return new ResponseEntity<>(economicSubSectorService.findAllEconomicSubSector(),HttpStatus.OK);

    }
    @GetMapping("/findSalutation")
    public ResponseEntity<List<Salutation>> findSalutations(){
        return new ResponseEntity<>(salutationService.findAllSalutation(),HttpStatus.OK);

    }
    @GetMapping("/findEducation")
    public ResponseEntity<List<Education>> findAllEducation(){
        return new ResponseEntity<>(educationService.findAllEducation(),HttpStatus.OK);
    }
    @GetMapping("/findIncomeFrequency")
    public ResponseEntity<List<IncomeFrequency>> findAllIncomeFrequency(){
        return new ResponseEntity<>(incomeFrequencyService.findAllIncomeFrequency(),HttpStatus.OK);
    }
    @GetMapping("/findIncome")
    public ResponseEntity<List<Income>> findAllIncome(){
        return new ResponseEntity<>(incomeService.findAllIncome(),HttpStatus.OK);
    }
    @GetMapping("/findLegalStatus")
    public ResponseEntity<List<Legal_Status>> findAllLegalStatus(){
        return new ResponseEntity<>(legalStatusService.findAllLegalStatus(),HttpStatus.OK);
    }
    @GetMapping("/findMaritalStatus")
    public ResponseEntity<List<Marital_Status>> findAllMaritalStatus(){
        return new ResponseEntity<>(maritalStatusService.findAllMaritalStatus(),HttpStatus.OK);
    }
    @GetMapping("/findNaicsCode")
    public ResponseEntity<List<NAICS_Code>> findAllNaicsCode(){
        return new ResponseEntity<>(naicsCodeService.findAllNaicsCode(),HttpStatus.OK);
    }
    @GetMapping("/findNationalId")
    public ResponseEntity<List<National_ID_Type>> findAllNationalId(){
        return new ResponseEntity<>(nationIdService.findAllNationId(),HttpStatus.OK);
    }
    @GetMapping("/findOccupation")
    public ResponseEntity<List<Occupation>> findAllOccupation(){
        return new ResponseEntity<>(occupationService.findAllOccupation(),HttpStatus.OK);
    }
    @GetMapping("/findRelatedParty")
    public ResponseEntity<List<Related_Party>> findAllRalatedParty(){
        return new ResponseEntity<>(relatedPartyService.findAllRelatedParty(),HttpStatus.OK);
    }
    @GetMapping("/findRelationship")
    public ResponseEntity<List<Relationship_Type>> findAllRalationship(){
        return new ResponseEntity<>(relationshipTypeService.findAllRelationshipType(),HttpStatus.OK);
    }
    @GetMapping("/findVisionSbu")
    public ResponseEntity<List<Vision_SBU>> findAllVisionSBU(){
        return new ResponseEntity<>(visionSubService.findAllVisionSBU(),HttpStatus.OK);
    }
    @GetMapping("/findSocialEconomic")
    public ResponseEntity<List<Social_Economic_Class>> findALlSocialEconomicClass(){
        return new ResponseEntity<>(socialEconomicClassService.findAllSocialEconomic(),HttpStatus.OK);
    }









}

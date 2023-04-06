package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DistrictRep extends JpaRepository<District, String> {
    //District findByDistrict_List_Description(String district_List_Description);
   // District findByDistrict_List(String district_List);

}

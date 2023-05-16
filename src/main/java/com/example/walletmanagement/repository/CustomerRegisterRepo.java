package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository

public interface CustomerRegisterRepo extends JpaRepository<CustomerRegistration, String> {

    List<CustomerRegistration> findByDistrict(District district);

//    List<CustomerRegistration> findByProvince(Province province);
//
//    List<CustomerRegistration> findBySector(Sector sector);
//
//    List<CustomerRegistration> findByCell(Cell cell);
//
//    Page<CustomerRegistration> findByProvince(Province province, Pageable pageable);
//
//    Page<CustomerRegistration> findByDistrict(District district, Pageable pageable);
//
//    Page<CustomerRegistration> findBySector(Sector sector, Pageable pageable);
//
//    Page<CustomerRegistration> findByCell(Cell cell, Pageable pageable);
//
//    @Query("SELECT c FROM CustomerRegistration c WHERE c.comm_Address_village = :village")
//    List<CustomerRegistration> findByVillage(@Param("village") Village village);


}

package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Economic_Sub_Sector_Code_ISIC;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Economic_sub_sectorRep extends JpaRepository<Economic_Sub_Sector_Code_ISIC,String> {
}

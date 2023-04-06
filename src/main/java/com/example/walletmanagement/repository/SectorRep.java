package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Sector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository


public interface SectorRep extends JpaRepository<Sector,String> {
    //Sector findBySector_List_Description(String sector_List_Description);

}

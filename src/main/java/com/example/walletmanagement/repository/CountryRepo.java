package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Country;
import org.apache.poi.ss.formula.functions.Count;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepo extends JpaRepository<Country,String> {


}

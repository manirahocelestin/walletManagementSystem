package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepo extends JpaRepository<Province,String> {

}

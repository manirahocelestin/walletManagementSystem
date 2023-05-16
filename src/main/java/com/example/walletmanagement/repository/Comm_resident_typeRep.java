package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Comm_Residence_Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Comm_resident_typeRep  extends JpaRepository<Comm_Residence_Type,String> {
}

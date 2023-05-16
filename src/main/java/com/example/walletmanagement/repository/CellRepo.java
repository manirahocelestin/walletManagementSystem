package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Cell;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CellRepo extends JpaRepository<Cell,String> {

}

package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Cell;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CellRepo extends JpaRepository<Cell,String> {
   // Cell findByCell_List_Description(String cell_list_Description);
    //Cell findByCell_List(String Cell_list);
}

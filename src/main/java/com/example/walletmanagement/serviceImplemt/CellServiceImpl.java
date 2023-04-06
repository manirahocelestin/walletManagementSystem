package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Cell;
import com.example.walletmanagement.repository.CellRepo;
import com.example.walletmanagement.service.CellService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor

public class CellServiceImpl implements CellService {
    private final CellRepo cellRepo;
    @Override
    public List<Cell> getAllCell() {
        return cellRepo.findAll();
    }

    @Override
    public Cell findById(String cellCode) {
        return cellRepo.getById(cellCode);
    }

//    @Override
//    public Cell getByName(String cellName) {
//        return cellRepo.findByCell_List_Description(cellName);
//    }


}

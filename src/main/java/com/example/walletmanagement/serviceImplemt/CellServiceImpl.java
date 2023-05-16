package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Cell;
import com.example.walletmanagement.repository.CellRepo;
import com.example.walletmanagement.service.CellService;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service


public class CellServiceImpl implements CellService {
    @Autowired
    private CellRepo cellRepo;


    @Override
    public List<Cell> findAllCell() {
        return cellRepo.findAll();
    }
}

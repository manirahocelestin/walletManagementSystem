package com.example.walletmanagement.service;

import com.example.walletmanagement.model.Cell;

import javax.swing.text.html.Option;
import java.util.List;

public interface CellService {
    List<Cell> getAllCell();
    Cell findById(String id);

   // Cell getByName(String cellName);



}

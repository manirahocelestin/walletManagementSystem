package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Comm_Residence_Type;
import com.example.walletmanagement.repository.Comm_resident_typeRep;
import com.example.walletmanagement.service.CommonResidecyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service

public class CommResidTypServiceImpl implements CommonResidecyTypeService {
    @Autowired
    private Comm_resident_typeRep commResidentTypeRep;

    @Override
    public List<Comm_Residence_Type> findAllCommResidentType() {
        return findAllCommResidentType();
    }
}

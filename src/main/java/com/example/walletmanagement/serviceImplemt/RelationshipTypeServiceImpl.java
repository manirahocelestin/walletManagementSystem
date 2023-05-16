package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Relationship_Type;
import com.example.walletmanagement.repository.Relationship_typeRepo;
import com.example.walletmanagement.service.RelationshipTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelationshipTypeServiceImpl implements RelationshipTypeService {
    @Autowired
    private Relationship_typeRepo relationshipTypeRepo;

    @Override
    public List<Relationship_Type> findAllRelationshipType() {
        return relationshipTypeRepo.findAll();
    }
}

package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Related_Party;
import com.example.walletmanagement.repository.Related_partyRepo;
import com.example.walletmanagement.service.RelatedPartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelatedPartyServiceImpl implements RelatedPartyService {
    @Autowired
    private Related_partyRepo relatedPartyRepo;

    @Override
    public List<Related_Party> findAllRelatedParty() {
        return relatedPartyRepo.findAll();
    }
}

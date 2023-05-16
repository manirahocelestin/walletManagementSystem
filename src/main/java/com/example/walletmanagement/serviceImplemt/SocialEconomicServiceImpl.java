package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.Social_Economic_Class;
import com.example.walletmanagement.repository.Social_economic_classRepo;
import com.example.walletmanagement.service.SocialEconomicClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialEconomicServiceImpl implements SocialEconomicClassService {
    @Autowired
    private Social_economic_classRepo socialEconomicClassRepo;

    @Override
    public List<Social_Economic_Class> findAllSocialEconomic() {
        return socialEconomicClassRepo.findAll();
    }
}

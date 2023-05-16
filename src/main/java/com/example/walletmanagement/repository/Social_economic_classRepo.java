package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Social_Economic_Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Social_economic_classRepo extends JpaRepository<Social_Economic_Class,String> {
}

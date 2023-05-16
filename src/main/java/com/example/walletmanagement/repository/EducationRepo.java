package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepo extends JpaRepository<Education,String> {
}

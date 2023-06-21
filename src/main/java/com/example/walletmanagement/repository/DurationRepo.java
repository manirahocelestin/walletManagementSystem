package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.Duration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DurationRepo extends JpaRepository<Duration,Long> {
}

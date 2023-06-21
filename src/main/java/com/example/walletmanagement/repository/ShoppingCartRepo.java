package com.example.walletmanagement.repository;

import com.example.walletmanagement.model.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public interface ShoppingCartRepo extends JpaRepository<ShoppingCart,String> {
    //Optional<ShoppingCart> findByVehicleBrand(String vehicleBrand );
}

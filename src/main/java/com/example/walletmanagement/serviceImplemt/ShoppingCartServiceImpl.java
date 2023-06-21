package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.ShoppingCart;
import com.example.walletmanagement.repository.ShoppingCartRepo;
import com.example.walletmanagement.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    @Autowired
    private ShoppingCartRepo shoppingCartRepo;

    @Override
    public ShoppingCart createShoppingCart(ShoppingCart shoppingCart) {
        return shoppingCartRepo.save(shoppingCart);
    }

    @Override
    public List<ShoppingCart> findAllShopping() {
        return shoppingCartRepo.findAll();
    }

    @Override
    public List<ShoppingCart> findShoppingCartById(String id) {
        Optional<ShoppingCart> optionShopping = shoppingCartRepo.findById(id);
        return optionShopping.map(Collections::singletonList).orElse(Collections.emptyList());



    }

//    @Override
//    public List<ShoppingCart> findShoppingCartByName(String name) {
//        Optional<ShoppingCart> shoppingCartOptional = shoppingCartRepo.findByVehicleBrand(name);
//        return shoppingCartOptional.map(Collections::singletonList).orElse(Collections.emptyList());
//    }

    @Override
    public ShoppingCart updateShopping(String id, ShoppingCart cart) {
        Optional<ShoppingCart> shoppingCartOptional = shoppingCartRepo.findById(id);
        if (shoppingCartOptional.isPresent()){
            ShoppingCart optionalShoppingCart = shoppingCartOptional.get();
            optionalShoppingCart.setPlateNumber(cart.getPlateNumber());
            optionalShoppingCart.setVehicleType(cart.getVehicleType());
            optionalShoppingCart.setUsageType(cart.getUsageType());
            optionalShoppingCart.setVehicleManufacturedYear(cart.getVehicleManufacturedYear());
            optionalShoppingCart.setVehicleBrand(cart.getVehicleBrand());
            optionalShoppingCart.setVehicleModel(cart.getVehicleModel());
            optionalShoppingCart.setVehiclePlateNumber(cart.getVehiclePlateNumber());
            optionalShoppingCart.setVehicleChassisNumber(cart.getVehicleChassisNumber());
            optionalShoppingCart.setVehicleSeatCapacity(cart.getVehicleSeatCapacity());
            optionalShoppingCart.setDuration(cart.getDuration());
            optionalShoppingCart.setTerritory(cart.getTerritory());
            optionalShoppingCart.setDeclaredValueSumInsured(cart.getDeclaredValueSumInsured());
            optionalShoppingCart.setNumberOfOccupantCovered(cart.getNumberOfOccupantCovered());
            optionalShoppingCart.setSumInsuredPerOccupant(cart.getSumInsuredPerOccupant());
            optionalShoppingCart.setThirdParty(cart.isThirdParty());
            optionalShoppingCart.setOwnDamage(cart.isOwnDamage());
            optionalShoppingCart.setTheft(cart.isTheft());
            optionalShoppingCart.setFire(cart.isFire());
            optionalShoppingCart.setOccupant(cart.isOccupant());
            optionalShoppingCart.setTpl(cart.isTpl());
            optionalShoppingCart.setStartDate(cart.getStartDate());
            optionalShoppingCart.setEndingDate(cart.getEndingDate());
            optionalShoppingCart.setPremiumBase(cart.getPremiumBase());
            optionalShoppingCart.setNetPremiumOne(cart.getNetPremiumOne());
            optionalShoppingCart.setWaiveOfExcess(cart.getWaiveOfExcess());
            optionalShoppingCart.setTotalPremiumRwanda(cart.getTotalPremiumRwanda());
            optionalShoppingCart.setExtensionCOMESA(cart.getExtensionCOMESA());
            optionalShoppingCart.setNetPremiumTwo(cart.getNetPremiumTwo());
            optionalShoppingCart.setMotorGuarantyFund(cart.getMotorGuarantyFund());
            optionalShoppingCart.setPolicyFees(cart.getPolicyFees());
            optionalShoppingCart.setTAXABLEPREMIUM(cart.getTAXABLEPREMIUM());
            optionalShoppingCart.setVATat18percent(cart.getVATat18percent());
            optionalShoppingCart.setTotalPremiumPayable(cart.getTotalPremiumPayable());
            optionalShoppingCart.setTransactionStatus(cart.getTransactionStatus());

            return shoppingCartRepo.save(optionalShoppingCart);

        }else {
            throw new RuntimeException("updating shoppingCart has been failed");
        }

    }

    @Override
    public void deleteShoppingCart(String id) {
        Optional<ShoppingCart>  optionalShoppingCart = shoppingCartRepo.findById(id);
        if (optionalShoppingCart.isPresent()){
            ShoppingCart existingShopping = optionalShoppingCart.get();
            shoppingCartRepo.delete(existingShopping);
        }else {
            throw new RuntimeException("Deleted was not successful");
        }

    }
}

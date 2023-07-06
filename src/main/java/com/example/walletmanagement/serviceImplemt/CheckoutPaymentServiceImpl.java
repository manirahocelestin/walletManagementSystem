package com.example.walletmanagement.serviceImplemt;

import com.example.walletmanagement.model.CheckoutPayment;
import com.example.walletmanagement.repository.CheckoutPaymentRepo;
import com.example.walletmanagement.service.CheckoutPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;


@Service
public class CheckoutPaymentServiceImpl implements CheckoutPaymentService {
    @Autowired
    private CheckoutPaymentRepo checkoutPaymentRepo;

    @Override
    public CheckoutPayment savePayment(CheckoutPayment checkoutPayment) {
        return checkoutPaymentRepo.save(checkoutPayment);
    }

    @Override
    public List<CheckoutPayment> findAllCheckoutPayment() {
        return checkoutPaymentRepo.findAll();
    }

    @Override
    public List<CheckoutPayment> findById(String  id) {
        Optional<CheckoutPayment> checkoutPaymentOptional = checkoutPaymentRepo.findById(id);
        return checkoutPaymentOptional.map(Collections::singletonList).orElse(Collections.emptyList());

    }



    @Override
    public CheckoutPayment updatePayment(String  id, CheckoutPayment checkoutPayment) {
        Optional<CheckoutPayment> existingCheckoutOptional = checkoutPaymentRepo.findById(id);

        if (existingCheckoutOptional.isPresent()){
            CheckoutPayment existingPayment = existingCheckoutOptional.get();
            // Update the fields of the existing payment with the new values;
            existingPayment.setId(checkoutPayment.getId());
            existingPayment.setPaymentNumber(checkoutPayment.getPaymentNumber());
            existingPayment.setFirstName(checkoutPayment.getFirstName());
            existingPayment.setLastName(existingPayment.getLastName());
            existingPayment.setPlateNumber(checkoutPayment.getPlateNumber());
            existingPayment.setMobileNumber(checkoutPayment.getMobileNumber());
            existingPayment.setEmail(checkoutPayment.getEmail());
            existingPayment.setAddress(checkoutPayment.getAddress());
            existingPayment.setTransactionStatus(checkoutPayment.getTransactionStatus());
            existingPayment.setCreated_at(checkoutPayment.getCreated_at());
            existingPayment.setUpdated_at(checkoutPayment.getUpdated_at());
            return checkoutPaymentRepo.save(existingPayment);
        }else {
            throw new RuntimeException("Payment not found!!!");
        }


    }

    @Override
    public void deletePayment(String  id) {

            Optional<CheckoutPayment> existingCheckoutOption = checkoutPaymentRepo.findById(id);
            if (existingCheckoutOption.isPresent()){
                CheckoutPayment existingPayment = existingCheckoutOption.get();
                checkoutPaymentRepo.delete(existingPayment);
            }else {
                throw new RuntimeException("Payment not found");
            }

        }


}

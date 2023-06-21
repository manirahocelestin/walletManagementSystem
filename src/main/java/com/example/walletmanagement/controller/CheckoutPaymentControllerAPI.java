package com.example.walletmanagement.controller;

import com.example.walletmanagement.model.CheckoutPayment;
import com.example.walletmanagement.service.CheckoutPaymentService;
import org.hibernate.annotations.Check;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;


@RestController
public class CheckoutPaymentControllerAPI {
    @Autowired
  private   CheckoutPaymentService checkoutPaymentService;

    @PostMapping("/registrationPayment")
    public ResponseEntity<CheckoutPayment> registerPayment(@RequestBody CheckoutPayment checkoutPayment){
        return new ResponseEntity<>(checkoutPaymentService.savePayment(checkoutPayment),HttpStatus.OK);
    }
    @GetMapping("/AllPayment")
    public ResponseEntity<List<CheckoutPayment>> findCheckoutPayment(){
        return new ResponseEntity<>(checkoutPaymentService.findAllCheckoutPayment(),HttpStatus.OK);
    }
    @GetMapping("/payment/{id}")
    public ResponseEntity<List<CheckoutPayment>> findCheckoutPaymentById(@PathVariable String  id){
        return new ResponseEntity<>(checkoutPaymentService.findById(id),HttpStatus.OK);

    }
    @PutMapping("/update/{id}")
    public ResponseEntity<CheckoutPayment> updateCheckout(@PathVariable String id, @RequestBody CheckoutPayment updatePayment){
        CheckoutPayment updatedPayment = checkoutPaymentService.updatePayment(id,updatePayment);
       return ResponseEntity.ok(updatedPayment);

    }
    @GetMapping("/{id}")
    public ResponseEntity<?> deletePayment(@PathVariable String id){
       checkoutPaymentService.deletePayment(id);
       return ResponseEntity.noContent().build();
    }

}

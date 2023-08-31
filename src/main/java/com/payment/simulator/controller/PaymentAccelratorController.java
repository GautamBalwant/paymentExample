package com.payment.simulator.controller;

import com.payment.simulator.model.PaymentRequest;
import com.payment.simulator.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentAccelratorController {

    @Autowired
    PaymentService paymentService;

    @PostMapping("/transaction")
    public String initiatePayment(@RequestBody PaymentRequest paymentRequest){

       String type= paymentRequest.getPaymentType();
       if("D".equalsIgnoreCase(type)){
          return paymentService.withdraw(paymentRequest.getAccountNumber(),paymentRequest.getAmount());
       }

       if("C".equalsIgnoreCase(type)){
           return paymentService.deposit(paymentRequest.getAccountNumber(),paymentRequest.getAmount());
       }

        return "failure";
    }
}

package com.payment.simulator.service;

import com.payment.simulator.util.TransferUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;

@Service
public class PaymentService {

        @Autowired
        TransferUtil transferUtil;


        public String withdraw(Integer accountNumber, BigDecimal amount){
           // transferUtil.loadAccounts();

               if(transferUtil.checkSum(accountNumber,amount)) {
                BigDecimal remainingBalance= transferUtil.debitAmount(accountNumber,amount);
                return "Account Debitted , remaining balance is " + remainingBalance.toString();
               }

               return "Transfer Amount is more than the current Amount";
        }

        public  String deposit(Integer accountNumber, BigDecimal amount){

         BigDecimal balance=   transferUtil.creditAmount(accountNumber,amount);
                return "amount debited, current amount "+ balance;

        }

}

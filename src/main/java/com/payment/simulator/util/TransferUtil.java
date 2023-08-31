package com.payment.simulator.util;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

@Component
public class TransferUtil {

    public  Map<Integer, BigDecimal> accounts= new HashMap<>();

@PostConstruct
    public void loadAccounts(){

        accounts.put(1,new BigDecimal(100));
        accounts.put(2,new BigDecimal(100));
        accounts.put(3,new BigDecimal(100));

    }

    public boolean checkSum(Integer accountNumber, BigDecimal amount){
       BigDecimal balance=  accounts.get(accountNumber);

      int value=  balance.compareTo(amount);
      if (value ==-1){
          return false;
      }
      return true;
    }


    public BigDecimal debitAmount(Integer accountNumber, BigDecimal amount) {
        BigDecimal balance=  accounts.get(accountNumber);
        BigDecimal remainingBaslance= balance.subtract(amount);

        accounts.put(accountNumber, remainingBaslance);

        return  remainingBaslance;

    }

    public  BigDecimal creditAmount(Integer accountNumber, BigDecimal amount){
        BigDecimal balance=  accounts.get(accountNumber);
        BigDecimal remainingBaslance= balance.add(amount);

        accounts.put(accountNumber, remainingBaslance);
        return  remainingBaslance;
    }


}

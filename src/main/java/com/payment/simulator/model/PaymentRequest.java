package com.payment.simulator.model;

import java.math.BigDecimal;
import java.math.BigInteger;

public class PaymentRequest {

    private String paymentId;
    private String paymentRefrence;
    private Integer accountNumber;
    private BigDecimal amount;
    private String paymentType;

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentRefrence() {
        return paymentRefrence;
    }

    public void setPaymentRefrence(String paymentRefrence) {
        this.paymentRefrence = paymentRefrence;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}

package com.airline.test;

import java.math.BigDecimal;

public class PaypalRefundRequest {

    private String     currency = "USD";
    private String     tradeNo;         // 交易号
    private String     saleId;          // Transaction ID
    private BigDecimal amount;          // 退款总金额
    private String     reason;          // 退款理由

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}

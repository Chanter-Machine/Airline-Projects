package com.airline.dto;

public class ApplicationConfiguration {

    private String clientId;
    private String secret;
    private String accessTokenUrl;
    private String createPaymentsUrl;
    private String executePaymentsUrl;
    private String getPaymentsDetailsUrl;
    private String expressCheckoutUrl;
    private String bnCode;
    private String cancelUrl;
    private String returnUrl;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getAccessTokenUrl() {
        return accessTokenUrl;
    }

    public void setAccessTokenUrl(String accessTokenUrl) {
        this.accessTokenUrl = accessTokenUrl;
    }

    public String getCreatePaymentsUrl() {
        return createPaymentsUrl;
    }

    public void setCreatePaymentsUrl(String createPaymentsUrl) {
        this.createPaymentsUrl = createPaymentsUrl;
    }

    public String getExecutePaymentsUrl() {
        return executePaymentsUrl;
    }

    public void setExecutePaymentsUrl(String executePaymentsUrl) {
        this.executePaymentsUrl = executePaymentsUrl;
    }

    public String getGetPaymentsDetailsUrl() {
        return getPaymentsDetailsUrl;
    }

    public void setGetPaymentsDetailsUrl(String getPaymentsDetailsUrl) {
        this.getPaymentsDetailsUrl = getPaymentsDetailsUrl;
    }

    public String getExpressCheckoutUrl() {
        return expressCheckoutUrl;
    }

    public void setExpressCheckoutUrl(String expressCheckoutUrl) {
        this.expressCheckoutUrl = expressCheckoutUrl;
    }

    public String getBnCode() {
        return bnCode;
    }

    public void setBnCode(String bnCode) {
        this.bnCode = bnCode;
    }

    public String getCancelUrl() {
        return cancelUrl;
    }

    public void setCancelUrl(String cancelUrl) {
        this.cancelUrl = cancelUrl;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

}

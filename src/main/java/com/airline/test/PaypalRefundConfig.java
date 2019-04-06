package com.airline.test;

//直接上代码
public class PaypalRefundConfig {

    private String clientId;
    private String clientSecret;
    private String endpointMode; //

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getEndpointMode() {
        return endpointMode;
    }

    public void setEndpointMode(String endpointMode) {
        this.endpointMode = endpointMode;
    }

}

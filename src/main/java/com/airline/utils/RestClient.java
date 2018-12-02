package com.airline.utils;

import com.airline.dto.CreatePaymentDto;
import okhttp3.*;
import org.apache.commons.codec.binary.Base64;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class RestClient {

    public JSONObject getAccessToken(String clientId, String secret, String url, String bnCode) throws IOException {
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Content-Type", "application/x-www-form-urlencoded");
        headers.put("Authorization", getBasicBearerToken(clientId, secret));
        headers.put("PayPal-Partner-Attribution-Id", bnCode);
        String data = "grant_type=client_credentials";
        JSONObject dataFromServer = post(data, headers, url);
        return dataFromServer;
    }

    public JSONObject createPayment(String accessToken, String url, CreatePaymentDto dataToSend, String bnCode) throws IOException {
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Content-Type", "application/json");
        headers.put("Authorization", "Bearer " + accessToken);
        headers.put("PayPal-Partner-Attribution-Id", bnCode);
        JSONObject jsonString = new JSONObject(dataToSend);
        JSONObject dataFromCreateApi = post(jsonString.toString(), headers, url);
        return dataFromCreateApi;
    }

    public JSONObject executePayment(String accessToken, String url, Object dataToSend, String bnCode) throws IOException {
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Content-Type", "application/json");
        headers.put("Authorization", "Bearer " + accessToken);
        headers.put("PayPal-Partner-Attribution-Id", bnCode);
        JSONObject dataFromExecuteApi = post(dataToSend.toString(), headers, url);
        return dataFromExecuteApi;

    }

    public JSONObject getPaymentDetails(String accessToken, String url, String bnCode) throws IOException {
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Content-Type", "application/json");
        headers.put("Authorization", "Bearer " + accessToken);
        headers.put("PayPal-Partner-Attribution-Id", bnCode);
        JSONObject dataFromPayPal = get(headers, url);
        return dataFromPayPal;
    }

    public String getBasicBearerToken(String clientId, String secret) {
        String token = clientId.toString().trim() + ":" + secret.toString().trim();
        token = token.replace("\"", "");
        Base64 b = new Base64();
        String accessToken = b.encodeAsString(new String(token).getBytes());
        return "Basic " + accessToken;
    }

    public JSONObject post(String data, Map<String, String> headers, String url) throws IOException {
        ConnectionSpec cs = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS) // Set TLS VERSION 1.2
                .tlsVersions(TlsVersion.TLS_1_2)
                .build();
        List<ConnectionSpec> specs = new ArrayList<ConnectionSpec>();
        specs.add(cs);
        specs.add(ConnectionSpec.COMPATIBLE_TLS);
        specs.add(ConnectionSpec.CLEARTEXT);

        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(36000, TimeUnit.SECONDS)
                .writeTimeout(36000, TimeUnit.SECONDS)
                .readTimeout(36000, TimeUnit.SECONDS)
                .connectionSpecs(specs)
                .build();
        MediaType mediaType = MediaType.parse(""); // set the media type to empty since the headers will have the needed the media type.
        Headers headerbuild = Headers.of(headers);
        RequestBody body = RequestBody.create(mediaType, data);
        Request request = new Request.Builder().url(url).headers(headerbuild).post(body).build();
        Response response = client.newCall(request).execute();
        String responseBody = response.body().string();
        JSONObject jsonObj = new JSONObject(responseBody);
        return jsonObj;
    }

    public JSONObject get(Map<String, String> headers, String url) throws IOException {
        ConnectionSpec cs = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS) // Set TLS VERSION 1.2
                .tlsVersions(TlsVersion.TLS_1_2)
                .build();
        List<ConnectionSpec> specs = new ArrayList<ConnectionSpec>();
        specs.add(cs);
        specs.add(ConnectionSpec.COMPATIBLE_TLS);
        specs.add(ConnectionSpec.CLEARTEXT);

        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(36000, TimeUnit.SECONDS)
                .writeTimeout(36000, TimeUnit.SECONDS)
                .readTimeout(36000, TimeUnit.SECONDS)
                .connectionSpecs(specs)
                .build();
        Headers headerbuild = Headers.of(headers);
        Request request = new Request.Builder().url(url).headers(headerbuild).build();
        Response response = client.newCall(request).execute();
        String responseBody = response.body().string();
        JSONObject jsonObj = new JSONObject(responseBody);
        return jsonObj;
    }


}
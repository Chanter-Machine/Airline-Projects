package com.airline.utils;

import com.airline.dto.*;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PayPalHelper {

    public CreatePaymentDto getCreatePaymentData(String baseUrl, JSONObject dataFromHtml, String returnUrl, String cancelUrl) {
        // set redirect urls


        Map<String, String> redirects = new HashMap<String, String>();
        redirects.put("return_url", baseUrl + "/" + returnUrl);
        redirects.put("cancel_url", baseUrl + "/" + cancelUrl);

        //set payer data
        Map<String, String> payer = new HashMap<String, String>();
        payer.put("payment_method", "paypal");

        // built an transaction data object

        TransactionItemDetailsDto transactionItemDetailsDto = new TransactionItemDetailsDto();
        transactionItemDetailsDto.setQuantity(dataFromHtml.get("quantity").toString());
        transactionItemDetailsDto.setName(dataFromHtml.get("name").toString());
        transactionItemDetailsDto.setPrice(dataFromHtml.get("price").toString());
        transactionItemDetailsDto.setCurrency(dataFromHtml.get("currency").toString());
        transactionItemDetailsDto.setDescription(dataFromHtml.get("description").toString());
        transactionItemDetailsDto.setTax(dataFromHtml.get("tax").toString());

        ArrayList<TransactionItemDetailsDto> arrayOfItems = new ArrayList<TransactionItemDetailsDto>();
        arrayOfItems.add(transactionItemDetailsDto);

        //set address
        ShippingAddress shippingAddress = new ShippingAddress();
        if (dataFromHtml.get("customFlag").toString().equals("true")) {
            shippingAddress.setRecipient_name(dataFromHtml.get("recipient_name").toString());
            shippingAddress.setLine1(dataFromHtml.get("line1").toString());
            shippingAddress.setLine2(dataFromHtml.get("line2").toString());
            shippingAddress.setCity(dataFromHtml.get("city").toString());
            shippingAddress.setCountry_code(dataFromHtml.get("country_code").toString());
            shippingAddress.setPhone(dataFromHtml.get("phone").toString());
            shippingAddress.setPostal_code(dataFromHtml.get("postal_code").toString());
            shippingAddress.setState(dataFromHtml.get("state").toString());
        }

        TransactionItemList transactionItemList = new TransactionItemList();
        transactionItemList.setItems(arrayOfItems);
        if (dataFromHtml.get("customFlag").toString().equals("true")) {
            transactionItemList.setShipping_address(shippingAddress);
        }
        // set amount

        TransactionDetailsDto transactionDetailsDto = new TransactionDetailsDto();
        transactionDetailsDto.setShipping(dataFromHtml.get("shipping").toString());
        transactionDetailsDto.setSubtotal(dataFromHtml.get("subtotal").toString());
        transactionDetailsDto.setTax(dataFromHtml.get("tax").toString());
        transactionDetailsDto.setShipping_discount(dataFromHtml.get("shipping_discount").toString());
        transactionDetailsDto.setHandling_fee(dataFromHtml.get("handling_fee").toString());
        transactionDetailsDto.setInsurance(dataFromHtml.get("insurance").toString());


        TransactionAmountDto transactionAmountDto = new TransactionAmountDto();
        transactionAmountDto.setCurrency(dataFromHtml.get("currency").toString());
        transactionAmountDto.setDetails(transactionDetailsDto);
        // total
        transactionAmountDto.setTotal(dataFromHtml.get("total").toString());

        CreatePaymentDto createPaymentDto = new CreatePaymentDto();
        createPaymentDto.setIntent(dataFromHtml.get("intent").toString());
        createPaymentDto.setRedirect_urls(redirects);
        createPaymentDto.setPayer(payer);

        TransactionDto transactionDto = new TransactionDto();
        transactionDto.setAmount(transactionAmountDto);
        transactionDto.setItem_list(transactionItemList);


        transactionDto.setDescription(dataFromHtml.get("description").toString());
        transactionDto.setInvoice_number(generateInvoiceIDString());
        transactionDto.setCustom("Some Sample Data");

        ArrayList<TransactionDto> arrayOfTransaction = new ArrayList<TransactionDto>();
        arrayOfTransaction.add(transactionDto);
        createPaymentDto.setTransactions(arrayOfTransaction);
        return createPaymentDto;
    }


    public static String generateInvoiceIDString() {
        String uuid = UUID.randomUUID().toString();
        return "InvoiceID = " + uuid;
    }
}

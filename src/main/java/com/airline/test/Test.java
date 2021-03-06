package com.airline.test;

import org.json.JSONObject;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("src\\main\\resources\\paypal.properties");
        System.out.println(fileInputStream);
    }

    @org.junit.Test
    public void test() {
        String json = "{\n" +
                "    \"create_time\": \"2018-11-27T21:50:22Z\",\n" +
                "    \"links\": [\n" +
                "        {\n" +
                "            \"method\": \"GET\",\n" +
                "            \"rel\": \"self\",\n" +
                "            \"href\": \"https://api.sandbox.paypal.com/v1/payments/payment/PAY-6LS91499KF999924YLP63YCY\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"id\": \"PAY-6LS91499KF999924YLP63YCY\",\n" +
                "    \"state\": \"approved\",\n" +
                "    \"transactions\": [\n" +
                "        {\n" +
                "            \"payee\": {\n" +
                "                \"merchant_id\": \"8GAQZUUX9533C\",\n" +
                "                \"email\": \"lipptest@paypal.com\"\n" +
                "            },\n" +
                "            \"amount\": {\n" +
                "                \"total\": \"17.00\",\n" +
                "                \"currency\": \"USD\",\n" +
                "                \"details\": {\n" +
                "                    \"insurance\": \"2.00\",\n" +
                "                    \"shipping\": \"5.00\",\n" +
                "                    \"shipping_discount\": \"-3.00\",\n" +
                "                    \"subtotal\": \"10.00\",\n" +
                "                    \"tax\": \"2.00\",\n" +
                "                    \"handling_fee\": \"1.00\"\n" +
                "                }\n" +
                "            },\n" +
                "            \"related_resources\": [\n" +
                "                {\n" +
                "                    \"sale\": {\n" +
                "                        \"parent_payment\": \"PAY-6LS91499KF999924YLP63YCY\",\n" +
                "                        \"amount\": {\n" +
                "                            \"total\": \"17.00\",\n" +
                "                            \"currency\": \"USD\",\n" +
                "                            \"details\": {\n" +
                "                                \"insurance\": \"2.00\",\n" +
                "                                \"shipping\": \"5.00\",\n" +
                "                                \"shipping_discount\": \"-3.00\",\n" +
                "                                \"subtotal\": \"10.00\",\n" +
                "                                \"tax\": \"2.00\",\n" +
                "                                \"handling_fee\": \"1.00\"\n" +
                "                            }\n" +
                "                        },\n" +
                "                        \"payment_mode\": \"INSTANT_TRANSFER\",\n" +
                "                        \"update_time\": \"2018-11-27T21:50:21Z\",\n" +
                "                        \"create_time\": \"2018-11-27T21:50:21Z\",\n" +
                "                        \"protection_eligibility_type\": \"ITEM_NOT_RECEIVED_ELIGIBLE,UNAUTHORIZED_PAYMENT_ELIGIBLE\",\n" +
                "                        \"transaction_fee\": {\n" +
                "                            \"currency\": \"USD\",\n" +
                "                            \"value\": \"0.96\"\n" +
                "                        },\n" +
                "                        \"protection_eligibility\": \"ELIGIBLE\",\n" +
                "                        \"links\": [\n" +
                "                            {\n" +
                "                                \"method\": \"GET\",\n" +
                "                                \"rel\": \"self\",\n" +
                "                                \"href\": \"https://api.sandbox.paypal.com/v1/payments/sale/7LA373588C173020F\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"method\": \"POST\",\n" +
                "                                \"rel\": \"refund\",\n" +
                "                                \"href\": \"https://api.sandbox.paypal.com/v1/payments/sale/7LA373588C173020F/refund\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"method\": \"GET\",\n" +
                "                                \"rel\": \"parent_payment\",\n" +
                "                                \"href\": \"https://api.sandbox.paypal.com/v1/payments/payment/PAY-6LS91499KF999924YLP63YCY\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"id\": \"7LA373588C173020F\",\n" +
                "                        \"state\": \"completed\"\n" +
                "                    }\n" +
                "                }\n" +
                "            ],\n" +
                "            \"item_list\": {\n" +
                "                \"shipping_address\": {\n" +
                "                    \"country_code\": \"C2\",\n" +
                "                    \"city\": \"三明市 尤溪\",\n" +
                "                    \"state\": \"福建\",\n" +
                "                    \"recipient_name\": \"buyer test\",\n" +
                "                    \"postal_code\": \"365100\",\n" +
                "                    \"line1\": \"解放路12号\"\n" +
                "                },\n" +
                "                \"items\": [\n" +
                "                    {\n" +
                "                        \"quantity\": 1,\n" +
                "                        \"price\": \"10.00\",\n" +
                "                        \"name\": \"DSLR Camera\",\n" +
                "                        \"description\": \"Autofocus Camera\",\n" +
                "                        \"currency\": \"USD\",\n" +
                "                        \"tax\": \"2.00\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            \"custom\": \"Some Sample Data\",\n" +
                "            \"description\": \"Autofocus Camera\",\n" +
                "            \"invoice_number\": \"InvoiceID = 87ce76c0-c51f-4b41-a9b6-82dfd712cfb3\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"intent\": \"sale\",\n" +
                "    \"payer\": {\n" +
                "        \"payment_method\": \"paypal\",\n" +
                "        \"status\": \"VERIFIED\",\n" +
                "        \"payer_info\": {\n" +
                "            \"country_code\": \"C2\",\n" +
                "            \"last_name\": \"buyer\",\n" +
                "            \"payer_id\": \"NNVGMKRRQBB24\",\n" +
                "            \"shipping_address\": {\n" +
                "                \"country_code\": \"C2\",\n" +
                "                \"city\": \"三明市 尤溪\",\n" +
                "                \"state\": \"福建\",\n" +
                "                \"recipient_name\": \"test buyer\",\n" +
                "                \"postal_code\": \"365100\",\n" +
                "                \"line1\": \"解放路12号\"\n" +
                "            },\n" +
                "            \"first_name\": \"test\",\n" +
                "            \"email\": \"cxhnan-buyer@qq.com\"\n" +
                "        }\n" +
                "    },\n" +
                "    \"cart\": \"89W18276FV7632627\"\n" +
                "}";
        System.out.println("\n\n\n\n");
        JSONObject jsonObject = new JSONObject(json);
        System.out.println(jsonObject);
        String state = (String) jsonObject.get("state");
        System.out.println(state.getClass());
        //System.out.println((Str ing) state);
        System.out.println("\n\n\n\n");
    }

}

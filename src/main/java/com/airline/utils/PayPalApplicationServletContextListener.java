package com.airline.utils;


import com.airline.dto.ApplicationConfiguration;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PayPalApplicationServletContextListener implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContextListener Destroyed");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        try {
            ServletContext sc = sce.getServletContext();
            //The properties file is in the resources,so change the way to get resource
//			InputStream input = sce.getServletContext().getResourceAsStream("paypal.properties");
//			InputStream inputStream = new FileInputStream("src\\main\\resources\\paypal.properties");
            InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("paypal.properties");
            Properties properties = new Properties();
            properties.load(resourceAsStream);

            ApplicationConfiguration ac = new ApplicationConfiguration();

            ac.setCancelUrl(properties.getProperty("CANCEL_URL").toString());
            ac.setReturnUrl(properties.getProperty("RETURN_URL").toString());

            // check the application property wheather the app is in live or sandbox and load config accordingly
            if (properties.getProperty("IS_APPLICATION_IN_SANDBOX").toString().equals("true")) {

                // load all properties for sandbox
                ac.setAccessTokenUrl(properties.getProperty("ACCESS_TOKEN_URL").toString());
                ac.setClientId(properties.getProperty("CLIENT_ID").toString());
                ac.setCreatePaymentsUrl(properties.getProperty("CREATE_PAYMENT_URL").toString());
                ac.setExecutePaymentsUrl(properties.getProperty("EXECUTE_PAYMENT_URL").toString());
                ac.setExpressCheckoutUrl(properties.getProperty("EXPRESS_CHECKOUT_SANDBOX_URL").toString());
                ac.setGetPaymentsDetailsUrl(properties.getProperty("GET_PAYMENT_DETAILS").toString());
                ac.setSecret(properties.getProperty("SECRET").toString());
                ac.setBnCode(properties.getProperty("BN_CODE").toString());

                System.out.println("Loading config for sandbox");
                sc.setAttribute("config", ac);

            } else {

                // load all properties for live
                ac.setAccessTokenUrl(properties.getProperty("ACCESS_TOKEN_URL_LIVE").toString());
                ac.setClientId(properties.getProperty("CLIENT_ID_LIVE").toString());
                ac.setCreatePaymentsUrl(properties.getProperty("CREATE_PAYMENT_URL_LIVE").toString());
                ac.setExecutePaymentsUrl(properties.getProperty("EXECUTE_PAYMENT_URL_LIVE").toString());
                ac.setExpressCheckoutUrl(properties.getProperty("EXPRESS_CHECKOUT_LIVE_URL").toString());
                ac.setGetPaymentsDetailsUrl(properties.getProperty("GET_PAYMENT_DETAILS_LIVE").toString());
                ac.setSecret(properties.getProperty("SECRET_LIVE").toString());
                ac.setBnCode(properties.getProperty("BN_CODE").toString());
                System.out.println("Loading config for live");
                sc.setAttribute("config", ac);


            }
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();

        }

        System.out.println("Added Config properties in ServletContextListener");
    }

}

package com.airline.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("src\\main\\resources\\paypal.properties");
        System.out.println(fileInputStream);
    }
}

//package com.airline.converter;
//
//import org.springframework.core.convert.converter.Converter;
//
//import java.util.Date;
//
//public class DateConverter implements Converter<String, Date> {
//    @Override
//    public Date convert(String source) {
//        try {
//            long l = Long.parseLong(source);
//            return new Date()
//        } catch (Exception e){
//            e.printStackTrace();
//            return null
//        }
//        return null;
//    }
//}

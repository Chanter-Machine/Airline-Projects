package com.airline.converter;


import org.springframework.beans.TypeMismatchException;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

//Converter中的两个泛型表示： Source源类型，第二个表示宿（目标类型）

public class MyDataConverter implements Converter<String, Date> {

    public Date convert(String source) {
        SimpleDateFormat sdf = getDateFormat(source);
        try {
            return sdf.parse(source);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    private SimpleDateFormat getDateFormat(String source) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        if (Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$", source)) {
            sdf = new SimpleDateFormat("yyyy-MM-dd");
        } else if (Pattern.matches("^\\d{4}/\\d{2}/\\d{2}$", source)) {
            sdf = new SimpleDateFormat("yyyy/MM/dd");
        } else if (Pattern.matches("^\\d{4}\\d{2}\\d{2}$", source)) {
            sdf = new SimpleDateFormat("yyyyMMdd");
        } else {
            System.out.println("test");
            throw new TypeMismatchException("", Date.class);
        }
        return sdf;
    }
}

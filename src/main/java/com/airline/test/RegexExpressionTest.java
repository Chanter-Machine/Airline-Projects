package com.airline.test;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExpressionTest {
    @Test
    public void test01() {
        String regex = "script";
        String checkString = "sdfdfsscriptsfdsdf";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(checkString);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}

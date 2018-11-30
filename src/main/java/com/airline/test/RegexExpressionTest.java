package com.airline.test;

import org.junit.Test;

import java.util.regex.Pattern;

public class RegexExpressionTest {
    @Test
    public void test01() {
        String regex = ".*(script).*";
        String checkString = "sdfdfsscriptsfdsdf";
        boolean matches = Pattern.matches(regex, checkString);
        System.out.println(matches);

    }
}

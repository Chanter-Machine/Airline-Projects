package com.airline.utils;

import java.util.Random;

public class Randomizer {

    public Integer generate(Integer min, Integer max){
        Random rnd = new Random();
        return min + rnd.nextInt(max);
    }
}

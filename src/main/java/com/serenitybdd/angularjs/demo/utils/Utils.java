package com.serenitybdd.angularjs.demo.utils;

import java.util.List;
import java.util.Random;

public class Utils {

    public static String getRandomOption(List<String> options){
        Random randomizer = new Random();
        return options.get(randomizer.nextInt(options.size()));
    }
}

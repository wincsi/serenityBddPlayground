package com.serenitybdd.angularjs.demo.utils;

import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.Random;

public class Utils {

    public static String getRandomOption(List<String> options){
        Random randomizer = new Random();
        return options.get(randomizer.nextInt(options.size()));
    }

    public static void selectRandomOption(WebElementFacade element){
        List<String> selectOptions = element.getSelectOptions();
        element.selectByVisibleText(Utils.getRandomOption(selectOptions));
    }
}

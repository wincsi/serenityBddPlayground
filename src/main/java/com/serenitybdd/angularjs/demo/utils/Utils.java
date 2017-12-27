package com.serenitybdd.angularjs.demo.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class Utils {

    public static String getRandomOption(List<String> options){
        Random randomizer = new Random();
        return options.get(randomizer.nextInt(options.size()));
    }

    public static void selectRandomOption(WebElementFacade element){
        List<String> selectOptions = element.getSelectOptions();
        element.selectByVisibleText(Utils.getRandomOption(selectOptions));
    }

    public static void isDisplayed(WebElementFacade element) {
        assertThat(element.isDisplayed()).isEqualTo(true);
    }

    public static void isButtonDisplayed(WebElementFacade button, boolean isVisible){
        assertThat(button.isDisplayed()).isEqualTo(isVisible);
    }
}

package com.serenitybdd.angularjs.demo.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class Utils {

    public static String getRandomOption(List<String> options){
        Random randomizer = new Random();
        return options.get(randomizer.nextInt(options.size()));
    }

    public static void selectRandomOption(WebElementFacade element, boolean removeDefault){
        List<String> selectOptions = element.getSelectOptions();

        if(removeDefault){
            String defaultSelection = element.getSelectedVisibleTextValue();
            for(Iterator<String> iter = selectOptions.listIterator(); iter.hasNext();){
                String current = iter.next();
                if(current.equalsIgnoreCase(defaultSelection)){
                    iter.remove();
                    break;
                }
            }
        }

        element.selectByVisibleText(Utils.getRandomOption(selectOptions));
    }

    public static void isDisplayed(WebElementFacade element) {
        assertThat(element.isDisplayed()).isEqualTo(true);
    }

    public static void isButtonDisplayed(WebElementFacade button, boolean isVisible){
        assertThat(button.isDisplayed()).isEqualTo(isVisible);
    }

    public static void isButtonEnabled(WebElementFacade button, boolean isEnabled) {
        assertThat(button.isCurrentlyEnabled()).isEqualTo(isEnabled);
    }
}

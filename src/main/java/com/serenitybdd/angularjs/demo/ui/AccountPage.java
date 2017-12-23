package com.serenitybdd.angularjs.demo.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountPage extends PageObject {

    @FindBy(xpath = "//div[3]/div/div[2]/div/div[1]/strong/span")
    WebElementFacade greetingName;

    public String getCustomerName() {
        return greetingName.getText();
    }
}

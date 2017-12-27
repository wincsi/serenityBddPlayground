package com.serenitybdd.angularjs.demo.ui;

import com.serenitybdd.angularjs.demo.utils.Utils;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://www.way2automation.com/angularjs-protractor/banking/#/account")
public class AccountPage extends BasePage {

    @FindBy(xpath = "//div[3]/div/div[2]/div/div[1]/strong/span")
    WebElementFacade greetingName;

    @FindBy(id = "accountSelect")
    WebElementFacade accountSelector;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public String getCustomerName() {
        return greetingName.getText();
    }

    public void selectAnyAccont() {
        Utils.selectRandomOption(accountSelector);
    }
}

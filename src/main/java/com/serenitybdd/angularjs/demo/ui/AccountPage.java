package com.serenitybdd.angularjs.demo.ui;

import com.serenitybdd.angularjs.demo.utils.Utils;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("/account")
@At(".*/account")
public class AccountPage extends BasePage {

    @FindBy(xpath = "//div[3]/div/div[2]/div/div[1]/strong/span")
    WebElementFacade greetingName;

    @FindBy(id = "accountSelect")
    WebElementFacade accountSelector;

    @FindBy(xpath = "//div[3]/div/div[2]/div/div[2]/strong[1]")
    WebElementFacade accountNumber;

    @FindBy(xpath = "//div[3]/div/div[2]/div/div[2]/strong[2]")
    WebElementFacade balance;

    @FindBy(xpath = "//div[3]/div/div[2]/div/div[2]/strong[3]")
    WebElementFacade currency;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public String getCustomerName() {
        return greetingName.getText();
    }

    public void selectAnyAccont() {
        Utils.selectRandomOption(accountSelector);
    }

    public String getDisplayedAccountNumber() {
        return accountNumber.getText();
    }

    public String getSelectedAccountNumber() {
        return accountSelector.getSelectedVisibleTextValue();
    }

    public WebElementFacade getBalance() {
        return balance;
    }

    public WebElementFacade getCurrency() {
        return currency;
    }
}

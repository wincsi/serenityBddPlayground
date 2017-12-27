package com.serenitybdd.angularjs.demo.ui;

import com.serenitybdd.angularjs.demo.utils.Utils;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


@DefaultUrl("/customer")
public class LoginPage extends BasePage {

    @FindBy(id = "userSelect")
    WebElementFacade userSelect;

    @FindBy(xpath = "//button[contains(.,'Login')]")
    WebElementFacade loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void selectUserByName(String userName){
        userSelect.selectByVisibleText(userName);
    }

    public void login() {
        loginButton.waitUntilVisible();
        loginButton.click();
        waitForAngularRequestsToFinish();
    }

    public void selectAnyUser() {
        waitForAngularRequestsToFinish();
        userSelect.waitUntilClickable();
        Utils.selectRandomOption(userSelect);
    }
}

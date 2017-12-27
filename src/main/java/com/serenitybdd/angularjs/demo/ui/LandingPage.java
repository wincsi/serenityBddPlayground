package com.serenitybdd.angularjs.demo.ui;

import com.paulhammant.ngwebdriver.ByAngular;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://www.way2automation.com/angularjs-protractor/banking/#/login")
public class LandingPage extends BasePage {

    WebElementFacade customerLoginButton;

    public LandingPage(WebDriver driver) {
        super(driver);
    }


    public String getApplicationName() {
        return header.getText();
    }

    public void goToCustomerLoginPage() {
        customerLoginButton = find(ByAngular.buttonText("Customer Login"));
        customerLoginButton.click();
        waitForAngularRequestsToFinish();
    }
}

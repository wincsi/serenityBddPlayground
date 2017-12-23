package com.serenitybdd.angularjs.demo.ui;

import com.paulhammant.ngwebdriver.ByAngular;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://www.way2automation.com/angularjs-protractor/banking/#/login")
public class LandingPage extends PageObject {

    @FindBy(xpath = "/html/body/div[3]/div/div[1]/strong")
    WebElementFacade header;

    WebElementFacade customerLoginButton;

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @WhenPageOpens
    public void waitUntilTitleAppears() {
        element(header).waitUntilVisible();
    }

    public String getApplicationName() {
        return header.getText();
    }

    public void goToCustomerLoginPage() {
        customerLoginButton = find(ByAngular.buttonText("Customer Login"));
        customerLoginButton.click();
    }
}

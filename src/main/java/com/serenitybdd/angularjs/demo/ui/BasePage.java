package com.serenitybdd.angularjs.demo.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;

public class BasePage extends PageObject {

    @FindBy(xpath = "/html/body/div[3]/div/div[1]/strong")
    WebElementFacade header;

    public BasePage(WebDriver driver) {
        super(driver);
    }

    @WhenPageOpens
    public void waitUntilTitleAppears() {
        element(header).waitUntilVisible();
    }
}

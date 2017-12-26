package com.serenitybdd.angularjs.demo.ui;

import com.paulhammant.ngwebdriver.ByAngular;
import com.serenitybdd.angularjs.demo.utils.Utils;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class LoginPage extends PageObject {

    @FindBy(id = "userSelect")
    WebElementFacade userSelect;

    @FindBy(xpath = "//button[contains(.,'Login')]")
    WebElementFacade loginButton;

    public void selectUserByName(String userName){
        userSelect.selectByVisibleText(userName);
    }

    public void login() {
        loginButton.waitUntilVisible();
        loginButton.click();
        waitForAngularRequestsToFinish();
    }

    public void selectAnyUser() {
        List<String> selectOptions = userSelect.getSelectOptions();
        userSelect.selectByVisibleText(Utils.getRandomOption(selectOptions));
    }

    //TODO: Move this to a base page object class or to Util class
    public boolean isButtonDisplayed(String buttonName){
        WebElementFacade button = find(By.xpath("//button[contains(.,'"+ buttonName + "')]"));
        return button.isDisplayed();
    }

    public void selectBlankOption() {
        userSelect.selectByVisibleText("---Your Name---");
    }
}

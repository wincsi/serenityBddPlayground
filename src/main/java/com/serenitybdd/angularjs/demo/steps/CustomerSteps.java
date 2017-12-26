package com.serenitybdd.angularjs.demo.steps;

import com.serenitybdd.angularjs.demo.ui.AccountPage;
import com.serenitybdd.angularjs.demo.ui.LandingPage;
import com.serenitybdd.angularjs.demo.ui.LoginPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerSteps {

    LandingPage landingPage;
    LoginPage loginPage;
    AccountPage accountPage;

    @Step
    public void isLandingPage() {
        landingPage.open();

        assertThat(landingPage.getApplicationName()).isEqualToIgnoringCase("XYZ Bank");
    }

    @Step
    public void goToLoginPage() {
        landingPage.goToCustomerLoginPage();
    }

    @Step
    public void selectByUserName(String userName) {
        loginPage.selectUserByName(userName);
    }

    @Step
    public void login() {
        loginPage.login();
    }

    @Step
    public void isTheAccountPageForUser(String userName) {
        assertThat(accountPage.getCustomerName()).isEqualToIgnoringCase(userName);
    }

    @Step
    public void selectAnyUser() {
        loginPage.selectAnyUser();
    }

    @Step
    public void isButtonDisplayed(String buttonName) {
        checkButtonStatus(buttonName, true);
    }

    @Step
    public void isButtonHidden(String buttonName) {
        checkButtonStatus(buttonName, false);
    }

    @Step
    public void selectBlankOption() {
        loginPage.selectBlankOption();
    }

    protected void checkButtonStatus(String buttonName, boolean isVisible){
       assertThat(loginPage.isButtonDisplayed(buttonName)).isEqualTo(isVisible);
    }
}

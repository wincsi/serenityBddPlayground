package com.serenitybdd.angularjs.demo.steps;

import com.serenitybdd.angularjs.demo.ui.AccountPage;
import com.serenitybdd.angularjs.demo.ui.CurrentPage;
import com.serenitybdd.angularjs.demo.ui.LandingPage;
import com.serenitybdd.angularjs.demo.ui.LoginPage;
import com.serenitybdd.angularjs.demo.utils.Utils;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerSteps {

    LandingPage landingPage;
    LoginPage loginPage;
    AccountPage accountPage;
    CurrentPage currentPage;

    @Step
    //TODO: application name should come from a parameter
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
        checkButtonDisplayStatus(buttonName, true);
    }

    @Step
    public void isButtonHidden(String buttonName) {
        checkButtonDisplayStatus(buttonName, false);
    }

    protected void checkButtonDisplayStatus(String buttonText, boolean isVisible){
       Utils.isButtonDisplayed(loginPage.getButtonByText(buttonText), isVisible);
    }

    @Step
    public void openAccountPage(){
        //TODO: How can we check if we are on the good page and don't reopen the page if not necessary?
        accountPage.open();
    }

    @Step
    public void selectAnyAccount() {
        accountPage.selectAnyAccont();
    }

    @Step
    public void selectedAccountNumberIsDisplayed() {
        String displayedAccountNumber = accountPage.getDisplayedAccountNumber();
        String selectedAccountNumber = accountPage.getSelectedAccountNumber();

        assertThat(displayedAccountNumber).isEqualToIgnoringWhitespace(selectedAccountNumber);
    }

    @Step
    public void balanceValueIsDisplayed() {
        WebElementFacade balanceElement = accountPage.getBalance();
        Utils.isDisplayed(balanceElement);
        assertThat(balanceElement.getText()).isNotEmpty();

    }

    @Step
    public void currencyValueIsDisplayed() {
        WebElementFacade currencyElement = accountPage.getCurrency();
        Utils.isDisplayed(currencyElement);
        assertThat(currencyElement.getText()).isNotEmpty();
    }

    @Step
    public void isButtonDisabled(String buttonText) {
        checkButtonEnabledStatus(buttonText, false);
    }

    @Step
    public void isButtonEnabled(String buttonText) {
        checkButtonEnabledStatus(buttonText, true);
    }

    protected void checkButtonEnabledStatus(String buttonText, boolean isEnabled){
        Utils.isButtonEnabled(loginPage.getButtonByText(buttonText), true);
    }
}

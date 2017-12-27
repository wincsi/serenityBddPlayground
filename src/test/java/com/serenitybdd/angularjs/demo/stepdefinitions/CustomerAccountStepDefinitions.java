package com.serenitybdd.angularjs.demo.stepdefinitions;

import com.serenitybdd.angularjs.demo.steps.CustomerSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;

public class CustomerAccountStepDefinitions {

    @Steps
    CustomerSteps customer;

    @Then("I can choose from my accounts")
    public void thenICanChooseFromMyAccounts(){
        customer.selectAnyAccount();
    }

    @Then("the 'account number' is displayed")
    public void thenTheAccountNumberIsDisplayed(){
        customer.selectedAccountNumberIsDisplayed();
    }

    @Then("the 'balance' is displayed")
    public void thenTheBalanceIsDisplaye(){
        customer.balanceValueIsDisplayed();
    }

    @Then("the 'currency' is displayed")
    public void thenTheCurrencyIsDisplayed(){
        customer.currencyValueIsDisplayed();
    }

}

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


}

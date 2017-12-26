package com.serenitybdd.angularjs.demo.stepdefinitions;

import com.serenitybdd.angularjs.demo.steps.CustomerSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class LogInStepDefinitions {

    @Steps
    CustomerSteps customer;

    @Given("I am on application landing page")
    public void givenIAmOnApplicationLandingPage(){
        customer.isLandingPage();
    }

    @When("I log in as customer: '<userName>'")
    public void whenILoginAsCustomer(String userName){
        customer.goToLoginPage();
        customer.selectByUserName(userName);
        customer.login();

    }

    @Then("I want to see my bank account")
    public void thenIwantToSeeMyBankAccount(String userName){
        customer.isTheAccountPageForUser(userName);
    }

    @Given("I am on customer login page")
    public void givenIAmOnCustomerLoginPage(){
        customer.isLandingPage();
        customer.goToLoginPage();
    }

    @When("I select a valid customer name from the list")
    public void whenIselectAValidCustomerName(){
        customer.selectAnyUser();
    }

    @Then("the '$buttonName' button is displayed")
    public void thenTheButtonIsDisplayed(String buttonName){
        customer.isButtonDisplayed(buttonName);
    }

    @When("I select the 'blank' option")
    public void whenISelectBlankOption(){
        customer.selectBlankOption();

    }

    @Then("the '$buttonName' button is not displayed")
    public void thenTheButtonIsNotDisplayed(String buttonName){
        customer.isButtonHidden(buttonName);
    }
}

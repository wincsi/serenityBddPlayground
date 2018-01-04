package com.serenitybdd.angularjs.demo.stepdefinitions;

import com.serenitybdd.angularjs.demo.steps.ui.CustomerSteps;
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

    @Then("the '$buttonText' button is displayed")
    public void thenTheButtonIsDisplayed(String buttonText){
        customer.isButtonDisplayed(buttonText);
    }

    @When("I select the '$option' option")
    public void whenISelectBlankOption(String option){
        customer.selectByUserName(option);

    }

    @Then("the '$buttonName' button is not displayed")
    public void thenTheButtonIsNotDisplayed(String buttonName){
        customer.isButtonHidden(buttonName);
    }

    @Given("I am logged in as a valid customer")
    public void givenIAmLoggedInAsAValidCustomer(){
        givenIAmOnCustomerLoginPage();
        whenIselectAValidCustomerName();
        customer.login();
    }

    @When("I open the account page")
    public void whenIOpenTheAccountPage(){
        customer.openAccountPage();
    }


}

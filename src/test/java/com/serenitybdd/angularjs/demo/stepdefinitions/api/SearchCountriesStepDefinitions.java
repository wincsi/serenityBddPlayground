package com.serenitybdd.angularjs.demo.stepdefinitions.api;

import com.serenitybdd.angularjs.demo.steps.api.CountriesSearchSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class SearchCountriesStepDefinitions {
    @Steps
    CountriesSearchSteps countriesSearchSteps;

    @When("I search with ISO code '<isoCode>'")
    public void whenISearchWithIsoCode(String isoCode){
        countriesSearchSteps.searchCountryByCode(isoCode);
    }

    @Then("I get a success response with HTTP code '<httpCode>'")
    public void thenIGetASuccessResponseWithHttpCode(String httpCode){
        countriesSearchSteps.searchIsExecutedSuccesfullyWithHttpCode(httpCode);
    }

    @Then("the country name is '<countryName>'")
    public void thenTheCountryNameIsDisplayed(String countryName){
        countriesSearchSteps.countryNameShouldEqual(countryName.trim());
    }
}

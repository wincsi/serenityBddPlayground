package com.serenitybdd.angularjs.demo.tests.api;

import com.serenitybdd.angularjs.demo.steps.api.CountriesSearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(SerenityRunner.class)
public class CountriesSearchTest {

    @Steps
    CountriesSearchSteps countriesSearchSteps;

    @Test
    public void findUnitedStatesByIsoCode(){
        countriesSearchSteps.searchCountryByCode("US");
        countriesSearchSteps.searchIsExecutedSuccesfully();
        countriesSearchSteps.iShouldFindCountry("United States of America");
    }

    @Test
    public void findIndiaByIsoCode(){
        countriesSearchSteps.searchCountryByCode("IN");
        countriesSearchSteps.searchIsExecutedSuccesfully();
        countriesSearchSteps.iShouldFindCountry("India");
    }

    @Test
    public void findBrazilByIsoCode(){
        countriesSearchSteps.searchCountryByCode("BR");
        countriesSearchSteps.searchIsExecutedSuccesfully();
        countriesSearchSteps.iShouldFindCountry("Brazil");
    }
}

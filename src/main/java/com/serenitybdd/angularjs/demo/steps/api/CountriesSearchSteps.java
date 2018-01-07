package com.serenitybdd.angularjs.demo.steps.api;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.Matchers.is;

public class CountriesSearchSteps {
    private final String ISO_CODE_SEARCH = "http://services.groupkt.com/country/get/iso2code/";
    private Response response;

    @Step
    public void searchCountryByCode(String code){
        response = SerenityRest.when().get(ISO_CODE_SEARCH + code);
    }

    @Step
    public void searchIsExecutedSuccesfullyWithHttpCode(String httpCode){
        response.then().statusCode(Integer.parseInt(httpCode));
    }

    @Step
    public void countryNameShouldEqual(String country){
        response.then().body("RestResponse.result.name", is(country));
    }
}

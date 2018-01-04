package com.serenitybdd.angularjs.demo.tests.api;

import io.restassured.RestAssured;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class CountriesSearchTests {

    @Test
    public void findUnitedStatesByIsoCode(){
        RestAssured
                .when()
                .get("http://services.groupkt.com/country/get/iso2code/US")
                .then().assertThat().statusCode(200)
                .and().body("RestResponse.result.name",is("United States of America"));
    }

    @Test
    public void findIndiaByIsoCode(){
        RestAssured
                .when()
                .get("http://services.groupkt.com/country/get/iso2code/IN")
                .then().assertThat().statusCode(200)
                .and().body("RestResponse.result.name",is("India"));
    }

    @Test
    public void findBrazilByIsoCode(){
        RestAssured
                .when()
                .get("http://services.groupkt.com/country/get/iso2code/BR")
                .then().assertThat().statusCode(200)
                .and().body("RestResponse.result.name",is("Brazil"));
    }
}

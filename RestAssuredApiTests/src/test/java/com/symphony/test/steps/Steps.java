package com.symphony.test.steps;

import com.symphony.test.models.RestResponse;
import com.symphony.test.service.Service;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.json.JSONArray;

import java.io.IOException;

public class Steps {
    Service service;
    Response response;

    public Steps() throws IOException {
        service = new Service();
    }

    @When("^I send get countries request$")
    public void i_sent_get_countries_request() throws Throwable {
        response = service.getCountries();
    }

    @Then("^Afganistan is the first country in a row$")
    public void afganistan_is_first() {
        ValidatableResponse resp = response.then().assertThat().statusCode(200);
        RestResponse response = resp.extract().as(RestResponse.class);
        System.out.println(response.getRestResponse());

    }
}

package com.symphony.test.service;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Service {
    public Response getCountries() {
        RequestSpecification req = RestAssured.given();
        req.baseUri("http://services.groupkt.com/country/get/all");
        Response response = req.when().get();
        return response;
    }
}

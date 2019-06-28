package com.symphony.test.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.json.JSONString;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RestResponse {
    JSONString RestResponse;

    public JSONString getRestResponse() {
        return RestResponse;
    }
}
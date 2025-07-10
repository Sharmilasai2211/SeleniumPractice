package org.example;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GETRequest {

    @Test
    public void getExample(){
        RestAssured.baseURI="https://demoqa.com/BookStore/v1/Books";
        RequestSpecification req = RestAssured.given();
        req.contentType("application/json");
        req.contentType(ContentType.JSON);
        req.auth().basic("","");
        Response res = req.get("");
//        res.jsonPath().g
//        res.he
        System.out.println(res.getStatusCode());
    }
}

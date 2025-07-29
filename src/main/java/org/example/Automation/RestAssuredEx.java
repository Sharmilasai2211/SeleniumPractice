package org.example.Automation;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

class PojoClass{

    String getName(){
        return null;
    }
}

public class RestAssuredEx {

    public static void main(String[] args) {

        RestAssured.baseURI = "https://www.eample.com";
        RequestSpecification req = given();

        req.headers("Content-Type", "application/json");
        Response res = req.auth().basic("username", "password").get("/users/1");

        PojoClass pojo = res.as(PojoClass.class);

        Assert.assertEquals(pojo.getName(), "Sharmila");

        given().when().get("").then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath(""));
        given().when().then().statusCode(200).body("page",equalTo(""));
    }
}

package org.example;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.Method;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class RADemo {
    final static String url = "https://dummy.restapiexample.com/api/v1/";
    public final String requestBody = "{\n" +
            "    \"userId\": 1,\n" +
            "    \"id\": 1,\n" +
            "    \"title\": \"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\",\n" +
            "    \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\n" +
            "  }";
    @Test
    public void postMethod(){
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
        RequestSpecification req = RestAssured.given();
        req.contentType("application/json");
        req.body(requestBody);
        Response res = req.contentType("application/json")
                .body(requestBody)
                .request(Method.POST,"posts");
        System.out.println(res.getStatusCode());

    }
}

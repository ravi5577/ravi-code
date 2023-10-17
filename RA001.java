package org.example.oct15.restassured;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.nio.file.attribute.GroupPrincipal;

public class RA001 {
    @Test(groups = {"positive"})

    public void getrequest_Positive(){
        RestAssured.given().baseUri("https://restful-booker.herokuapp.com/ping")
                .when().get().then().log().all().statusCode(201);
    }
    @Test(groups = {"negative"})
    public void getrequest_Negative(){
        RestAssured.given().baseUri("https://restful-booker.herokuapp.com/ping")
                .when().get().then().log().all().statusCode(200);
    }
}

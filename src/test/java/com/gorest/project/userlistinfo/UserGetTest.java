package com.gorest.project.userlistinfo;


import com.gorest.project.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UserGetTest extends TestBase {

    @Test
    public void getAllUserList() {


        Response response = given()
                .when()
                .get("/public/v2");
        response.prettyPrint();
        response.then().statusCode(404);

}






}

package com.gorest.project.userlistinfo;

import com.gorest.project.model.UserPojo;
import com.gorest.project.testbase.TestBase;
import com.gorest.project.utils.TestUtils;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UserPatchTest extends TestBase {

    @Test
    public void verifyUserUpdateSuccessfully() {

        String name = "user1" + "Updated";
        String email = TestUtils.getRandomValue() + "user12@gmail.com";
        String gender = "female";
        String status = "active";

        int storeId = 7595947;
        UserPojo userPojo = new UserPojo();

        userPojo.setName(name);
        userPojo.setEmail(email);
        userPojo.setGender(gender);
        userPojo.setStatus(status);

        Response response = given()
                .contentType(ContentType.JSON)
                .pathParam("id", storeId)
                .header("Authorization", "Bearer a4805c7c5cda603b60345e721f166223ec510ce5c21e457586a3e20739d66d85")
                .header("Content-Type", "application/json")
                .header("Connection", "keep-alive")
                .when()
                .body(userPojo)
                .put("/users/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
}


}

package com.gorest.project.testbase;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

/**
 * Created by Jay Vaghani
 */
public class TestBase {


    @BeforeClass
    public void inIt(){
        RestAssured.baseURI = "https://gorest.co.in/";
        //RestAssured.port = 8080;
        RestAssured.basePath = "/public/v2/users";
    }

}
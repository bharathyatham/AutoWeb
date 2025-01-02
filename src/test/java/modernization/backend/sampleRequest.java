package modernization.backend;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class sampleRequest 
{
    public static void main(String[] args) {
        // Base URI
        RestAssured.baseURI = "http://samplerestapi.com/api";
        // Make GET request
        Response response = RestAssured.given().get("/petslover/17239");
        // Print response
        response.prettyPrint();
        // Validate response
         int statusCode = response.getStatusCode();
         System.out.println(statusCode);
        //Assert.assertEquals(200, response.getStatusCode());
       // Assert.assertEquals("application/json; charset=utf-8", response.getHeader("Content-Type"));
       // Assert.assertTrue(response.getBody().asString().contains("userId"));
    }
}
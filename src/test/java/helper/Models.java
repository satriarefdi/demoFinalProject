package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Models {

    private static RequestSpecification request;

    public static void setupHeaders(){
        request = RestAssured.given()
                .header("Content-Type","application/json")
                .header( "Accept", "application/json")
                .header( "Authorization",  "Bearer 870f011b6449d643f00104825c70d73af8a3dc514393008419f97fcfccf2a71f");
    }


    public static Response getListUsers(String endpoint) {
        System.out.println("Endpoint yang dilempar : " + endpoint);
        setupHeaders();
        return request.when().get(endpoint);
    }
}

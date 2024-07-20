package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Models {

    private static RequestSpecification request;

    public static void setupHeaders(){
        request = RestAssured.given()
                .header( headerName: "Content-Type", headerValue: "application/json");
                .header( headerName: "Accept", headerValue: "application/json");
                .header(headerName: "Authorization", headerValue: "Bearer 870f011b6449d643f00104825c70d73af8a3dc514393008419f97fcfccf2a71f");
    }


    public static Response getListUsers(String endpoint) {
        System.out.println("Endpoint yang dilempar : " + endpoint);
        setupHeaders();
        return request.when().get(endpoint);
    }
}

}

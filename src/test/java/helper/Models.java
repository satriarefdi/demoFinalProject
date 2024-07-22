package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static helper.Utility.generateRandomEmail;

public class Models {

    private static RequestSpecification request;

    public static void setupHeaders() {
        request = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Authorization", "Bearer 870f011b6449d643f00104825c70d73af8a3dc514393008419f97fcfccf2a71f");

    }
    public static Response getListUsers(String endpoint) {
        setupHeaders();
        return request.when().get(endpoint);
    }

    public static Response postCreateUser(String endpoint){
        String name = "Pres. Arya Pandey";
        String gender = "female";
        String email = generateRandomEmail();
        String status = "active";
        JSONObject payload = new JSONObject();
        payload.put("name", name);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("status", status);

        setupHeaders();
        return request.body(payload.toString()).when().post(endpoint);

    }
}



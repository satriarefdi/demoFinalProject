package pages;

import helper.Endpoint;
import helper.Utility;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

import java.io.File;
import java.util.List;

import static helper.Models.getListUsers;
import static helper.Models.postCreateUser;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ApiPage {

    String setURL;

    Response res;

    public void prepareURLFor(String url){

    }

    public void hitApiGetListUsers() {

        res = getListUsers(setURL);
    }

    public void hitApiPostCreateUser() {

        res = postCreateUser(setURL);
        System.out.println(res.getBody().asString());
    }

    public void validationStatusCodeIsEquals(int status_code){

        assertThat(res.statusCode()).isEqualTo(status_code);
    }

    public void validationResponseBodyGetListUsers(){

    }

    public void validationResponseJsonWithJSONSchema(String filename){

    }


}


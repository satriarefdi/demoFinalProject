package pages;

import helper.Endpoint;
import io.restassured.response.Response;

import static helper.Models.getListUsers;

public class ApiPage {

    String setURL;

    Response res;

    public void prepareURLFor(String url){
        switch (url) {
            case "GET_LIST_USERS":
                setURL = Endpoint.GET_LIST_USERS;
                break;
            case "CREATE_NEW_USERS":
                setURL = Endpoint.CREATE_NEW_USERS;
                break;
            case "DELETE_USERS":
                setURL = Endpoint.DELETE_USERS;
                break;
            default:
                System.out.println("input right url");
        }
        System.out.println("Endpoint siap pakai adalah : " + setURL);
    }

    public void hitApiGetListUsers() {
      res = getListUsers(setURL);
        System.out.println(res.getBody().asString());
    }

    public void validationStatusCodeIsEquals(){
        System.out.println("step form page : 3 " );
    }

    public void validationResponseBodyGetListUsers(){
        System.out.println("step form page : 4 " );
    }
    public void validationResponseJsonWithJSONSchema(){
        System.out.println("step form page : 5 " );
    }


}


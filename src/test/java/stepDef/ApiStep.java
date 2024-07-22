package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ApiPage;

public class ApiStep {

    ApiPage apiPage;

    public ApiStep() {
        this.apiPage = new ApiPage();
    }


    @Given("prepare url for {string}")
    public void prepareUrlFor(String url) {
        apiPage.prepareURLFor(url);
    }

    @And("hit api get list users")
    public void hitApiGetListUsers() {
        apiPage.hitApiGetListUsers();

    }

    @Then("validation status code is equals {int}")
    public void validationStatusCodeIsEquals(int status_code) {

        apiPage.validationStatusCodeIsEquals(status_code);
    }


    @Then("validation response body get list users")
    public void validationResponseBodyGetListUsers() {
        apiPage.validationResponseBodyGetListUsers();
        
    }

    @Then("validation response json with JSONSchema {string}")
    public void validationResponseJsonWithJSONSchema(String filename) {

        apiPage.validationResponseJsonWithJSONSchema(filename);
    }

    @And("hit api post create new user")
    public void hitApiPostCreateNewUser() {
        apiPage.hitApiPostCreateUser();
    }
}
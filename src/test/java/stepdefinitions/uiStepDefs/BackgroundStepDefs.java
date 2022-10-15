package stepdefinitions.uiStepDefs;

import io.cucumber.java.en.*;
import utilities.ConfigReader;
import utilities.Driver;

public class BackgroundStepDefs {

    @Given("user opens the URL medunna")
    public void user_opens_the_url_medunna() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));

    }
    @Then("verify the page title contains {string}")
    public void verify_the_page_title_contains(String string) {

    }


}

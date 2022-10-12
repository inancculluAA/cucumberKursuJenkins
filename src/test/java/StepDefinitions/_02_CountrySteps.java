package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _02_CountrySteps {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @And("Navigate to country page")
    public void navigateToCountryPage() {
        ln.findAndClick("setupOne"); // Setup Click
        ln.findAndClick("parameters"); // Parameters Click
        ln.findAndClick("Countries"); // Countries Click
    }

    @When("Create a country")
    public void createACountry() {

        String randomGenName = RandomStringUtils.randomAlphabetic(8);
        String randomGenCode = RandomStringUtils.randomAlphabetic(4);

        dc.findAndClick("addButton");
        dc.findAndSend("Name",randomGenName);
        dc.findAndSend("Code",randomGenCode);
        dc.findAndClick("Save");

    }
    @Then("Success massage should be displayed")
    public void successMessageShouldBeDisplayed() {

        dc.findAndContainsText("successMessage","success");
    }

    @When("Create a country Name as {string} Code as {string}")
    public void createACountryNameAsCodeAs(String name, String code) {
        dc.findAndClick("addButton");
        dc.findAndSend("Name",name);
        dc.findAndSend("Code",code);
        dc.findAndClick("Save");

    }
}

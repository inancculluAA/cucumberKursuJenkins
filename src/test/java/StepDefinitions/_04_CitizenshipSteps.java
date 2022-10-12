package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _04_CitizenshipSteps {

    DialogContent dc=new DialogContent();
    @And("Navigate to Citizenship page")
    public void navigateToCitizenshipPage() {
        LeftNav ln=new LeftNav();
        ln.findAndClick("setupOne");
        ln.findAndClick("parameters");
        ln.findAndClick("citizenShip");

    }
    @When("User a Citizenship name as {string} shortname as {string}")
    public void userACitizenshipNameAsShortNameAs(String name, String shortName) {
        dc.findAndClick("addButton");
        dc.findAndSend("Name",name);
        dc.findAndSend("shortName",shortName);
        dc.findAndClick("Save");

    }
    @Then("Already exist massage should be displayed")
    public void alreadyExistMassageShouldBeDisplayed() {

        dc.findAndContainsText("alreadyExist","already exists");
    }
    @And("Click on close button")
    public void clickOnCloseButton() {
        dc.findAndClick("closeDialog");
    }

    @When("User delete the {string}")
    public void userDeleteThe(String arananKelime) {
        dc.searchAndDelete(arananKelime);

    }
}

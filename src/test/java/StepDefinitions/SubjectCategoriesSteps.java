package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class SubjectCategoriesSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    FormContent fc = new FormContent();

    @And("Click on the element in the left Nav1")
    public void clickOnTheElementInTheLeftNav1(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            ln.findAndClick(listElement.get(i));
        }
    }

    @And("Click on the element in the Dialog1")
    public void clickOnTheElementInTheDialog1(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("User sending the keys in Dialog content1")
    public void userSendingTheKeysInDialogContent1(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
            //listin ilk elemanına(weblement adı), ikinci elemanını yanş değeri döner
        }
    }

    @And("User delete item from Dialog1")
    public void userDeleteItemFromDialog1(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.searchAndDelete(listElement.get(i));
        }


    }

    @And("Success massage should be displayed1")
    public void successMassageShouldBeDisplayed1() {
        dc.findAndContainsText("successMessage", "success");
    }


    @And("User edit item from Dialog")
    public void userEditItemFromDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.SearchAndEdit(listElement.get(i));
        }
    }
}

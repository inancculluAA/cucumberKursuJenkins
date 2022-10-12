package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent {
    public FormContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//mat-form-field[@formgroupname='academicPeriod']//span")
    private WebElement academicPeriod;
    @FindBy(xpath = "//mat-option[@role='option']//span")
    private WebElement academicPeriod1;
    @FindBy(xpath = "(//mat-select[@role='combobox'])[2]")
    private WebElement gradeLevel;
    @FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
    private WebElement gradeLevel2;
    @FindBy(xpath = "//mat-form-field[@fxlayoutgap='8px']//input")
    private WebElement extranceName;
    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;
    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;
    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogButton;

    WebElement myElement;
    public void findAndSend(String strElement, String value) {

        switch (strElement) {
           case "extranceName":  myElement = extranceName; break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "academicPeriod": myElement = academicPeriod; break;
            case "academicPeriod1": myElement = academicPeriod1; break;
            case "gradeLevel": myElement = gradeLevel; break;
            case "gradeLevel2": myElement = gradeLevel2; break;
            case "searchButton": myElement = searchButton; break;
            case "deleteButton": myElement = deleteButton; break;
            case "deleteDialogButton": myElement = deleteDialogButton; break;
        }
        clickFunction(myElement);
    }
    public void searchAndDelete(String searchText) {
        findAndSend("extranceName", searchText);
        findAndClick("searchButton");
        waitUntilLoading();
        findAndClick("deleteButton");
        findAndClick("deleteDialogButton");

    }
}


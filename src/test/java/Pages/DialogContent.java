package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;
    @FindBy(id = "mat-input-1")
    private WebElement password;
    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;
    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement Name;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement Code;
    @FindBy(xpath = "//ms-save-button//button")
    private WebElement Save;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;
    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;
    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;
    @FindBy(xpath = "//ms-text-field[contains(@placeholder,'FIELD.NAME')]//input")
    private WebElement searchInput;
    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;
    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;
    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    private WebElement integrationCode;
    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priority;
    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='firstName']//input")
    private WebElement firstname;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='lastName']//input")
    private WebElement lastname;
    @FindBy(xpath = "//ms-edit-button//button")                         // common
    private WebElement SubjectEditButton;
    @FindBy(xpath = "//tbody/tr/td[2]")
    public List<WebElement> nameList;


    WebElement myElement;

    public void findAndSend(String strElement, String value) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "username":
                myElement = username;
                break;
            case "password":
                myElement = password;
                break;
            case "Name":
                myElement = Name;
                break;
            case "Code":
                myElement = Code;
                break;
            case "shortName":
                myElement = shortName;
                break;
            case "searchInput":
                myElement = searchInput;
                break;
            case "integrationCode":
                myElement = integrationCode;
                break;
            case "priority":
                myElement = priority;
                break;
            case "firstname":
                myElement = firstname;
                break;
            case "lastname":
                myElement = lastname;
                break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "loginButton":
                myElement = loginButton;
                break;
            case "addButton":
                myElement = addButton;
                break;
            case "Save":
                myElement = Save;
                break;
            case "closeDialog":
                myElement = closeDialog;
                break;
            case "searchButton":
                myElement = searchButton;
                break;
            case "deleteButton":
                myElement = deleteButton;
                break;
            case "deleteDialogButton":
                myElement = deleteDialogButton;
                break;
            case "acceptCookies":
                myElement = acceptCookies;
                break;
            case "SubjectEditButton":
                myElement = SubjectEditButton;
                break;
        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "dashboard":
                myElement = dashboard;
                break;
            case "successMessage":
                myElement = successMessage;
                break;
            case "alreadyExist":
                myElement = alreadyExist;
                break;
        }
        verifyContainsText(myElement, text);
    }

    public void searchAndDelete(String searchText) {
        findAndSend("searchInput", searchText); //aranacak kelimeyi kutucuğa gönder
        findAndClick("searchButton"); // arama butonuna bas

        waitUntilLoading();
//        GWD.Bekle(2); //Todo incelenecek

        findAndClick("deleteButton");  // silme butonuna bas
        findAndClick("deleteDialogButton"); //dialogdaki silme butonuna bas

    }

    public void SearchAndEdit(String searchText) // 2. aşama
    {
        findAndSend("searchInput", searchText); // aranacak kelimeyi kutucuğa gönder
        findAndClick("searchButton"); // arama butonuna bas
        GWD.Bekle(3);
//        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.stalenessOf(deleteButton));

        findAndClick("SubjectEditButton"); // silme butonuna bas
    }

}
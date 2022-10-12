package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement setupOne;
    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;
    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement Countries;
    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement citizenShip;
    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;
    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement Fees;
    @FindBy(xpath = "//span[text()='Entrance Exams']")
    private WebElement EntranceExams;
    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement EntranceExamsSetup;
    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement EntranceExams2;
    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement HumanResources;
    @FindBy(xpath = "//span[text()='Employees']")
    private WebElement Employees;
    @FindBy(xpath = "//span[text()='Education']")
    private WebElement Education;
    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement EducationSetup;
    @FindBy(xpath = "(//span[text()='Subject Categories'])")
    private WebElement SubjectCategories;
    @FindBy(xpath = "//span[text()='States']")
    private WebElement States;

    WebElement myElement;
    public void findAndClick(String strElement){

        switch (strElement)
        {
            case "setupOne" : myElement =setupOne; break;
            case "parameters" : myElement =parameters; break;
            case "Countries" : myElement =Countries; break;
            case "citizenShip" : myElement =citizenShip; break;
            case "nationalities" : myElement =nationalities; break;
            case "Fees" : myElement = Fees; break;
            case "EntranceExams" : myElement = EntranceExams; break;
            case "EntranceExamsSetup" : myElement = EntranceExamsSetup; break;
            case "EntranceExams2" : myElement = EntranceExams2; break;
            case "HumanResources" : myElement = HumanResources; break;
            case "Employees" : myElement = Employees; break;
            case "Education" : myElement = Education; break;
            case "EducationSetup" : myElement = EducationSetup; break;
            case "SubjectCategories" : myElement = SubjectCategories; break;
            case "States" : myElement = States; break;

        }
        clickFunction(myElement);
    }

}

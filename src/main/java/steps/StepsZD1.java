package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.util.concurrent.TimeUnit;

public class StepsZD1 {
    private WebDriver driver;
    @Given("Registered User  is on {string} website")
    public void registeredUserIsOnWebsite(String arg0) {


        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(" https://mystore-testlab.coderslab.pl");
    }

    @When("Registered User clicks Sign In tile")
    public void registeredUserClicksSignInTile() {
        TopMenuPage onTopMenuPage = new TopMenuPage(driver);
        onTopMenuPage.clickOnSignInTile();
    }

    @And("Registered User put email and password")
    public void registeredUserPutEmailAndPassword() {
        LogInToYourAccountPage onLogInToYourAccountPage = new LogInToYourAccountPage(driver);
        onLogInToYourAccountPage.fillLoginDataAndSubmit();
    }

    @And("Loged User clicks Addresses tile")
    public void logedUserClicksAddressesTile() {
        YourAccountPage onYourAccountPage = new YourAccountPage(driver);
        onYourAccountPage.clickAddressesTile();
    }

    @And("Loged User clicks on create new address tile")
    public void logedUserClicksOnCreateNewAddressTile() {
        YourAddressesPage onYourAddressesPage = new YourAddressesPage(driver);
        onYourAddressesPage.clickOnCreateNewAddress();
    }

    @And("fills fields {string}, {string}, {string}, {string}, {string}, {string}")
    public void fillsFields(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {
        NewAddressPage onNewAddressPage = new NewAddressPage(driver);
        onNewAddressPage.fillBarsOnNewAddressPage(arg0,arg1,arg2,arg3,arg4,arg5);
    }

    @And("Loged USer click on Save button")
    public void logedUSerClickOnSaveButton() {
        NewAddressPage onNewAddressPage1 = new NewAddressPage(driver);
        onNewAddressPage1.clickButtonSave();
    }

    @Then("verifies if added data is correct {string}, {string}, {string}, {string}, {string}, {string}")
    public void verifiesIfAddedDataIsCorrect(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {
        YourAddressesPage onYourAddressesPage = new YourAddressesPage(driver);
        onYourAddressesPage.addressConfirmation1(arg0,arg1,arg2,arg3,arg4,arg5);
    }

    @Then("delete new adress")
    public void deleteNewAdress() {

        YourAddressesPage onYourAddressesPage = new YourAddressesPage(driver);
        onYourAddressesPage.deleteButton();
    }

    @And("Validate deleting")
    public void validateDeleting() {

        YourAddressesPage onYourAddressesPage = new YourAddressesPage(driver);
        onYourAddressesPage.confiramtionAboutDeleting();
    }
}

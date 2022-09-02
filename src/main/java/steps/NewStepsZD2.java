package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class NewStepsZD2 {

    private WebDriver driver;

    @Given("Registered User  is on https:\\/\\/mystore-testlab.coderslab.pl website")
    public void registeredUserIsOnHttpsMystoreTestlabCoderslabPlWebsite() {


//        System.setProperty("webdriver.gecko.driver",
//            "src/main/resources/drivers/geckodriver.exe");
//        driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get(" https://mystore-testlab.coderslab.pl");

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(" https://mystore-testlab.coderslab.pl");
    }

    @When("User log in into shop by Sign In tile and put test data into dedicated bars [email: koza@koza.pl pass: kozaa]")
    public void userLogInIntoShopBySignInTileAndPutTestDataIntoDedicatedBarsEmailKozaKozaPlPassKozaa() {

        TopMenuPage onTopMenuPage = new TopMenuPage(driver);
        onTopMenuPage.clickOnSignInTile();

        LogInToYourAccountPage onLogInToYourAccountPage = new LogInToYourAccountPage(driver);
        onLogInToYourAccountPage.fillLoginDataAndSubmit();
    }

    @And("User choose HummingBird Printed Sweater")
    public void userChooseHummingBirdPrintedSweater() {
        TopMenuPage onTopMenuPage = new TopMenuPage(driver);
        onTopMenuPage.clickOnClothesTile();

        ClothesPage onClothesPage = new ClothesPage(driver);
        onClothesPage.clickOnHummPrtSwe();

    }

    @And("User choose size M")
    public void userChooseSizeM() {
        HummPrtSweItemID1Page onHummPrtSweItemID1Page = new HummPrtSweItemID1Page(driver);
        onHummPrtSweItemID1Page.chooseSize();

        HummPrtSweItemID1Page onHummPrtSweItemID1Page1 = new HummPrtSweItemID1Page(driver);
        onHummPrtSweItemID1Page1.checkDiscount();
    }

    @And("User choose {int} pcs")
    public void userChoosePcs(int arg0) throws InterruptedException {
        HummPrtSweItemID1Page onHummPrtSweItemID1Page = new HummPrtSweItemID1Page(driver);
        onHummPrtSweItemID1Page.chooseAmount();
    }


    @Then("User put articles into cart")
    public void userPutArticlesIntoCart() {
        HummPrtSweItemID1Page onHummPrtSweItemID1Page = new HummPrtSweItemID1Page(driver);
        onHummPrtSweItemID1Page.setClickAddToCart();
    }

    @And("User go to checkout")
    public void userGoToCheckout() {
        SuccsesAddPopUp onSuccsesAddPopUp = new SuccsesAddPopUp(driver);
        onSuccsesAddPopUp.proceedToCheckout();

        ShoppingCartPage onShoppingCartPage = new ShoppingCartPage(driver);
        onShoppingCartPage.clickProceedToCheckout2();
    }

    @And("User confirm address")
    public void userConfirmAddress() {


        PersonalInformationPage personalInformationPage1 = new PersonalInformationPage(driver);
        personalInformationPage1.continueButton();
    }

    @Then("User choose shipping method {string}")
    public void userChooseShippingMethod(String arg0) {
        ShippingMethodPage onShippingMethodPage1 = new ShippingMethodPage(driver);
        onShippingMethodPage1.optionPickUpInStore();

        ShippingMethodPage onShippingMethodPage = new ShippingMethodPage(driver);
        onShippingMethodPage.confirmationShippingMethod();
    }

    @And("User choose payment {string}")
    public void userChoosePayment(String arg0) {
        PaymentPage onPaymentPage = new PaymentPage(driver);
        onPaymentPage.paymentPayByCheckoption();
    }

    @And("User click on {string}")
    public void userClickOn(String arg0) {
        PaymentPage onPaymentPage = new PaymentPage(driver);
        onPaymentPage.checkTermsOfService();

        PaymentPage ononPaymentPage1 = new PaymentPage(driver);
        ononPaymentPage1.paymentConfirmation();
    }

    @And("User make PrtSc with order confirmation with the amount.")
    public void userMakePrtScWithOrderConfirmationWithTheAmount() throws IOException {

        OrderIsConfirmedPage onOrderIsConfirmedPage = new OrderIsConfirmedPage(driver);
        onOrderIsConfirmedPage.confiramtionPrintScreen();
    }


}


package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourAddressesPage {

    public WebDriver driver;

    public YourAddressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnCreateNewAddress() {
        WebElement clickOnCreateNewAddress = driver.findElement(By.xpath("//a[@data-link-action='add-address']"));
        clickOnCreateNewAddress.click();
    }

    public void addressConfirmation1(String alias, String address, String postcode, String city, String country, String phone) {
        System.out.println("\n");
        System.out.println("Data Address Test");

        if (driver.getPageSource().contains("Address successfully added!")) {
            System.out.println(ANSI_GREEN_BACKGROUND + "Text about success is present." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED_BACKGROUND + "Text about success is absent" + ANSI_RESET);
        }

        if (driver.getPageSource().contains(alias)) {
            System.out.println(ANSI_GREEN_BACKGROUND + "New Alias is present" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED_BACKGROUND + "New Alias is absent" + ANSI_RESET);
        }

        if (driver.getPageSource().contains(address)) {
            System.out.println(ANSI_GREEN_BACKGROUND + "New Address is present" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED_BACKGROUND + "New Address is absent" + ANSI_RESET);
        }

        if (driver.getPageSource().contains(city)) {
            System.out.println(ANSI_GREEN_BACKGROUND + "New City is present." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED_BACKGROUND + "New City is absent." + ANSI_RESET);
        }

        if (driver.getPageSource().contains(postcode)) {
            System.out.println(ANSI_GREEN_BACKGROUND + "New Postcode is present." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED_BACKGROUND + "New Postcode is absent." + ANSI_RESET);
        }

        if (driver.getPageSource().contains(country)) {
            System.out.println(ANSI_GREEN_BACKGROUND + "New Country is present" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED_BACKGROUND + "Text is absent" + ANSI_RESET);
        }

        if (driver.getPageSource().contains(phone)) {
            System.out.println(ANSI_GREEN_BACKGROUND + "New Phone Number is present" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED_BACKGROUND + "New Phone Number is absent" + ANSI_RESET);
        }

    }

    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_RESET = "\u001B[0m";


    public void deleteButton() {

        WebElement buttonDelete = driver.findElement(By.xpath("//*[text() = 'Delete']"));
        buttonDelete.click();
    }

    public void confiramtionAboutDeleting() {
        System.out.println("\n");
        System.out.println("Delete Address Test");
        if (driver.getPageSource().contains("Address successfully deleted!")) {
            System.out.println(ANSI_GREEN_BACKGROUND + "Text about success of delete is present." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED_BACKGROUND + "Text about success of delete is absent" + ANSI_RESET);
        }
    }
}
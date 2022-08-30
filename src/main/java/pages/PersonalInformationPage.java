package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonalInformationPage {

    private WebDriver driver;

    public PersonalInformationPage(WebDriver driver) {
        this.driver = driver;
    }
//    public void confirmAddressButton(){
//        WebElement confirmAddressButton = driver.findElement(By.xpath("//input[@value='28097']"));
//        confirmAddressButton.click();
//    }

    public void continueButton(){
        WebElement continueButton = driver.findElement(By.xpath("//button[@name='confirm-addresses']"));
        continueButton.click();

    }
}

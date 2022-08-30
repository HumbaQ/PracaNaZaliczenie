package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShippingMethodPage {

    private WebDriver driver;

    public ShippingMethodPage(WebDriver driver) {
        this.driver = driver;
    }

    public void confirmationShippingMethod(){
        WebElement continueButton = driver.findElement(By.xpath("//button[@name='confirmDeliveryOption']"));
        continueButton.click();

    }

    public void optionPickUpInStore(){
        WebElement prestaShop = driver.findElement(By.xpath("//label[@for='delivery_option_1']"));
        prestaShop.click();

    }
}

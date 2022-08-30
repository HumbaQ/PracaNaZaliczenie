package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {

    private WebDriver driver;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void paymentPayByCheckoption() {
        WebElement optionPBC = driver.findElement(By.xpath("//label[@for='payment-option-1']"));
        optionPBC.click();
    }

    public void checkTermsOfService(){
        WebElement checkTermsOfService = driver.findElement(By.id("conditions_to_approve[terms-and-conditions]"));
        checkTermsOfService.click();
    }

    public void paymentConfirmation(){
       WebElement paymentConfirmation = driver.findElement(By.xpath("//button[@class='btn btn-primary center-block']"));
       paymentConfirmation.click();

    }


}

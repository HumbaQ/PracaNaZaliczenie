package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SuccsesAddPopUp {

    private WebDriver driver;

    public SuccsesAddPopUp(WebDriver driver) {
        this.driver = driver;
    }

//    public void proceedToCheckout(){
//        WebElement goToCheckout = driver.findElement(By.xpath("//button[@data-dismiss='modal']"));
//        goToCheckout.click();
//
//    }

//    public void proceedToCheckout() {
//        WebElement goToCheckout = driver.findElement(By.cssSelector("[class='header']"));
//       goToCheckout.click();
//
//    }

    public void proceedToCheckout() {
        WebElement goToCheckout = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        goToCheckout.click();

    }

}

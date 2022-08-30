package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage {

    private WebDriver driver;

    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickProceedToCheckout2(){
        WebElement goToCheckout2 = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
       goToCheckout2.click();

    }
}

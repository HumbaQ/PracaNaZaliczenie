package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClothesPage {
    private WebDriver driver;

    public ClothesPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnHummPrtSwe (){
        WebElement clickOnHummPrtSwe = driver.findElement(By.xpath("//article[@data-id-product='2']"));
        clickOnHummPrtSwe.click();
    }
}

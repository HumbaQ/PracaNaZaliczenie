package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopMenuPage {

    private WebDriver driver;

    public TopMenuPage(WebDriver driver) {
        this.driver = driver;
    }


        public void clickOnSignInTile () {
            WebElement signInButton = driver.findElement(By.id("_desktop_user_info"));
            signInButton.click();
        }

        public void clickOnClothesTile() {
            WebElement clothesButton = driver.findElement(By.id("category-3"));
            clothesButton.click();
        }


    }


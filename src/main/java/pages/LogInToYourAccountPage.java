package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInToYourAccountPage {
    private WebDriver driver;

    public LogInToYourAccountPage(WebDriver driver) {
        this.driver = driver;
    }
    public void fillLoginDataAndSubmit(){
        WebElement loginEmail = driver.findElement(By.name("email"));
        WebElement loginPassword = driver.findElement(By.name("password"));
        WebElement buttonSignIn = driver.findElement(By.id("submit-login"));


        loginEmail.click();
        loginEmail.clear();
        loginEmail.sendKeys("koza@koza.pl");

        loginPassword.click();
        loginPassword.clear();
        loginPassword.sendKeys("kozaa");

        buttonSignIn.click();


    }
}
